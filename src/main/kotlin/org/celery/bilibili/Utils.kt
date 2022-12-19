package org.celery.bilibili

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.nio.file.Path
import kotlin.io.path.exists

suspend fun merageVideo(audio: Path, video: Path, output: Path) {
    val ffmpegExecutable = "ffmpeg"
    withContext(Dispatchers.IO) {
        val process = ProcessBuilder().redirectErrorStream(true).command(
            ffmpegExecutable,
            "-i",
            audio.toString(),
            "-i",
            video.toString(),
            "-c",
            "copy",
            "-y",
            output.toString(),
            "-hide_banner"
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
            if (message.startsWith("frames"))
                print(message)
        }
        process.waitFor()
        require(output.exists()) {
            ffout
        }
        println("meraged")
    }
}