package org.celery.bilibili.model.vidoes.info


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.celery.bilibili.model.serializers.VideoPagesSerializer


@Serializable(VideoPagesSerializer::class)
class VideoPages(
    items: List<VideoPagesItem> = emptyList()
) : ArrayList<VideoPages.VideoPagesItem>(){

    @Serializable
    data class VideoPagesItem(
        @SerialName("cid")
        var cid: Long = 0, // 66445301
        @SerialName("dimension")
        var dimension: Dimension = Dimension(),
        @SerialName("duration")
        var duration: Int = 0, // 33
        @SerialName("from")
        var from: String = "", // vupload
        @SerialName("page")
        var page: Int = 0, // 1
        @SerialName("part")
        var part: String = "", // 00. 宣传短片
        @SerialName("vid")
        var vid: String = "",
        @SerialName("weblink")
        var weblink: String = ""
    ) {
        @Serializable
        data class Dimension(
            @SerialName("height")
            var height: Int = 0, // 1080
            @SerialName("rotate")
            var rotate: Int = 0, // 0
            @SerialName("width")
            var width: Int = 0 // 1920
        )
    }

    init{
        this.addAll(items)
    }

}