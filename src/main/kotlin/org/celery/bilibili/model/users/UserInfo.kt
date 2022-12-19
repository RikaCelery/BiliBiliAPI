package org.celery.bilibili.model.users


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.celery.bilibili.model.serializers.IntToBooleanSerializer

/**
 * for http://api.bilibili.com/x/space/acc/info
 */
@Serializable
data class UserInfo(
    /**
     * 生日	MM-DD
     *
     * 如设置隐私为空
     */
    @SerialName("birthday") var birthday: String = "", // 09-19
    /**
     * 需要登录(Cookie)
     *
     * 只能查看自己的
     *
     * 默认为0
     */
    @SerialName("coins") var coins: Long = 0, // 0
    /**
     * 是否显示老粉计划
     */
    @SerialName("contract") var contract: Contract = Contract(),
    /**
     * 充电信息
     */
    @SerialName("elec") var elec: Elec = Elec(),
    @SerialName("face") var face: String = "", // https://i2.hdslb.com/bfs/face/ef0457addb24141e15dfac6fbf45293ccf1e32ab.jpg
    @SerialName("face_nft") var faceNft: Long = 0, // 0
    @SerialName("face_nft_type") var faceNftType: Long = 0, // 0
    /**
     * 是否具有粉丝勋章
     */
    @SerialName("fans_badge") var fansBadge: Boolean = false, // true
    /**
     * 粉丝勋章信息
     */
    @SerialName("fans_medal") var fansMedal: FansMedal = FansMedal(),
    @Contextual @SerialName("gaia_data") var gaiaData: Any? = null, // null
    @SerialName("gaia_res_type") var gaiaResType: Long = 0, // 0
    /**
     * 是否关注此用户
     *
     * true：已关注
    false：未关注
     *
    需要登录(Cookie)
    未登录恒为false
     *
     */
    @SerialName("is_followed") var isFollowed: Boolean = false, // false
    @SerialName("is_risk") var isRisk: Boolean = false, // false
    /**
     * 是否为硬核会员
     */
    @Serializable(with = IntToBooleanSerializer::class) @SerialName("is_senior_member") var isSeniorMember: Boolean = false, // 1
    @SerialName("jointime") var jointime: Long = 0, // 0
    @SerialName("level") var level: Long = 0, // 6
    /**
     * 直播间信息
     */
    @SerialName("live_room") var liveRoom: LiveRoom = LiveRoom(),
    @Contextual @SerialName("mcn_info") var mcnInfo: Any? = null, // null
    /**
     * mid
     */
    @SerialName("mid") var mid: Long = 0, // 2
    @SerialName("moral") var moral: Long = 0, // 0
    @SerialName("name") var name: String = "", // 碧诗
    /**
     * 勋章信息
     */
    @SerialName("nameplate") var nameplate: Nameplate = Nameplate(),
    @SerialName("official") var official: Official = Official(),
    /**
     * 头像框信息
     */
    @SerialName("pendant") var pendant: Pendant = Pendant(),
    /**
     * 专业资质信息
     */
    @SerialName("profession") var profession: Profession = Profession(),
    @SerialName("rank") var rank: Long = 0, // 20000
    /**
     * 学校
     */
    @SerialName("school") var school: School = School(),
    @SerialName("series") var series: Series = Series(),
    @SerialName("sex") var sex: String = "", // 男
    @SerialName("sign") var sign: String = "", // https://kami.im 直男过气网红 #  We Are Star Dust
    @SerialName("silence") var silence: Long = 0, // 0
    /**
     * 	系统通知 无内容则为空对象
     *
     * 	主要用于展示如用户争议、纪念账号等等
     */
    @SerialName("sys_notice") var sysNotice: SysNotice = SysNotice(),
    /**
     * 个人标签
     */
    @Contextual @SerialName("tags") var tags: Any? = null, // null
    @SerialName("theme") var theme: Theme = Theme(),
    @SerialName("top_photo") var topPhoto: String = "", // http://i1.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png
    @SerialName("user_honour_info") var userHonourInfo: UserHonourInfo = UserHonourInfo(),
    /**
     * 会员信息
     */
    @SerialName("vip") var vip: Vip = Vip(),
) {
    @Serializable
    data class Contract(
        @Deprecated("在页面中未使用此字段")
        @SerialName("is_display") var isDisplay: Boolean = false, // false
        /**
         * 是否在显示老粉计划
         *
         * true：显示
        false：不显示
         */
        @SerialName("is_follow_display") var isFollowDisplay: Boolean = false, // false
    )

    @Serializable
    data class Elec(
        @SerialName("show_info") var showInfo: ShowInfo = ShowInfo(),
    ) {
        @Serializable
        data class ShowInfo(
            @Deprecated("空串")
            @SerialName("icon") var icon: String = "",
            @Deprecated("空串")
            @SerialName("jump_url") var jumpUrl: String = "",
            /**
             * 是否开通了充电
             */
            @SerialName("show") var show: Boolean = false, // true
            /**
             * 状态
             *
             * -1：未开通 1：已开通
             */
            @SerialName("state") var state: Int = 0, // 1
            @Deprecated("空串")
            @SerialName("title") var title: String = "",
        )
    }

    @Serializable
    data class FansMedal(
        @SerialName("medal") var medal: Medal = Medal(),
        @Deprecated("unknown")
        @SerialName("show") var show: Boolean = false, // true
        /**
         * 是否佩戴了粉丝勋章
         */
        @SerialName("wear") var wear: Boolean = false, // true
    ) {
        @Serializable
        data class Medal(
            /**
             * 每日亲密度获取上限
             */
            @SerialName("day_limit") var dayLimit: Long = 0, // 250000
            /**
             * 当前亲密度
             */
            @SerialName("intimacy") var intimacy: Long = 0, // 1980
            @SerialName("is_lighted") var isLighted: Long = 0, // 1
            /**
             * 粉丝勋章等级
             */
            @SerialName("level") var level: UByte = 0u, // 21
            @SerialName("light_status") var lightStatus: Long = 0, // 1
            /**
             * 	颜色
             */
            @SerialName("medal_color") var medalColor: Long = 0, // 1725515
            @SerialName("medal_color_border") var medalColorBorder: Long = 0, // 1725515
            @SerialName("medal_color_end") var medalColorEnd: Long = 0, // 5414290
            @SerialName("medal_color_start") var medalColorStart: Long = 0, // 1725515
            /**
             * 粉丝勋章id
             */
            @SerialName("medal_id") var medalId: Long = 0, // 45408
            /**
             * 粉丝勋章名称
             */
            @SerialName("medal_name") var medalName: String = "", // 伍千万
            /**
             * 下一等级所需亲密度
             */
            @SerialName("next_intimacy") var nextIntimacy: Long = 0, // 2000
            @SerialName("score") var score: Long = 0, // 50001980
            /**
             * 粉丝勋章所属UP的mid
             */
            @SerialName("target_id") var targetMid: Long = 0, // 335115
            /**
             * 此用户mid
             */
            @SerialName("uid") var mid: Long = 0, // 2
            @SerialName("wearing_status") var wearingStatus: Long = 0, // 1
        )
    }

    @Serializable
    data class LiveRoom(
        @SerialName("broadcast_type") var broadcastType: Long = 0, // 0
        @SerialName("cover") var cover: String = "", // http://i0.hdslb.com/bfs/live/new_room_cover/96ee5bfd0279a0f18b190340334f43f473038288.jpg
        @SerialName("liveStatus") var liveStatus: Long = 0, // 0
        @SerialName("roomStatus") var roomStatus: Long = 0, // 1
        @SerialName("roomid") var roomid: Long = 0, // 1024
        @SerialName("roundStatus") var roundStatus: Long = 0, // 0
        @SerialName("title") var title: String = "", // 试图恰鸡
        @SerialName("url") var url: String = "", // https://live.bilibili.com/1024?broadcast_type=0&is_room_feed=0
        @SerialName("watched_show") var watchedShow: WatchedShow = WatchedShow(),
    ) {
        @Serializable
        data class WatchedShow(
            @SerialName("icon") var icon: String = "", // https://i0.hdslb.com/bfs/live/a725a9e61242ef44d764ac911691a7ce07f36c1d.png
            @SerialName("icon_location") var iconLocation: String = "",
            @SerialName("icon_web") var iconWeb: String = "", // https://i0.hdslb.com/bfs/live/8d9d0f33ef8bf6f308742752d13dd0df731df19c.png
            @SerialName("num") var num: Long = 0, // 21
            @SerialName("switch") var switch: Boolean = false, // true
            @SerialName("text_large") var textLarge: String = "", // 21人看过
            @SerialName("text_small") var textSmall: String = "", // 21
        )
    }

    @Serializable
    data class Nameplate(
        @SerialName("condition") var condition: String = "", // 所有自制视频总播放数>=10万
        @SerialName("image") var image: String = "", // https://i2.hdslb.com/bfs/face/e93dd9edfa7b9e18bf46fd8d71862327a2350923.png
        @SerialName("image_small") var imageSmall: String = "", // https://i2.hdslb.com/bfs/face/275b468b043ec246737ab8580a2075bee0b1263b.png
        @SerialName("level") var level: String = "", // 普通勋章
        @SerialName("name") var name: String = "", // 见习偶像
        @SerialName("nid") var nid: Long = 0, // 10
    )

    /**
     * 官方认证信息（小闪电）
     */
    @Serializable
    data class Official(
        @SerialName("desc") var desc: String = "",
        @SerialName("role") var role: Long = 0, // 2
        @SerialName("title") var title: String = "", // bilibili创始人（站长）
        @SerialName("type") var type: Long = 0, // 0
    )

    @Serializable
    data class Pendant(
        @SerialName("expire") var expire: Long = 0, // 0
        @SerialName("image") var image: String = "", // https://i2.hdslb.com/bfs/garb/item/488870931b1bba66da36d22848f0720480d3d79a.png
        @SerialName("image_enhance") var imageEnhance: String = "", // https://i2.hdslb.com/bfs/garb/item/5974f17f9d96a88bafba2f6d18d647a486e88312.webp
        @SerialName("image_enhance_frame") var imageEnhanceFrame: String = "", // https://i2.hdslb.com/bfs/garb/item/4316a3910bb0bd6f2f1c267a3e9187f0b9fe5bd0.png
        @SerialName("name") var name: String = "", // EveOneCat2
        @SerialName("pid") var pid: Long = 0, // 32257
    )

    @Serializable
    data class Profession(
        @SerialName("department") var department: String = "",
        @SerialName("is_show") var isShow: Long = 0, // 0
        @SerialName("name") var name: String = "",
        @SerialName("title") var title: String = "",
    )

    @Serializable
    data class School(
        @SerialName("name") var name: String = "",
    )

    @Serializable
    data class Series(
        @SerialName("show_upgrade_window") var showUpgradeWindow: Boolean = false, // false
        @SerialName("user_upgrade_status") var userUpgradeStatus: Long = 0, // 3
    )

    @Serializable
    class SysNotice(
        val id: Int = 0,
        val content: String = "",
        val url: String = "",
        @SerialName("notice_type")
        val noticeType: Byte = 1,
        val icon: String = "",
        @SerialName("text_color")
        val textColor: String = "",
        @SerialName("bg_color")
        val bgColor: String = ""

    )

    @Serializable
    class Theme

    @Serializable
    data class UserHonourInfo(
        @Contextual @SerialName("colour") var colour: Any? = null, // null
        @SerialName("mid") var mid: Long = 0, // 0

        @SerialName("tags") var tags: List<@Contextual Any> = listOf(),
    )

    @Serializable
    data class Vip(
        @SerialName("avatar_subscript") var avatarSubscript: Long = 0, // 1
        @SerialName("avatar_subscript_url") var avatarSubscriptUrl: String = "",
        @SerialName("due_date") var dueDate: Long = 0, // 3915273600000
        @SerialName("label") var label: Label = Label(),
        @SerialName("nickname_color") var nicknameColor: String = "", // #FB7299
        @SerialName("role") var role: Long = 0, // 7
        @SerialName("status") var status: Long = 0, // 1
        @SerialName("theme_type") var themeType: Long = 0, // 0
        @SerialName("tv_vip_pay_type") var tvVipPayType: Long = 0, // 0
        @SerialName("tv_vip_status") var tvVipStatus: Long = 0, // 1
        @SerialName("type") var type: Long = 0, // 2
        @SerialName("vip_pay_type") var vipPayType: Long = 0, // 0
    ) {
        @Serializable
        data class Label(
            @SerialName("bg_color") var bgColor: String = "", // #FB7299
            @SerialName("bg_style") var bgStyle: Long = 0, // 1
            @SerialName("border_color") var borderColor: String = "",
            @SerialName("img_label_uri_hans") var imgLabelUriHans: String = "", // https://i0.hdslb.com/bfs/activity-plat/static/20220608/e369244d0b14644f5e1a06431e22a4d5/wltavwHAkL.gif
            @SerialName("img_label_uri_hans_static") var imgLabelUriHansStatic: String = "", // https://i0.hdslb.com/bfs/vip/802418ff03911645648b63aa193ba67997b5a0bc.png
            @SerialName("img_label_uri_hant") var imgLabelUriHant: String = "",
            @SerialName("img_label_uri_hant_static") var imgLabelUriHantStatic: String = "", // https://i0.hdslb.com/bfs/activity-plat/static/20220614/e369244d0b14644f5e1a06431e22a4d5/8u7iRTPE7N.png
            @SerialName("label_theme") var labelTheme: String = "", // ten_annual_vip
            @SerialName("path") var path: String = "",
            @SerialName("text") var text: String = "", // 十年大会员
            @SerialName("text_color") var textColor: String = "", // #FFFFFF
            @SerialName("use_img_label") var useImgLabel: Boolean = false, // true
        )
    }
}