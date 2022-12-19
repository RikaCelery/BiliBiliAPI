package org.celery.bilibili

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.util.*
import kotlinx.serialization.json.Json

class BiliClient(val session: String) {
    companion object {
        val json = Json {
            prettyPrint = true
            ignoreUnknownKeys = true
        }
    }

    val client = HttpClient(CIO) {
        engine {
            requestTimeout = 10 * 60 * 1000
        }
        defaultRequest {
            headers.appendIfNameAndValueAbsent("cookie", "SESSDATA=$session")
            headers.appendIfNameAndValueAbsent("referer", "https://www.bilibili.com")
        }
        install(UserAgent) {
            agent =
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"
        }
        install(HttpRequestRetry) {
            retryOnServerErrors(maxRetries = 5)
            exponentialDelay()
        }
        install(ContentNegotiation) {
            this.json(json)
        }
    }
}