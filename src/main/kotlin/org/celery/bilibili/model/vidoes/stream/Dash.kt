package org.celery.bilibili.model.vidoes.stream


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dash(
    @SerialName("audio") var audio: List<MediaInfo> = listOf(), @SerialName("duration") var duration: Int = 0, // 347
    @SerialName("min_buffer_time") var minBufferTime: Double = 0.0, // 1.5
    @SerialName("video") var video: List<MediaInfo> = listOf()
) {


    @Serializable
    data class MediaInfo(
        @SerialName("backup_url") var backupUrl: List<String> = listOf(),
        @SerialName("bandwidth") var bandwidth: Int = 0, // 13799375
        @SerialName("base_url") var baseUrl: String = "", // http://cn-hbyc3-dx-v-03.bilivideo.com/upgcxcode/65/46/244954665/244954665_f9-1-30125.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1615860500&gen=playurlv2&os=vcache&oi=3702125999&trid=e4aa2dea3e2142f996ab744b2cff702du&platform=pc&upsig=688e42ac8ee0d5fcc0bfccee56070185&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,platform&cdnid=3603&mid=5087321&orderid=0,3&agrr=0&logo=80000000
        @SerialName("codecid") var codecid: Int = 0, // 12
        @SerialName("codecs") var codecs: String = "", // hev1.2.4.L156.90
        @SerialName("frame_rate") var frameRate: String = "", // 125
        @SerialName("height") var height: Int = 0, // 1920
        @SerialName("id") var id: Int = 0, // 125
        @SerialName("mime_type") var mimeType: String = "", // mediaInfo/mp4
        @SerialName("sar") var sar: String = "", // 1:1
        @SerialName("segment_base") var segmentBase: SegmentBase = SegmentBase(),
        @SerialName("start_with_sap") var startWithSap: Int = 0, // 1
        @SerialName("width") var width: Int = 0 // 3840
    ) {

        @Serializable
        data class SegmentBase(
            @SerialName("index_range") var indexRange: String = "", // 1067-1926
            @SerialName("initialization") var initialization: String = "" // 0-1066
        )
    }
}