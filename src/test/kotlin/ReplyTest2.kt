import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.decodeFromString
import org.celery.bilibili.model.Response
import org.celery.bilibili.model.reply.Reply
import org.junit.jupiter.api.Test

class ReplyTest2 {

    /**
     * @param order 3：仅按热度 1：按热度+按时间 2：仅按时间
     * @param next 按热度时：热度顺序页码（0 为第一页）按时间时：时间倒序楼层号 默认为 0
     */
    fun getReply(oid: Long, next: Int = 0, order: Int = 3) = runBlocking {
        TestImplement.client.get("https://api.bilibili.com/x/v2/reply/main") {
            parameter("type", "1")
            parameter("oid", oid)
            parameter("mode", order)
            parameter("ps", "30")
            parameter("next", next)
        }.body<String>().let {
            TestImplement.json.decodeFromString<Response<Reply>>(it)
        }
    }

    @Test
    fun serialization() {
        runBlocking {
            getReply(306347937).useData {
                println(
                    it.replies.map {
                        it.member.uname+"("+it.member.mid+"): "+(it.content.atNameToMid?.toList()?.fold(it.content.message) { acc: String, pair ->
                            acc.replace(pair.first, "${pair.first}(${pair.second})")
                        } ?: it.content.message)+" ["+it.count+"]"
                    }.joinToString("\n---\n")
                )
            }
        }
    }

    @Test
    fun reply2():Unit = runBlocking {
        TestImplement.client.get("http://api.bilibili.com/x/v2/reply/reply") {
            parameter("type", "1")
            parameter("oid", "306347937")
            parameter("root", "141792178400")
            parameter("mode", "2")
            parameter("ps", "20")
        }.body<Reply>().also {
            delay(2_000)
        }

    }

//    @Test
//    fun dump(jsonElement: JsonElement, pre: String? = null) {
//
//        val text = TestImplement.json.encodeToString(jsonElement)
////        println(jsonElement.jsonObject["data"]!!.jsonObject["page"]!!.jsonObject["num"]!!.jsonPrimitive.int)
//        if (pre == null) File("${System.currentTimeMillis()}.json").writeText(text)
//        else File("${pre}_${System.currentTimeMillis()}.json").writeText(text)
//
//    }
//
//    @Test
//    fun ma(): Unit = runBlocking {
//    }
}