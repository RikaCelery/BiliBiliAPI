package org.celery.bilibili.model.reply

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BasicReply(
    var action: Int = 0,
//    var assist: Int = 0,
//    var attr: Int = 0,
    var content: Content = Content(),
    var count: Int = 0,
    var rcount: Int = 0,
    var ctime: Long = 0,
    var dialog: Long = 0,
    @SerialName("dynamic_id_str")
    var dynamicIdStr: String = "",
    var fansgrade: Int = 0,
    var folder: Folder = Folder(),
    var invisible: Boolean = false,
    var like: Int = 0,
    var member: Member = Member(),
    var mid: Long = 0,
    var oid: Long = 0,
    var parent: Long = 0,
    var replies: List<BasicReply>? = null,
    @SerialName("reply_control")
    var replyControl: ReplyControl = ReplyControl(),
    var root: Long = 0,
    var rpid: Long = 0,
    var state: Int = 0,
    var type: Int = 0,
    @SerialName("up_action")
    var upAction: UpAction = UpAction()
) {

    @Serializable
    data class Folder(
        @SerialName("has_folded")
        var hasFolded: Boolean = false,
        @SerialName("is_folded")
        var isFolded: Boolean = false,
        var rule: String = ""
    )

    @Serializable
    data class ReplyControl(
        var location: String = "",
        @SerialName("sub_reply_entry_text")
        var subReplyEntryText: String = "",
        @SerialName("sub_reply_title_text")
        var subReplyTitleText: String = "",
        @SerialName("time_desc")
        var timeDesc: String = ""
    )

    @Serializable
    data class UpAction(
        var like: Boolean = false,
        var reply: Boolean = false
    )
}