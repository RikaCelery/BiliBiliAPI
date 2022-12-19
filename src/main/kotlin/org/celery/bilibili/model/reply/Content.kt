package org.celery.bilibili.model.reply

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class Content(
    @SerialName("at_name_to_mid")
    var atNameToMid: Map<String,Long>? = null,
    var emote: Map<String,Emote> = mapOf(),
    @SerialName("jump_url")
    var jumpUrl: Map<String,JsonElement> = mapOf(),
//    @SerialName("max_line")
//    var maxLine: Int = 0,
    var members: List<Member> = listOf(),
    var message: String = ""
) {

    @Serializable
    data class Emote(
        var attr: Int = 0,
        var id: Int = 0,
        @SerialName("jump_title")
        var jumpTitle: String = "",
        var meta: Meta = Meta(),
        var mtime: Int = 0,
        @SerialName("package_id")
        var packageId: Int = 0,
        var state: Int = 0,
        var text: String = "",
        var type: Int = 0,
        var url: String = ""
    ) {
        @Serializable
        data class Meta(
            var size: Int = 0,
            var alias:String?=null
        )
    }

    @Serializable
    class JumpUrl

}