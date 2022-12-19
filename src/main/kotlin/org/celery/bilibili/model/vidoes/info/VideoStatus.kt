package org.celery.bilibili.model.vidoes.info


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonPrimitive

@Serializable
data class VideoStatus(
    @SerialName("aid")
    var aid: Long = 0, // 2271112
    @SerialName("argue_msg")
    var argueMsg: String = "",
    @SerialName("bvid")
    var bvid: String = "", // BV1es411D7sW
    @SerialName("coin")
    var coin: Int = 0, // 599649
    @SerialName("copyright")
    var copyright: Int = 0, // 1
    @SerialName("danmaku")
    var danmaku: Int = 0, // 161919
    @SerialName("evaluation")
    var evaluation: String = "",
    @SerialName("favorite")
    var favorite: Int = 0, // 892560
    @SerialName("his_rank")
    var hisRank: Int = 0, // 4
    @SerialName("like")
    var like: Int = 0, // 628592
    @SerialName("no_reprint")
    var noReprint: Int = 0, // 0
    @SerialName("now_rank")
    var nowRank: Int = 0, // 0
    @SerialName("reply")
    var reply: Int = 0, // 52825
    @SerialName("share")
    var share: Int = 0, // 240573
    @SerialName("view")
    var view: @Contextual JsonPrimitive = JsonPrimitive("---") // 2236510
)