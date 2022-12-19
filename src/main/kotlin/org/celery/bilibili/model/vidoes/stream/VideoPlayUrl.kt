package org.celery.bilibili.model.vidoes.stream


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoPlayUrl(
    @SerialName("accept_description") var acceptDescription: List<String> = listOf(),
    @SerialName("accept_format") var acceptFormat: String = "", // hdflv2,flv,flv720,flv480,mp4
    @SerialName("accept_quality") var acceptQuality: List<Int> = listOf(),
    @SerialName("durl") var durl: List<Durl> = listOf(),
    @SerialName("dash") var dash: Dash = Dash(),
    @SerialName("format") var format: String = "", // flv720
    @SerialName("from") var from: String = "", // local
    @SerialName("high_format") var highFormat: @Contextual Any? = null, // null
    @SerialName("last_play_cid") var lastPlayCid: Int = 0, // 0
    @SerialName("last_play_time") var lastPlayTime: Int = 0, // 0
    @SerialName("message") var message: String = "",
    @SerialName("quality") var quality: Int = 0, // 64
    @SerialName("result") var result: String = "", // suee
    @SerialName("seek_param") var seekParam: String = "", // start
    @SerialName("seek_type") var seekType: String = "", // offset
    @SerialName("support_formats") var supportFormats: List<SupportFormat> = listOf(),
    @SerialName("timelength") var timelength: Int = 0, // 283801
    @SerialName("video_codecid") var videoCodecid: Int = 0 // 7
) {
    @Serializable
    data class Durl(
        @SerialName("ahead") var ahead: String = "",
        @SerialName("backup_url") var backupUrl: List<String> = listOf(),
        @SerialName("length") var length: Int = 0, // 283801
        @SerialName("order") var order: Int = 0, // 1
        @SerialName("size") var size: Int = 0, // 70486426
        @SerialName("url") var url: String = "", // https://upos-sz-mirrorcos.bilivideo.com/upgcxcode/08/62/171776208/171776208_nb2-1-64.flv?e=ig8euxZM2rNcNbNMnwdVhwdlhbK3hwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1662808778&gen=playurlv2&os=cosbv&oi=3719461929&trid=31dc1934e77141bfbdf5ae88aca0b29fu&mid=0&platform=pc&upsig=a4d5f1713e1ba313041d034a958c2414&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=0,3&agrr=1&bw=249068&logo=80000000
        @SerialName("vhead") var vhead: String = ""
    )

    @Serializable
    data class SupportFormat(
        @SerialName("codecs") var codecs: List<String>? = null, // null
        @SerialName("display_desc") var displayDesc: String = "", // 1080P
        @SerialName("format") var format: String = "", // hdflv2
        @SerialName("new_description") var newDescription: String = "", // 1080P 高码率
        @SerialName("quality") var quality: Int = 0, // 112
        @SerialName("superscript") var superscript: String = "" // 高码率
    )

    //"audio/video": (quality_code, link)
    val defaultyQuality: Map<String, Pair<Int, String>>
        get() {
            var videoQuality = acceptQuality.maxOf { it }
            val audioQuality = dash.audio.maxOf { it.id }
            if (videoQuality > 120) videoQuality = 120

            val video = Pair(videoQuality, dash.video.filter { it.id == videoQuality }.let {
                it.find { it.codecid == 12 } ?: it.first()
            }.baseUrl)
            val audio = Pair(audioQuality, dash.audio.find { it.id == audioQuality }!!.baseUrl)

            return mapOf("audio" to audio,"video" to video)
        }
}
