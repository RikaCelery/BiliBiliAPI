package org.celery.bilibili.model.users


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MyInfo(
    @SerialName("birthday")
    var birthday: Int = 0, // 1005148800
    @SerialName("coins")
    var coins: Double = 0.0, // 408.2
    @SerialName("digital_id")
    var digitalId: String = "",
    @SerialName("digital_type")
    var digitalType: Int = 0, // -2
    @SerialName("email_status")
    var emailStatus: Int = 0, // 1
    @SerialName("face")
    var face: String = "", // https://i2.hdslb.com/bfs/face/97f935815a7637a0afc75038e2130de3b951efda.jpg
    @SerialName("face_nft")
    var faceNft: Int = 0, // 0
    @SerialName("face_nft_new")
    var faceNftNew: Int = 0, // 0
    @SerialName("follower")
    var follower: Int = 0, // 484
    @SerialName("following")
    var following: Int = 0, // 484
    @SerialName("honours")
    var honours: Honours = Honours(),
    @SerialName("identification")
    var identification: Int = 0, // 1
    @SerialName("in_reg_audit")
    var inRegAudit: Int = 0, // 0
    @SerialName("is_deleted")
    var isDeleted: Int = 0, // 0
    @SerialName("is_fake_account")
    var isFakeAccount: Int = 0, // 0
    @SerialName("is_rip_user")
    var isRipUser: Boolean = false, // false
    @SerialName("is_senior_member")
    var isSeniorMember: Int = 0, // 0
    @SerialName("is_tourist")
    var isTourist: Int = 0, // 0
    @SerialName("jointime")
    var jointime: Int = 0, // 0
    @SerialName("level")
    var level: Int = 0, // 5
    @SerialName("level_exp")
    var levelExp: LevelExp = LevelExp(),
    @SerialName("mid")
    var mid: Long = 0, // 90343082
    @SerialName("moral")
    var moral: Int = 0, // 70
    @SerialName("name")
    var name: String = "", // 番茄酱酱ミ
    @SerialName("nameplate")
    var nameplate: Nameplate = Nameplate(),
    @SerialName("official")
    var official: Official = Official(),
    @SerialName("pendant")
    var pendant: Pendant = Pendant(),
    @SerialName("pin_prompting")
    var pinPrompting: Int = 0, // 0
    @SerialName("profession")
    var profession: Profession = Profession(),
    @SerialName("rank")
    var rank: Int = 0, // 10000
    @SerialName("sex")
    var sex: String = "", // 保密
    @SerialName("sign")
    var sign: String = "", // skurdab 妈妈爱你 QQ   1436898372
    @SerialName("silence")
    var silence: Int = 0, // 0
    @SerialName("tel_status")
    var telStatus: Int = 0, // 1
    @SerialName("vip")
    var vip: Vip = Vip()
) {
    @Serializable
    data class Honours(
        @SerialName("colour")
        var colour: Colour = Colour(),
        @SerialName("mid")
        var mid: Long = 0, // 90343082
        @SerialName("tags")
        var tags: @Contextual Any? = null // null
    ) {
        @Serializable
        data class Colour(
            @SerialName("dark")
            var dark: String = "", // #CE8620
            @SerialName("normal")
            var normal: String = "" // #F0900B
        )
    }

    @Serializable
    data class LevelExp(
        @SerialName("current_exp")
        var currentExp: Int = 0, // 25765
        @SerialName("current_level")
        var currentLevel: Int = 0, // 5
        @SerialName("current_min")
        var currentMin: Int = 0, // 10800
        @SerialName("level_up")
        var levelUp: Int = 0, // -62135596800
        @SerialName("next_exp")
        var nextExp: Int = 0 // 28800
    )

    @Serializable
    data class Nameplate(
        @SerialName("condition")
        var condition: String = "",
        @SerialName("image")
        var image: String = "",
        @SerialName("image_small")
        var imageSmall: String = "",
        @SerialName("level")
        var level: String = "",
        @SerialName("name")
        var name: String = "",
        @SerialName("nid")
        var nid: Int = 0 // 0
    )

    @Serializable
    data class Official(
        @SerialName("desc")
        var desc: String = "",
        @SerialName("role")
        var role: Int = 0, // 0
        @SerialName("title")
        var title: String = "",
        @SerialName("type")
        var type: Int = 0 // -1
    )

    @Serializable
    data class Pendant(
        @SerialName("expire")
        var expire: Int = 0, // 0
        @SerialName("image")
        var image: String = "", // https://i2.hdslb.com/bfs/garb/item/4f8f3f1f2d47f0dad84f66aa57acd4409ea46361.png
        @SerialName("image_enhance")
        var imageEnhance: String = "", // https://i2.hdslb.com/bfs/garb/item/fe0b83b53e2342b16646f6e7a9370d8a867decdb.webp
        @SerialName("image_enhance_frame")
        var imageEnhanceFrame: String = "", // https://i2.hdslb.com/bfs/garb/item/127c507ec8448be30cf5f79500ecc6ef2fd32f2c.png
        @SerialName("name")
        var name: String = "", // 初音未来13周年
        @SerialName("pid")
        var pid: Int = 0 // 2511
    )

    @Serializable
    data class Profession(
        @SerialName("category_one")
        var categoryOne: String = "",
        @SerialName("department")
        var department: String = "",
        @SerialName("id")
        var id: Int = 0, // 0
        @SerialName("is_show")
        var isShow: Int = 0, // 0
        @SerialName("name")
        var name: String = "",
        @SerialName("realname")
        var realname: String = "",
        @SerialName("show_name")
        var showName: String = "",
        @SerialName("title")
        var title: String = ""
    )

    @Serializable
    data class Vip(
        @SerialName("avatar_subscript")
        var avatarSubscript: Int = 0, // 1
        @SerialName("avatar_subscript_url")
        var avatarSubscriptUrl: String = "",
        @SerialName("due_date")
        var dueDate: Long = 0, // 1684857600000
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
        var vipPayType: Int = 0 // 1
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