package org.celery.bilibili

import Progressable
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.utils.io.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.celery.bilibili.model.Response
import org.celery.bilibili.model.vidoes.info.VideoBasicInfo
import org.celery.bilibili.model.vidoes.stream.VideoPlayUrl
import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption


val String.replaceIllegal: String
    get() {
        return Regex("[/\\\\:*?\"<>|]").replace(this, "_")
    }

suspend fun BiliClient.videoInfo(bvid: String? = null, aid: Long? = null): Response<VideoBasicInfo> {
    return client.get(Constants.VIDEO_BASIC_INFO) {
        if (bvid != null)
            parameter("bvid", bvid)
        if (aid != null)
            parameter("aid", aid)
    }.body()
}

suspend fun BiliClient.videoPlayUrl(
    bvid: String? = null,
    aid: Long? = null,
    cid: Long,
    fnver: Int = 0,
    fourk: Boolean = true,
    fnval: Int = 16 or 128
): Response<VideoPlayUrl> {
    val body = client.get(Constants.VIDEO_PLAY_URL) {
        if (bvid != null)
            parameter("bvid", bvid)
        if (aid != null)
            parameter("aid", aid)
        parameter("cid", cid)
        parameter("fnver", fnver)
        if (fourk)
            parameter("fourk", 1)//allow 4K
        parameter("fnval", fnval)
    }.body<Response<VideoPlayUrl>>()
    return body
}


suspend fun BiliClient.downloadBiliVideo(
    bvid: String,
    baseFolder: File,
    keepCache:Boolean = false,
    saveMeta:Boolean = true
) {
    val videoInfo = videoInfo(bvid)
    val (cid, pages, title) = videoInfo.convertData {
        Triple(cid, it.pages, title)
    }
    val folder = baseFolder.resolve("[$bvid]" + title.replaceIllegal.take(255))
    folder.mkdirs()
    if (saveMeta)
        folder.resolve("meta.json").writeText(Json.Default.encodeToString(videoInfo))
    pages.forEachIndexed { index, item ->
        val (audio, video) = videoPlayUrl(bvid = bvid, cid = cid).convertData {
            Pair(defaultyQuality["audio"]!!, defaultyQuality["video"]!!)
        }
        println("download: $title => $folder")
        val fileName = ("p${index.plus(1)}_" + item.part.replaceIllegal).take(255 - 4).trim()
        val merged = folder.resolve("$fileName.mp4")
        if (merged.exists()) {
            println("existed")
            return
        }
        //download audio
        val audioFile = folder.resolve("$fileName.m4a")
        download(audio.second, audioFile, "audio")
        //download video
        val videoFile = folder.resolve("$fileName.m4s")
        download(video.second, videoFile, "video")
        merageVideo(audioFile.toPath(), videoFile.toPath(), merged.toPath())
        if (!keepCache){
            audioFile.delete()
            videoFile.delete()
        }
    }
}


suspend fun BiliClient.download(url: String, file: File, title: String = "") {
    print("prepare to download\r")
    val tmpFile = file.parentFile.resolve(file.name+".tmp")
    client.prepareGet(url).execute { httpResponse: HttpResponse ->
        val length = httpResponse.contentLength() ?: error("unknown body size")
        if (file.exists() && file.length() == length) {
            println("file existed, $title doenload stoped")
            return@execute
        }
        val channel: ByteReadChannel = httpResponse.body()
        Progressable(length.toInt(), 1) { progress ->
            tmpFile.outputStream().use { out ->
                val buffer = ByteArray(1022 * 8)
                var sum = 0
                print("downloading\r")
                while (true) {
                    val len = channel.readAvailable(buffer)
                    if (len == -1)
                        break
                    sum += len
                    progress.logger.progressing("%d %d/%d, %s".format(len, sum, length, title))
                    progress.increaseMain(len)
                    out.write(buffer, 0, len)
                }
                progress.flush()
            }
        }.apply {
            for (n in 0 until 5) {
                try {
                    start()
                    return@apply
                } catch (e: Exception) {
                    println("error occured retry %d/%d".format(n + 1, 5))
                }
            }
        }
        withContext(Dispatchers.IO) {
            Files.move(tmpFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING)
        }
    }
}
