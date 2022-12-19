package org.celery.bilibili.model.vidoes.info


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoDetailedInfo(
    @SerialName("Card") var card: Card = Card(),
    @Contextual @SerialName("elec") var elec: Any? = null, // null
    @SerialName("hot_share") var hotShare: HotShare = HotShare(),
    @Contextual @SerialName("recommend") var recommend: Any? = null, // null
    @SerialName("Related") var related: List<Related> = listOf(),
    @SerialName("Reply") var reply: Reply = Reply(),
    @Contextual @SerialName("Spec") var spec: Any? = null, // null
    @SerialName("Tags") var tags: List<Tag> = listOf(),
    @SerialName("View") var view: View = View(),
    @SerialName("view_addit") var viewAddit: Map<Int, Boolean> = mapOf(),
    @Contextual var guide: Any? = null
) {
    @Serializable
    data class Card(
        @SerialName("archive_count") var archiveCount: Int = 0, // 387
        @SerialName("article_count") var articleCount: Int = 0, // 0
        @SerialName("card") var card: Card = Card(), @SerialName("follower") var follower: Int = 0, // 66620
        @SerialName("following") var following: Boolean = false, // false
        @SerialName("like_num") var likeNum: Int = 0, // 964504
        @SerialName("space") var space: Space = Space()
    ) {
        @Serializable
        data class Card(
            @SerialName("approve") var approve: Boolean = false, // false
            @SerialName("article") var article: Int = 0, // 0
            @SerialName("attention") var attention: Int = 0, // 35
            @SerialName("attentions") var attentions: List<@Contextual Any> = listOf(),
            @SerialName("birthday") var birthday: String = "",
            @SerialName("description") var description: String = "",
            @SerialName("DisplayRank") var displayRank: String = "", // 0
            @SerialName("face") var face: String = "", // http://i0.hdslb.com/bfs/face/40c46ee74dd6ea33d46c38cd6083e6a1286aa482.gif
            @SerialName("face_nft") var faceNft: Int = 0, // 0
            @SerialName("face_nft_type") var faceNftType: Int = 0, // 0
            @SerialName("fans") var fans: Int = 0, // 66620
            @SerialName("friend") var friend: Int = 0, // 35
            @SerialName("is_senior_member") var isSeniorMember: Int = 0, // 0
            @SerialName("level_info") var levelInfo: LevelInfo = LevelInfo(),
            @SerialName("mid") var mid: String = "", // 122541
            @SerialName("name") var name: String = "", // 冰封.虾子
            @SerialName("nameplate") var nameplate: Nameplate = Nameplate(),
            @SerialName("Official") var official: Official = Official(),
            @SerialName("official_verify") var officialVerify: OfficialVerify = OfficialVerify(),
            @SerialName("pendant") var pendant: Pendant = Pendant(),
            @SerialName("place") var place: String = "",
            @SerialName("rank") var rank: String = "", // 10000
            @SerialName("regtime") var regtime: Int = 0, // 0
            @SerialName("sex") var sex: String = "", // 保密
            @SerialName("sign") var sign: String = "", // 路亚钓鱼爱好者交流群411267154
            @SerialName("spacesta") var spacesta: Int = 0, // 0
            @SerialName("vip") var vip: Vip = Vip()
        ) {
            @Serializable
            data class LevelInfo(
                @SerialName("current_exp") var currentExp: Int = 0, // 0
                @SerialName("current_level") var currentLevel: Int = 0, // 6
                @SerialName("current_min") var currentMin: Int = 0, // 0
                @SerialName("next_exp") var nextExp: Int = 0 // 0
            )

            @Serializable
            data class Nameplate(
                @SerialName("condition") var condition: String = "", // 所有自制视频总播放数>=50万
                @SerialName("image") var image: String = "", // http://i1.hdslb.com/bfs/face/3f2d64f048b39fb6c26f3db39df47e6080ec0f9c.png
                @SerialName("image_small") var imageSmall: String = "", // http://i2.hdslb.com/bfs/face/90c35d41d8a19b19474d6bac672394c17b444ce8.png
                @SerialName("level") var level: String = "", // 高级勋章
                @SerialName("name") var name: String = "", // 出道偶像
                @SerialName("nid") var nid: Int = 0 // 9
            )

            @Serializable
            data class Official(
                @SerialName("desc") var desc: String = "", @SerialName("role") var role: Int = 0, // 0
                @SerialName("title") var title: String = "", @SerialName("type") var type: Int = 0 // -1
            )

            @Serializable
            data class OfficialVerify(
                @SerialName("desc") var desc: String = "", @SerialName("type") var type: Int = 0 // -1
            )

            @Serializable
            data class Pendant(
                @SerialName("expire") var expire: Int = 0, // 0
                @SerialName("image") var image: String = "",
                @SerialName("image_enhance") var imageEnhance: String = "",
                @SerialName("image_enhance_frame") var imageEnhanceFrame: String = "",
                @SerialName("name") var name: String = "",
                @SerialName("pid") var pid: Int = 0 // 0
            )

            @Serializable
            data class Vip(
                @SerialName("avatar_subscript") var avatarSubscript: Int = 0, // 0
                @SerialName("avatar_subscript_url") var avatarSubscriptUrl: String = "",
                @SerialName("due_date") var dueDate: Long = 0, // 1493827200000
                @SerialName("label") var label: Label = Label(),
                @SerialName("nickname_color") var nicknameColor: String = "",
                @SerialName("role") var role: Int = 0, // 0
                @SerialName("status") var status: Int = 0, // 0
                @SerialName("theme_type") var themeType: Int = 0, // 0
                @SerialName("tv_vip_pay_type") var tvVipPayType: Int = 0, // 0
                @SerialName("tv_vip_status") var tvVipStatus: Int = 0, // 0
                @SerialName("type") var type: Int = 0, // 1
                @SerialName("vip_pay_type") var vipPayType: Int = 0, // 0
                @SerialName("vipStatus") var vipStatus: Int = 0, // 0
                @SerialName("vipType") var vipType: Int = 0 // 1
            ) {
                @Serializable
                data class Label(
                    @SerialName("bg_color") var bgColor: String = "",
                    @SerialName("bg_style") var bgStyle: Int = 0, // 0
                    @SerialName("border_color") var borderColor: String = "",
                    @SerialName("img_label_uri_hans") var imgLabelUriHans: String = "",
                    @SerialName("img_label_uri_hans_static") var imgLabelUriHansStatic: String = "", // https://i0.hdslb.com/bfs/vip/d7b702ef65a976b20ed854cbd04cb9e27341bb79.png
                    @SerialName("img_label_uri_hant") var imgLabelUriHant: String = "",
                    @SerialName("img_label_uri_hant_static") var imgLabelUriHantStatic: String = "", // https://i0.hdslb.com/bfs/activity-plat/static/20220614/e369244d0b14644f5e1a06431e22a4d5/KJunwh19T5.png
                    @SerialName("label_theme") var labelTheme: String = "",
                    @SerialName("path") var path: String = "",
                    @SerialName("text") var text: String = "",
                    @SerialName("text_color") var textColor: String = "",
                    @SerialName("use_img_label") var useImgLabel: Boolean = false // true
                )
            }
        }

        @Serializable
        data class Space(
            @SerialName("l_img") var lImg: String = "", // http://i1.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png
            @SerialName("s_img") var sImg: String = "" // http://i1.hdslb.com/bfs/space/768cc4fd97618cf589d23c2711a1d1a729f42235.png
        )
    }

    @Serializable
    data class HotShare(
        @SerialName("list") var list: List<@Contextual Any> = listOf(),
        @SerialName("show") var show: Boolean = false // false
    )

    @Serializable
    data class Related(
        @SerialName("aid") var aid: Int = 0, // 34812433
        @SerialName("bvid") var bvid: String = "", // BV1Qb411N7Ez
        @SerialName("cid") var cid: Int = 0, // 60984624
        @SerialName("copyright") var copyright: Int = 0, // 2
        @SerialName("ctime") var ctime: Int = 0, // 1540723612
        @SerialName("desc") var desc: String = "", // QQ音乐
        @SerialName("dimension") var dimension: Dimension = Dimension(),
        @SerialName("duration") var duration: Int = 0, // 303
        @SerialName("dynamic") var `dynamic`: String = "", // #音乐选集##保加利亚#
        @SerialName("first_frame") var firstFrame: String? = null, // http://i1.hdslb.com/bfs/storyff/n220604a23d6t17is08tz01wjsgiyhzg_firsti.jpg
        @SerialName("is_ogv") var isOgv: Boolean = false, // false
        @SerialName("mission_id") var missionId: Int? = null, // 12642
        @SerialName("ogv_info") var ogvInfo: @Contextual Any? = null, // null
        @SerialName("owner") var owner: Owner = Owner(),
        @SerialName("pic") var pic: String = "", // http://i2.hdslb.com/bfs/archive/149aed759c1231948c468c412f67c634e05a4974.jpg
        @SerialName("pub_location") var pubLocation: String? = null, // 浙江
        @SerialName("pubdate") var pubdate: Int = 0, // 1540723612
        @SerialName("rcmd_reason") var rcmdReason: String = "",
        @SerialName("rights") var rights: Rights = Rights(),
        @SerialName("season_id") var seasonId: Int? = null, // 462986
        @SerialName("season_type") var seasonType: Int = 0, // 0
        @SerialName("short_link") var shortLink: String = "", // https://b23.tv/BV1Qb411N7Ez
        @SerialName("short_link_v2") var shortLinkV2: String = "", // https://b23.tv/BV1Qb411N7Ez
        @SerialName("stat") var stat: Stat = Stat(),
        @SerialName("state") var state: Int = 0, // 0
        @SerialName("tid") var tid: Int = 0, // 130
        @SerialName("title") var title: String = "", // 怎么办，妖王开始男人了
        @SerialName("tname") var tname: String = "", // 音乐综合
        @SerialName("up_from_v2") var upFromV2: Int? = null, // 8
        @SerialName("videos") var videos: Int = 0, // 1

        var redirect_url: String = ""
    ) {
        @Serializable
        data class Dimension(
            @SerialName("height") var height: Int = 0, // 360
            @SerialName("rotate") var rotate: Int = 0, // 0
            @SerialName("width") var width: Int = 0 // 640
        )

        @Serializable
        data class Owner(
            @SerialName("face") var face: String = "", // http://i2.hdslb.com/bfs/face/4b34377580cf12eabe6bc568967dfe22f981c042.jpg
            @SerialName("mid") var mid: Long = 0, // 229574099
            @SerialName("name") var name: String = "" // 清尘埃落定
        )

        @Serializable
        data class Rights(
            @SerialName("arc_pay") var arcPay: Int = 0, // 0
            @SerialName("autoplay") var autoplay: Int = 0, // 1
            @SerialName("bp") var bp: Int = 0, // 0
            @SerialName("download") var download: Int = 0, // 0
            @SerialName("elec") var elec: Int = 0, // 0
            @SerialName("hd5") var hd5: Int = 0, // 0
            @SerialName("is_cooperation") var isCooperation: Int = 0, // 0
            @SerialName("movie") var movie: Int = 0, // 0
            @SerialName("no_background") var noBackground: Int = 0, // 0
            @SerialName("no_reprint") var noReprint: Int = 0, // 0
            @SerialName("pay") var pay: Int = 0, // 0
            @SerialName("pay_free_watch") var payFreeWatch: Int = 0, // 0
            @SerialName("ugc_pay") var ugcPay: Int = 0, // 0
            @SerialName("ugc_pay_preview") var ugcPayPreview: Int = 0 // 0
        )

        @Serializable
        data class Stat(
            @SerialName("aid") var aid: Int = 0, // 34812433
            @SerialName("coin") var coin: Int = 0, // 273
            @SerialName("danmaku") var danmaku: Int = 0, // 501
            @SerialName("dislike") var dislike: Int = 0, // 0
            @SerialName("favorite") var favorite: Int = 0, // 4591
            @SerialName("his_rank") var hisRank: Int = 0, // 0
            @SerialName("like") var like: Int = 0, // 23321
            @SerialName("now_rank") var nowRank: Int = 0, // 0
            @SerialName("reply") var reply: Int = 0, // 497
            @SerialName("share") var share: Int = 0, // 732
            @SerialName("view") var view: Int = 0 // 1053726
        )
    }

    @Serializable
    data class Reply(
        @SerialName("page") var page: Page = Page(), @SerialName("replies") var replies: List<SimpleReply> = listOf()
    ) {
        @Serializable
        data class Page(
            @SerialName("acount") var acount: Int = 0, // 176677
            @SerialName("count") var count: Int = 0, // 148385
            @SerialName("num") var num: Int = 0, // 1
            @SerialName("size") var size: Int = 0 // 3
        )

        /**
         * 傻逼
         */
        @Serializable
        data class SimpleReply(
            @SerialName("action") var action: Int = 0, // 0
            @SerialName("assist") var assist: Int = 0, // 0
            @SerialName("attr") var attr: Int = 0, // 1024
            @SerialName("content") var content: Content = Content(), @SerialName("count") var count: Int = 0, // 148
            @SerialName("ctime") var ctime: Int = 0, // 1583941947
            @SerialName("dialog") var dialog: Int = 0, // 0
            @SerialName("fansgrade") var fansgrade: Int = 0, // 0
            @SerialName("floor") var floor: Int = 0, // 78866
            @SerialName("like") var like: Int = 0, // 8120
            @SerialName("mid") var mid: Long = 0, // 7827964
            @SerialName("oid") var oid: Int = 0, // 170001
            @SerialName("parent") var parent: Int = 0, // 0
            @SerialName("rcount") var rcount: Int = 0, // 105
            @SerialName("replies") var replies: @Contextual Any? = null, // null
            @SerialName("root") var root: Int = 0, // 0
            @SerialName("rpid") var rpid: Long = 0, // 2509627306
            @SerialName("show_follow") var showFollow: Boolean = false, // false
            @SerialName("state") var state: Int = 0, // 0
            @SerialName("type") var type: Int = 0 // 1
        ) {
            @Serializable
            data class Content(
                @SerialName("device") var device: String = "",
                @SerialName("message") var message: String = "", // 刻在dna里的av号
                @SerialName("plat") var plat: Int = 0 // 0
            )
        }
    }

    @Serializable
    data class Tag(
        @SerialName("alpha") var alpha: Int = 0, // 0
        @SerialName("archive_count") var archiveCount: String = "", // -
        @SerialName("attribute") var attribute: Int = 0, // 1
        @SerialName("color") var color: String = "",
        @SerialName("content") var content: String = "", // 　　保加利亚超级天王 Azis　　Azis生于1978年3月7日，1999年正式出道。他的音乐融合保加利亚名族曲风chalga和pop、rap等元素，不过他惊艳的易装秀与浮夸的角色诠释才是他最为出名的地方。
        @SerialName("count") var count: Count = Count(),
        @SerialName("cover") var cover: String = "", // http://i0.hdslb.com/bfs/tag/6828dc0fe5037e1c483d55704f529135d961cb2b.jpg
        @SerialName("ctime") var ctime: Int = 0, // 1436866637
        @SerialName("extra_attr") var extraAttr: Int = 0, // 0
        @SerialName("featured_count") var featuredCount: Int = 0, // 0
        @SerialName("hated") var hated: Int = 0, // 0
        @SerialName("hates") var hates: Int = 0, // 0
        @SerialName("head_cover") var headCover: String = "",
        @SerialName("is_activity") var isActivity: Boolean = false, // false
        @SerialName("is_atten") var isAtten: Int = 0, // 0
        @SerialName("is_season") var isSeason: Boolean = false, // false
        @SerialName("jump_url") var jumpUrl: String = "",
        @SerialName("liked") var liked: Int = 0, // 0
        @SerialName("likes") var likes: Int = 0, // 1161
        @SerialName("music_id") var musicId: String = "",
        @SerialName("short_content") var shortContent: String = "",
        @SerialName("state") var state: Int = 0, // 0
        @SerialName("subscribed_count") var subscribedCount: Int = 0, // 5573
        @SerialName("tag_id") var tagId: Int = 0, // 117552
        @SerialName("tag_name") var tagName: String = "", // 保加利亚妖王
        @SerialName("tag_type") var tagType: String = "", // old_channel
        @SerialName("type") var type: Int = 0 // 3
    ) {
        @Serializable
        data class Count(
            @SerialName("atten") var atten: Int = 0, // 5573
            @SerialName("use") var use: Int = 0, // 9033
            @SerialName("view") var view: Int = 0 // 0
        )
    }

    @Serializable
    data class View(
        @SerialName("aid") var aid: Int = 0, // 170001
        @SerialName("bvid") var bvid: String = "", // BV17x411w7KC
        @SerialName("cid") var cid: Int = 0, // 279786
        @SerialName("copyright") var copyright: Int = 0, // 2
        @SerialName("ctime") var ctime: Int = 0, // 1497380562
        @SerialName("desc") var desc: String = "", // sina 保加利亚超级天王 Azis1999年出道。他的音乐融合保加利亚名族曲风chalga和pop、rap等元素，不过他惊艳的易装秀与浮夸的角色诠释才是他最为出名的地方 Azis与众多保加利亚天王天后级歌手都有过合作.06年，他作为Mariana Popova的伴唱，在欧洲半决赛上演唱了他们的参赛曲Let Me Cry 06年他被Velikite Balgari评为保加利亚有史以来最伟大的名人之一
        @SerialName("desc_v2") var descV2: List<DescV2> = listOf(),
        @SerialName("dimension") var dimension: Dimension = Dimension(),
        @SerialName("duration") var duration: Int = 0, // 2412
        @SerialName("dynamic") var `dynamic`: String = "",
        @SerialName("honor_reply") var honorReply: HonorReply = HonorReply(),
        @SerialName("is_chargeable_season") var isChargeableSeason: Boolean = false, // false
        @SerialName("is_season_display") var isSeasonDisplay: Boolean = false, // false
        @SerialName("is_story") var isStory: Boolean = false, // false
        @SerialName("like_icon") var likeIcon: String = "",
        @SerialName("no_cache") var noCache: Boolean = false, // false
        @SerialName("owner") var owner: Owner = Owner(),
        @SerialName("pages") var pages: List<Page> = listOf(),
        @SerialName("pic") var pic: String = "", // http://i2.hdslb.com/bfs/archive/1ada8c32a9d168e4b2ee3e010f24789ba3353785.jpg
        @SerialName("premiere") var premiere: @Contextual Any? = null, // null
        @SerialName("pubdate") var pubdate: Long = 0, // 1320850533
        @SerialName("rights") var rights: Rights = Rights(),
        @SerialName("stat") var stat: Stat = Stat(),
        @SerialName("state") var state: Int = 0, // 0
        @SerialName("subtitle") var subtitle: Subtitle = Subtitle(),
        @SerialName("teenage_mode") var teenageMode: Int = 0, // 0
        @SerialName("tid") var tid: Int = 0, // 193
        @SerialName("title") var title: String = "", // 【MV】保加利亚妖王AZIS视频合辑
        @SerialName("tname") var tname: String = "", // MV
        @SerialName("user_garb") var userGarb: UserGarb = UserGarb(),
        @SerialName("videos") var videos: Int = 0 // 10
    ) {
        @Serializable
        data class DescV2(
            @SerialName("biz_id") var bizId: Int = 0, // 0
            @SerialName("raw_text") var rawText: String = "", // sina 保加利亚超级天王 Azis1999年出道。他的音乐融合保加利亚名族曲风chalga和pop、rap等元素，不过他惊艳的易装秀与浮夸的角色诠释才是他最为出名的地方 Azis与众多保加利亚天王天后级歌手都有过合作.06年，他作为Mariana Popova的伴唱，在欧洲半决赛上演唱了他们的参赛曲Let Me Cry 06年他被Velikite Balgari评为保加利亚有史以来最伟大的名人之一
            @SerialName("type") var type: Int = 0 // 1
        )

        @Serializable
        data class Dimension(
            @SerialName("height") var height: Int = 0, // 288
            @SerialName("rotate") var rotate: Int = 0, // 0
            @SerialName("width") var width: Int = 0 // 512
        )

        @Serializable
        data class HonorReply(
            @SerialName("honor") var honor: List<Honor> = listOf()
        ) {
            @Serializable
            data class Honor(
                @SerialName("aid") var aid: Int = 0, // 170001
                @SerialName("desc") var desc: String = "", // 全站排行榜最高第13名
                @SerialName("type") var type: Int = 0, // 3
                @SerialName("weekly_recommend_num") var weeklyRecommendNum: Int = 0 // 0
            )
        }

        @Serializable
        data class Owner(
            @SerialName("face") var face: String = "", // http://i0.hdslb.com/bfs/face/40c46ee74dd6ea33d46c38cd6083e6a1286aa482.gif
            @SerialName("mid") var mid: Long = 0, // 122541
            @SerialName("name") var name: String = "" // 冰封.虾子
        )

        @Serializable
        data class Page(
            @SerialName("cid") var cid: Int = 0, // 279786
            @SerialName("dimension") var dimension: Dimension = Dimension(),
            @SerialName("duration") var duration: Int = 0, // 199
            @SerialName("from") var from: String = "", // vupload
            @SerialName("page") var page: Int = 0, // 1
            @SerialName("part") var part: String = "", // Хоп
            @SerialName("vid") var vid: String = "",
            @SerialName("weblink") var weblink: String = ""
        ) {
            @Serializable
            data class Dimension(
                @SerialName("height") var height: Int = 0, // 288
                @SerialName("rotate") var rotate: Int = 0, // 0
                @SerialName("width") var width: Int = 0 // 512
            )
        }

        @Serializable
        data class Rights(
            @SerialName("arc_pay") var arcPay: Int = 0, // 0
            @SerialName("autoplay") var autoplay: Int = 0, // 1
            @SerialName("bp") var bp: Int = 0, // 0
            @SerialName("clean_mode") var cleanMode: Int = 0, // 0
            @SerialName("download") var download: Int = 0, // 1
            @SerialName("elec") var elec: Int = 0, // 0
            @SerialName("free_watch") var freeWatch: Int = 0, // 0
            @SerialName("hd5") var hd5: Int = 0, // 0
            @SerialName("is_360") var is360: Int = 0, // 0
            @SerialName("is_cooperation") var isCooperation: Int = 0, // 0
            @SerialName("is_stein_gate") var isSteinGate: Int = 0, // 0
            @SerialName("movie") var movie: Int = 0, // 0
            @SerialName("no_background") var noBackground: Int = 0, // 0
            @SerialName("no_reprint") var noReprint: Int = 0, // 0
            @SerialName("no_share") var noShare: Int = 0, // 0
            @SerialName("pay") var pay: Int = 0, // 0
            @SerialName("ugc_pay") var ugcPay: Int = 0, // 0
            @SerialName("ugc_pay_preview") var ugcPayPreview: Int = 0 // 0
        )

        @Serializable
        data class Stat(
            @SerialName("aid") var aid: Int = 0, // 170001
            @SerialName("argue_msg") var argueMsg: String = "",
            @SerialName("coin") var coin: Int = 0, // 276446
            @SerialName("danmaku") var danmaku: Int = 0, // 908915
            @SerialName("dislike") var dislike: Int = 0, // 0
            @SerialName("evaluation") var evaluation: String = "",
            @SerialName("favorite") var favorite: Int = 0, // 892097
            @SerialName("his_rank") var hisRank: Int = 0, // 13
            @SerialName("like") var like: Int = 0, // 861939
            @SerialName("now_rank") var nowRank: Int = 0, // 0
            @SerialName("reply") var reply: Int = 0, // 176677
            @SerialName("share") var share: Int = 0, // 619090
            @SerialName("view") var view: Int = 0 // 42987414
        )

        @Serializable
        data class Subtitle(
            @SerialName("allow_submit") var allowSubmit: Boolean = false, // false
            @SerialName("list") var list: List<Sub> = listOf()
        )

        @Serializable
        data class Sub(
            val id: Int = 0,
            val lan: String = "",
            val lan_doc: String = "",
            val is_lock: Boolean = false,
            val author_mid: Long = 0,
            val subtitle_url: String = "",
            val author: Author = Author(),
        )

        @Serializable
        data class Author(
            val mid: Long = 0,
            val name: String = "",
            val sex: String = "",
            val face: String = "",
            val sign: String = "",
            val rank: Int = 0,
            val birthday: Int = 0,
            val is_fake_account: Int = 0,
            val is_deleted: Int = 0,
        )

        @Serializable
        data class UserGarb(
            @SerialName("url_image_ani_cut") var urlImageAniCut: String = ""
        )
    }
}