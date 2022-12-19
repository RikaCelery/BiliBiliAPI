import TestImplement.client
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking
import org.celery.bilibili.Constants
import org.celery.bilibili.model.Response
import org.celery.bilibili.model.vidoes.info.VideoBasicInfo
import org.celery.bilibili.model.vidoes.info.VideoDetailedInfo
import org.celery.bilibili.model.vidoes.stream.VideoPlayUrl
import org.junit.jupiter.api.Test

class VideoTest {

    @Test
    fun videoBasicInfo() = runBlocking {
        client.get(Constants.VIDEO_BASIC_INFO) {
            parameter("aid", "85440373")
        }.body<Response<VideoBasicInfo>>().useData {
            println(buildString {
                append("aid: ")
                append(it.aid)
                append('\n')
                append("bvid: ")
                append(it.bvid)
                append('\n')
                append("title: ")
                append(it.title)
                append('\n')
                append("cid: ")
                append(it.cid)
                append('\n')
                append("dimension: ")
                append(it.dimension.width)
                append('x')
                append(it.dimension.height)
                append('\n')
                append("desc: ")
                append(it.desc)
                append('\n')
            })
        }
    }

    @Test
    fun videoDetailedInfo() = runBlocking {
        client.get(Constants.VIDEO_DETAILED_INFO) {
            parameter("bvid", "BV1Tx411V7v6")
        }.body<Response<VideoDetailedInfo>>().useData {
            println(buildString {
                append(it)
            })
        }
    }

    @Test
    fun videoDescInfo() = runBlocking {
        client.get(Constants.VIDEO_DESC_INFO) {
            parameter("bvid", "BV1Tx411V7v6")
        }.body<Response<String>>().useData {
            println(it)
        }
    }

    @Test
    fun videoPlayUrlDash() = runBlocking {
        client.get(Constants.VIDEO_PLAY_URL) {
            parameter("bvid", "BV1rp4y1e745")
            parameter("cid", 244954665)
            parameter("fnver", 0)
            parameter("fourk", 1)//allow 4K
            parameter("fnval", 16/*dash*/ or 128/*require 4K*/)
        }.body<Response<VideoPlayUrl>>().useData {
            println(buildString {
                append(it.acceptQuality)
                val maxVideoQuality = it.acceptQuality.maxOf { it }
                val maxAudioQuality = it.dash.audio.maxOf { it.id }
                append(maxVideoQuality)
                append('\n')
                append(maxAudioQuality)
                append('\n')
                append(it.dash.video.filter { it.id == maxVideoQuality }.ifEmpty { it.dash.video })
                append('\n')
                append(it.dash.audio.maxByOrNull { it.id }!!)
                append('\n')
                append(it.defaultyQuality)
            })
        }

    }

    @Test
    fun ffmpeg() {

        val process = ProcessBuilder().redirectErrorStream(true).command(
            "ffmpegs",
            "-h",
        ).start()
        print("meraging...\r")
        val reader = process.inputStream.reader()
        val ffout = StringBuffer()
        while (true) {
            val buffer = CharArray(30)
            val len = reader.read(buffer)
            if (len == -1) break
            val message = String(buffer, 0, len)
            ffout.append(message)
//            if (message.startsWith("frames"))
                print(message)
        }
        process.waitFor()
    }

}