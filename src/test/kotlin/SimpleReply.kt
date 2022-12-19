@kotlinx.serialization.Serializable
data class SimpleReply(
    val oid:Long,
    val rpid:Long,
    val root:Long,
    val parent:Long,
    val dialog:Long,
    val createTime:Long,
    val memberId:Long,
    val memberName:String,
    val atMemberToMid:Map<String,Long>,
    val message:String
)