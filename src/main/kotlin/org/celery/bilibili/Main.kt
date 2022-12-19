package org.celery.bilibili

import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.system.exitProcess



fun main(args: Array<String>) {
    val regex = Regex("BV[a-zA-Z\\d]{10}")
    val cookieFile = File("cookie.txt")
    val clients = cookieFile.apply {
        if (!canRead()) createNewFile()
    }.readLines().map {
        val sessdata = Regex("SESSDATA=(\\w+)[ ;]").find(it)?.groupValues?.get(1) ?: it
        BiliClient(sessdata)
    }
    try {
        ProcessBuilder().command("ffmpeg").start().waitFor()
    } catch (e:Exception) {
        println("未设置ffmpeg环境变量或未指定ffmpeg位置")
        exitProcess(0)
    }
    if (clients.isEmpty()) {
        println("没有可用的cookie，请添加cookie到${cookieFile.absolutePath}")
        exitProcess(0)
    }
    val baseFolder = File(".").canonicalFile
    baseFolder.mkdirs()

    val bvs = regex.findAll(args.joinToString(" ").split("https://").joinToString()).map { it.value }.toHashSet()
    for (bvid in bvs) {
        val lastCall = System.currentTimeMillis()
        runBlocking {
            clients.random().downloadBiliVideo(bvid, baseFolder)

        }
        if (System.currentTimeMillis() - lastCall < 2000) {
            Thread.sleep(2000)
        }
    }
}
