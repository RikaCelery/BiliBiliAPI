package org.celery.bilibili.model.users


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserCardInfo(
    @SerialName("archive_count") var archiveCount: Int = 0, // 39
    @SerialName("article_count") var articleCount: Int = 0, // 0
    @SerialName("card") var card: Card = Card(), @SerialName("follower") var follower: Long = 0, // 1031274
    @SerialName("following") var following: Boolean = false, // false
    @SerialName("like_num") var likeNum: Long = 0, // 3510859
    @SerialName("space") var space: Space = Space()
) {
    @Serializable
    data class Card(
        @SerialName("approve") var approve: Boolean = false, // false
        @SerialName("article") var article: Int = 0, // 0
        /**
         * 关注数
         */
        @SerialName("attention") var attention: Int = 0, // 270
        @SerialName("attentions") var attentions: List<@Contextual Any> = listOf(),
        @SerialName("birthday") var birthday: String = "",
        @SerialName("description") var description: String = "",
        @SerialName("DisplayRank") var displayRank: String = "", // 0
        @SerialName("face") var face: String = "", // https://i2.hdslb.com/bfs/face/ef0457addb24141e15dfac6fbf45293ccf1e32ab.jpg
        @SerialName("face_nft") var faceNft: Int = 0, // 0
        @SerialName("face_nft_type") var faceNftType: Int = 0, // 0
        @SerialName("fans") var fans: Long = 0, // 1031274
        @SerialName("friend") var friend: Int = 0, // 270
        @SerialName("is_senior_member") var isSeniorMember: Int = 0, // 1
        @SerialName("level_info") var levelInfo: LevelInfo = LevelInfo(),
        @SerialName("mid") var mid: String = "", // 2
        @SerialName("name") var name: String = "", // 碧诗
        @SerialName("nameplate") var nameplate: Nameplate = Nameplate(),
        @SerialName("Official") var official: Official = Official(),
        @SerialName("official_verify") var officialVerify: OfficialVerify = OfficialVerify(),
        @SerialName("pendant") var pendant: Pendant = Pendant(),
        @SerialName("place") var place: String = "",
        @SerialName("rank") var rank: String = "", // 20000
        @SerialName("regtime") var regtime: Int = 0, // 0
        @SerialName("sex") var sex: String = "", // 男
        @SerialName("sign") var sign: String = "", // https://kami.im 直男过气网红 #  We Are Star Dust
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
            @SerialName("condition") var condition: String = "", // 所有自制视频总播放数>=10万
            @SerialName("image") var image: String = "", // https://i2.hdslb.com/bfs/face/e93dd9edfa7b9e18bf46fd8d71862327a2350923.png
            @SerialName("image_small") var imageSmall: String = "", // https://i0.hdslb.com/bfs/face/275b468b043ec246737ab8580a2075bee0b1263b.png
            @SerialName("level") var level: String = "", // 普通勋章
            @SerialName("name") var name: String = "", // 见习偶像
            @SerialName("nid") var nid: Int = 0 // 10
        )

        @Serializable
        data class Official(
            @SerialName("desc") var desc: String = "", @SerialName("role") var role: Int = 0, // 2
            @SerialName("title") var title: String = "", // bilibili创始人（站长）
            @SerialName("type") var type: Int = 0 // 0
        )

        @Serializable
        data class OfficialVerify(
            @SerialName("desc") var desc: String = "", // bilibili创始人（站长）
            @SerialName("type") var type: Int = 0 // 0
        )

        @Serializable
        data class Pendant(
            @SerialName("expire") var expire: Int = 0, // 0
            @SerialName("image") var image: String = "", // https://i2.hdslb.com/bfs/garb/item/488870931b1bba66da36d22848f0720480d3d79a.png
            @SerialName("image_enhance") var imageEnhance: String = "", // https://i2.hdslb.com/bfs/garb/item/5974f17f9d96a88bafba2f6d18d647a486e88312.webp
            @SerialName("image_enhance_frame") var imageEnhanceFrame: String = "", // https://i2.hdslb.com/bfs/garb/item/4316a3910bb0bd6f2f1c267a3e9187f0b9fe5bd0.png
            @SerialName("name") var name: String = "", // EveOneCat2
            @SerialName("pid") var pid: Long = 0 // 32257
        )

        @Serializable
        data class Vip(
            @SerialName("avatar_subscript") var avatarSubscript: Int = 0, // 1
            @SerialName("avatar_subscript_url") var avatarSubscriptUrl: String = "",
            @SerialName("due_date") var dueDate: Long = 0, // 3915273600000
            @SerialName("label") var label: Label = Label(),
            @SerialName("nickname_color") var nicknameColor: String = "", // #FB7299
            @SerialName("role") var role: Int = 0, // 7
            @SerialName("status") var status: Int = 0, // 1
            @SerialName("theme_type") var themeType: Int = 0, // 0
            @SerialName("tv_vip_pay_type") var tvVipPayType: Int = 0, // 0
            @SerialName("tv_vip_status") var tvVipStatus: Int = 0, // 1
            @SerialName("type") var type: Int = 0, // 2
            @SerialName("vip_pay_type") var vipPayType: Int = 0, // 0
            @SerialName("vipStatus") var vipStatus: Int = 0, // 1
            @SerialName("vipType") var vipType: Int = 0 // 2
        ) {
            @Serializable
            data class Label(
                @SerialName("bg_color") var bgColor: String = "", // #FB7299
                @SerialName("bg_style") var bgStyle: Int = 0, // 1
                @SerialName("border_color") var borderColor: String = "",
                @SerialName("img_label_uri_hans") var imgLabelUriHans: String = "", // https://i0.hdslb.com/bfs/activity-plat/static/20220608/e369244d0b14644f5e1a06431e22a4d5/wltavwHAkL.gif
                @SerialName("img_label_uri_hans_static") var imgLabelUriHansStatic: String = "", // https://i0.hdslb.com/bfs/vip/802418ff03911645648b63aa193ba67997b5a0bc.png
                @SerialName("img_label_uri_hant") var imgLabelUriHant: String = "",
                @SerialName("img_label_uri_hant_static") var imgLabelUriHantStatic: String = "", // https://i0.hdslb.com/bfs/activity-plat/static/20220614/e369244d0b14644f5e1a06431e22a4d5/8u7iRTPE7N.png
                @SerialName("label_theme") var labelTheme: String = "", // ten_annual_vip
                @SerialName("path") var path: String = "",
                @SerialName("text") var text: String = "", // 十年大会员
                @SerialName("text_color") var textColor: String = "", // #FFFFFF
                @SerialName("use_img_label") var useImgLabel: Boolean = false // true
            )
        }
    }

    @Serializable
    data class Space(
        @SerialName("l_img") var lImg: String = "", // http://i0.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png
        @SerialName("s_img") var sImg: String = "" // http://i0.hdslb.com/bfs/space/768cc4fd97618cf589d23c2711a1d1a729f42235.png
    )
}