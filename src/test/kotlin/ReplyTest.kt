import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonObject
import org.junit.jupiter.api.Test
import java.io.File

class ReplyTest {
    var uniq = mutableMapOf<String, SimpleReply>()

    @Test
    fun reply() = runBlocking {
        TestImplement.client.get("https://api.bilibili.com/x/v2/reply/main") {
            parameter("type", "1")
            parameter("oid", "1")
            parameter("mode", "2")
            parameter("ps", "30")
        }.body<JsonObject>().let {
            val text = TestImplement.json.encodeToString(it)
            println(text)
            File("${System.currentTimeMillis()}.txt").writeText(text)
        }
    }

//    @Test
//    fun reply2(pn: Int? = null) = runBlocking {
//        print(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS ").format(LocalDateTime.now()))
//        println("get$pn")
//        return@runBlocking TestImplement.client.get("http://api.bilibili.com/x/v2/reply/reply") {
//            parameter("type", "1")
//            parameter("oid", "306347937")
//            parameter("root", "141792178400")
//            parameter("mode", "2")
//            parameter("ps", "20")
//            if (pn != null)
//                parameter("pn", pn)
//        }.body<Response<Reply>>().also {
//            it.data.replies.forEach {
//                val k = (it.member.mid.toString() + it.ctime)
//                uniq.putIfAbsent(
//                    k, SimpleReply(
//                        oid = it.oid,
//                        rpid = it.rpid,
//                        root = it.root,
//                        parent = it.parent,
//                        dialog = it.dialog,
//                        createTime = it.ctime,
//                        memberId = it.member.mid,
//                        memberName = it.member.uname,
//                        atMemberToMid = it.content.atNameToMid ?: mapOf(),
//                        message = it.content.message
//                    )
//                )
//                File("uniq.json").writeText(TestImplement.json.encodeToString(uniq))
//            }
//            delay(2000)
//        }
//
//    }

//    @Test
//    fun dump(jsonElement: Reply, pre: String? = null) {
//
//        val text = TestImplement.json.encodeToString(jsonElement)
////        println(jsonElement.jsonObject["data"]!!.jsonObject["page"]!!.jsonObject["num"]!!.jsonPrimitive.int)
//        if (pre == null)
//            File("${System.currentTimeMillis()}.json").writeText(text)
//        else
//            File("${pre}_${System.currentTimeMillis()}.json").writeText(text)
//
//    }

//    @Test
//    fun ma(): Unit = runBlocking {
//        try {
//            uniq = TestImplement.json.decodeFromString(File("uniq.json").readText())
//        } catch (e: Exception) {
//        }
//        var a: Reply
//        a = reply2().data
////        dump(a)
//        if (a.page.count.let {
//                if (it % 20 != 0) it.div(
//                    20
//                ).plus(1) else it / 20
//            } > 1) {
//            for (n in 2..a.page.count.let {
//                if (it % 20 != 0) it.div(
//                    20
//                ).plus(1) else it / 20
//            }) {
//                a = reply2(n).data
////                dump(a)
//            }
//        }
//        var total: Int
//        total = a.page.count
//        total = 223
//        kotlin.concurrent.timer("updater", false, 0, 2 * 60_000) {
//            a = reply2(total.let {
//                if (it % 20 != 0) it.div(
//                    20
//                ).plus(1) else it / 20
//            }).data
//            val totalNew = a.page.count
//            if (total != totalNew) {
//                println("update,$total -> $totalNew")
//                total = totalNew
//                dump(a, "reply")
//            } else {
//                println("no update")
//            }
//            File("contents.txt").writeText(uniq.values.sortedBy { it.createTime }.joinToString("\n") {
//                it.memberName + " :" + it.message
//                //\S+ :(回复 @\S+ :)?
//            })
//        }
//        Thread.sleep(24 * 60 * 60_000)
//    }
}