package org.celery.bilibili.model.vidoes.info


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoBasicInfo(
    @SerialName("aid")
    var aid: Long = 0, // 85440373
    @SerialName("bvid")
    var bvid: String = "", // BV117411r7R1
    @SerialName("cid")
    var cid: Long = 0, // 146044693
    @SerialName("copyright")
    var copyright: Int = 0, // 1
    @SerialName("ctime")
    var ctime: Int = 0, // 1580212263
    @SerialName("desc")
    var desc: String = "", // 【CB想说的】看完拜年祭之后最爱的一个节目！给有快板的部分简单加了一些不同风格的配乐hhh，感谢沃玛画的我！太可爱了哈哈哈哈哈哈哈！！！【Warma想说的】我画了打碟的CB，画风为了还原原版视频所以参考了四迹老师的画风，四迹老师的画真的太可爱啦！不过其实在画的过程中我遇到了一个问题，CB的耳机……到底是戴在哪个耳朵上呢？原版：av78977080编曲（配乐）：Crazy Bucket人声（配音）：Warma/谢拉曲绘：四迹/Warma动画：四迹/Crazy Bucket剧本：Mokurei-木灵君音频后期：DMYoung/纳兰寻风/Crazy Bucket包装：破晓天
    @SerialName("desc_v2")
    var descV2: List<DescV2>? = null,
    @SerialName("dimension")
    var dimension: Dimension = Dimension(),
    @SerialName("duration")
    var duration: Int = 0, // 486
    @SerialName("dynamic")
    var `dynamic`: String = "", // 进来就出不去了！！！#全民音乐UP主##CB##warma##电音##快板##拜年祭##诸神的奥运##编曲##Remix#
    @SerialName("honor_reply")
    var honorReply: HonorReply = HonorReply(),
    @SerialName("is_chargeable_season")
    var isChargeableSeason: Boolean = false, // false
    @SerialName("is_season_display")
    var isSeasonDisplay: Boolean = false, // false
    @SerialName("is_story")
    var isStory: Boolean = false, // false
    @SerialName("like_icon")
    var likeIcon: String = "",
    @SerialName("mission_id")
    var missionId: Int = 0, // 11838
    @SerialName("no_cache")
    var noCache: Boolean = false, // false
    @SerialName("owner")
    var owner: Owner = Owner(),
    @SerialName("pages")
    var pages: VideoPages = VideoPages(),
    @SerialName("pic")
    var pic: String = "", // http://i1.hdslb.com/bfs/archive/ea0dd34bf41e23a68175680a00e3358cd249105f.jpg
    @Contextual
    @SerialName("premiere")
    var premiere: Any? = null, // null
    @SerialName("pubdate")
    var pubdate: Int = 0, // 1580377255
    @SerialName("rights")
    var rights: Rights = Rights(),
    @SerialName("staff")
    var staff: List<Staff> = listOf(),
    @SerialName("stat")
    var stat: Stat = Stat(),
    @SerialName("state")
    var state: Int = 0, // 0
    @SerialName("subtitle")
    var subtitle: Subtitle = Subtitle(),
    @SerialName("teenage_mode")
    var teenageMode: Int = 0, // 0
    @SerialName("tid")
    var tid: Int = 0, // 28
    @SerialName("title")
    var title: String = "", // 当我给拜年祭的快板加了电音配乐…
    @SerialName("tname")
    var tname: String = "", // 原创音乐
    @SerialName("user_garb")
    var userGarb: UserGarb = UserGarb(),
    @SerialName("videos")
    var videos: Int = 0 // 1
) {
    @Serializable
    data class DescV2(
        @SerialName("biz_id")
        var bizId: Int = 0, // 0
        @SerialName("raw_text")
        var rawText: String = "", // 【CB想说的】看完拜年祭之后最爱的一个节目！给有快板的部分简单加了一些不同风格的配乐hhh，感谢沃玛画的我！太可爱了哈哈哈哈哈哈哈！！！【Warma想说的】我画了打碟的CB，画风为了还原原版视频所以参考了四迹老师的画风，四迹老师的画真的太可爱啦！不过其实在画的过程中我遇到了一个问题，CB的耳机……到底是戴在哪个耳朵上呢？原版：av78977080编曲（配乐）：Crazy Bucket人声（配音）：Warma/谢拉曲绘：四迹/Warma动画：四迹/Crazy Bucket剧本：Mokurei-木灵君音频后期：DMYoung/纳兰寻风/Crazy Bucket包装：破晓天
        @SerialName("type")
        var type: Int = 0 // 1
    )

    @Serializable
    data class Dimension(
        @SerialName("height")
        var height: Int = 0, // 1080
        @SerialName("rotate")
        var rotate: Int = 0, // 0
        @SerialName("width")
        var width: Int = 0 // 1920
    )

    @Serializable
    data class HonorReply(
        @SerialName("honor")
        var honor: List<Honor> = listOf()
    ) {
        @Serializable
        data class Honor(
            @SerialName("aid")
            var aid: Int = 0, // 85440373
            @SerialName("desc")
            var desc: String = "", // 第45期每周必看
            @SerialName("type")
            var type: Int = 0, // 2
            @SerialName("weekly_recommend_num")
            var weeklyRecommendNum: Int = 0 // 45
        )
    }

    @Serializable
    data class Owner(
        @SerialName("face")
        var face: String = "", // http://i2.hdslb.com/bfs/face/c9af3b32cf74baec5a4b65af8ca18ae5ff571f77.jpg
        @SerialName("mid")
        var mid: Long = 0, // 66606350
        @SerialName("name")
        var name: String = "" // Crazy_Bucket_陈楒潼
    )

    @Serializable
    data class Page(
        @SerialName("cid")
        var cid: Long = 0, // 146044693
        @SerialName("dimension")
        var dimension: Dimension = Dimension(),
        @SerialName("duration")
        var duration: Int = 0, // 486
        @SerialName("from")
        var from: String = "", // vupload
        @SerialName("page")
        var page: Int = 0, // 1
        @SerialName("part")
        var part: String = "", // 建议改成：建议改成：诸 神 的 电 音 节（不是）
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

    @Serializable
    data class Rights(
        @SerialName("arc_pay")
        var arcPay: Int = 0, // 0
        @SerialName("autoplay")
        var autoplay: Int = 0, // 1
        @SerialName("bp")
        var bp: Int = 0, // 0
        @SerialName("clean_mode")
        var cleanMode: Int = 0, // 0
        @SerialName("download")
        var download: Int = 0, // 1
        @SerialName("elec")
        var elec: Int = 0, // 0
        @SerialName("free_watch")
        var freeWatch: Int = 0, // 0
        @SerialName("hd5")
        var hd5: Int = 0, // 1
        @SerialName("is_360")
        var is360: Int = 0, // 0
        @SerialName("is_cooperation")
        var isCooperation: Int = 0, // 1
        @SerialName("is_stein_gate")
        var isSteinGate: Int = 0, // 0
        @SerialName("movie")
        var movie: Int = 0, // 0
        @SerialName("no_background")
        var noBackground: Int = 0, // 0
        @SerialName("no_reprint")
        var noReprint: Int = 0, // 1
        @SerialName("no_share")
        var noShare: Int = 0, // 0
        @SerialName("pay")
        var pay: Int = 0, // 0
        @SerialName("ugc_pay")
        var ugcPay: Int = 0, // 0
        @SerialName("ugc_pay_preview")
        var ugcPayPreview: Int = 0 // 0
    )

    @Serializable
    data class Staff(
        @SerialName("face")
        var face: String = "", // http://i2.hdslb.com/bfs/face/c9af3b32cf74baec5a4b65af8ca18ae5ff571f77.jpg
        @SerialName("follower")
        var follower: Int = 0, // 646111
        @SerialName("label_style")
        var labelStyle: Int = 0, // 0
        @SerialName("mid")
        var mid: Long = 0, // 66606350
        @SerialName("name")
        var name: String = "", // Crazy_Bucket_陈楒潼
        @SerialName("official")
        var official: Official = Official(),
        @SerialName("title")
        var title: String = "", // UP主
        @SerialName("vip")
        var vip: Vip = Vip()
    ) {
        @Serializable
        data class Official(
            @SerialName("desc")
            var desc: String = "",
            @SerialName("role")
            var role: Int = 0, // 1
            @SerialName("title")
            var title: String = "", // bilibili 知名音乐UP主
            @SerialName("type")
            var type: Int = 0 // 0
        )

        @Serializable
        data class Vip(
            @SerialName("avatar_subscript")
            var avatarSubscript: Int = 0, // 1
            @SerialName("avatar_subscript_url")
            var avatarSubscriptUrl: String = "",
            @SerialName("due_date")
            var dueDate: Long = 0, // 1674403200000
            @SerialName("label")
            var label: Label = Label(),
            @SerialName("nickname_color")
            var nicknameColor: String = "", // #FB7299
            @SerialName("role")
            var role: Int = 0, // 3
            @SerialName("status")
            var status: Int = 0, // 1
            @SerialName("theme_type")
            var themeType: Int = 0, // 0
            @SerialName("tv_vip_pay_type")
            var tvVipPayType: Int = 0, // 0
            @SerialName("tv_vip_status")
            var tvVipStatus: Int = 0, // 0
            @SerialName("type")
            var type: Int = 0, // 2
            @SerialName("vip_pay_type")
            var vipPayType: Int = 0 // 0
        ) {
            @Serializable
            data class Label(
                @SerialName("bg_color")
                var bgColor: String = "", // #FB7299
                @SerialName("bg_style")
                var bgStyle: Int = 0, // 1
                @SerialName("border_color")
                var borderColor: String = "",
                @SerialName("img_label_uri_hans")
                var imgLabelUriHans: String = "",
                @SerialName("img_label_uri_hans_static")
                var imgLabelUriHansStatic: String = "", // https://i0.hdslb.com/bfs/vip/8d4f8bfc713826a5412a0a27eaaac4d6b9ede1d9.png
                @SerialName("img_label_uri_hant")
                var imgLabelUriHant: String = "",
                @SerialName("img_label_uri_hant_static")
                var imgLabelUriHantStatic: String = "", // https://i0.hdslb.com/bfs/activity-plat/static/20220614/e369244d0b14644f5e1a06431e22a4d5/VEW8fCC0hg.png
                @SerialName("label_theme")
                var labelTheme: String = "", // annual_vip
                @SerialName("path")
                var path: String = "",
                @SerialName("text")
                var text: String = "", // 年度大会员
                @SerialName("text_color")
                var textColor: String = "", // #FFFFFF
                @SerialName("use_img_label")
                var useImgLabel: Boolean = false // true
            )
        }
    }

    @Serializable
    data class Stat(
        @SerialName("aid")
        var aid: Int = 0, // 85440373
        @SerialName("argue_msg")
        var argueMsg: String = "",
        @SerialName("coin")
        var coin: Int = 0, // 71048
        @SerialName("danmaku")
        var danmaku: Int = 0, // 11839
        @SerialName("dislike")
        var dislike: Int = 0, // 0
        @SerialName("evaluation")
        var evaluation: String = "",
        @SerialName("favorite")
        var favorite: Int = 0, // 58725
        @SerialName("his_rank")
        var hisRank: Int = 0, // 55
        @SerialName("like")
        var like: Int = 0, // 155954
        @SerialName("now_rank")
        var nowRank: Int = 0, // 0
        @SerialName("reply")
        var reply: Int = 0, // 2619
        @SerialName("share")
        var share: Int = 0, // 9398
        @SerialName("view")
        var view: Int = 0 // 2270927
    )

    @Serializable
    data class Subtitle(
        @SerialName("allow_submit")
        var allowSubmit: Boolean = false, // false
        @SerialName("list")
        var list: List<Sub> = listOf()
    )
    @Serializable
    data class Sub(
        val id: Long = 0,
        val id_str:String = "",
        val ai_type:Int = 0,
        val ai_status:Int = 0,
        val lan: String = "",
        val lan_doc: String = "",
        val is_lock: Boolean = false,
        val type: Int = 0,
        val author_mid: Long = 0,
        val subtitle_url: String = "",
        val author: Author = Author(),
    )
    @Serializable
    data class Author(
        val mid: Long = 0,
        val name :String = "",
        val sex :String =  "",
        val face :String = "",
        val sign :String = "",
        val rank :Int = 0,
        val birthday :Int = 0,
        val is_fake_account :Int = 0,
        val is_deleted :Int = 0,
        val in_reg_audit :Int = 0,
        val is_senior_member :Int = 0,
    )

    @Serializable
    data class UserGarb(
        @SerialName("url_image_ani_cut")
        var urlImageAniCut: String = ""
    )
}