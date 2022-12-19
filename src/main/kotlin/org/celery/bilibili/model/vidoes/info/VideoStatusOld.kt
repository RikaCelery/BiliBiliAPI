package org.celery.bilibili.model.vidoes.info


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonPrimitive

@Serializable
data class VideoStatusOld(
    @SerialName("aid")
    var aid: Long = 0, // 91572143
    @SerialName("coin")
    var coin: Int = 0, // 143389
    @SerialName("copyright")
    var copyright: Int = 0, // 1
    @SerialName("danmaku")
    var danmaku: Int = 0, // 37856
    @SerialName("dislike")
    var dislike: Int = 0, // 0
    @SerialName("favorite")
    var favorite: Int = 0, // 131317
    @SerialName("his_rank")
    var hisRank: Int = 0, // 4
    @SerialName("like")
    var like: Int = 0, // 264314
    @SerialName("no_reprint")
    var noReprint: Int = 0, // 1
    @SerialName("now_rank")
    var nowRank: Int = 0, // 0
    @SerialName("reply")
    var reply: Int = 0, // 5723
    @SerialName("share")
    var share: Int = 0, // 44598
    @SerialName("view")
    var view: @Contextual JsonPrimitive = JsonPrimitive("---") // 2236510
)