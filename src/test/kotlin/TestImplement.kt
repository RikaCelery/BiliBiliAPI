import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.util.*
import kotlinx.serialization.json.Json

object TestImplement {
    val json = Json {
        prettyPrint = true
        ignoreUnknownKeys = true
    }

    val session = "12ab3acc,1686561832,05a31*c2"
    val client = HttpClient(CIO) {
        defaultRequest {
            headers.appendIfNameAndValueAbsent("cookie","SESSDATA=$session")
        }
        install(UserAgent){
            agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"
        }
        install(HttpRequestRetry){
            retryOnServerErrors(maxRetries = 5)
            exponentialDelay()
        }
        install(ContentNegotiation){
            this.json(json)
        }
    }
}