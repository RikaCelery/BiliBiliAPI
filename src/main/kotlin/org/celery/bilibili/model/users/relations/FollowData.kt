package org.celery.bilibili.model.users.relations


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 查询用户粉丝明细
 * https://api.bilibili.com/x/relation/followers
 *
 * 查询用户关注明细
 * https://app.biliapi.net/x/v2/relation/followings
 *
 * 查询用户关注明细2
 * https://api.bilibili.com/x/relation/followings
 *
 * 搜索关注明细
 * https://api.bilibili.com/x/relation/followings/search
 *
 * 查询共同关注明细
 * https://api.bilibili.com/x/relation/same/followings
 *
 * 查询悄悄关注明细
 * https://api.bilibili.com/x/relation/whispers
 *
 * 查询黑名单明细
 * https://api.bilibili.com/x/relation/blacks
 */
@Serializable
data class FollowData(
    @SerialName("list")
    var list: List<Mamber> = listOf(),
    @SerialName("re_version")
    var reVersion: Long = 0, // 3228575555
    @SerialName("total")
    var total: Int = 0 // 699
) {
    @Serializable
    data class Mamber(
        @SerialName("attribute")
        var attribute: Int = 0, // 2
        @SerialName("face")
        var face: String = "", // https://i0.hdslb.com/bfs/face/74c82caee6d9eb623e56161ea8ed6d68afabfeae.jpg
        @SerialName("mid")
        var mid: Long = 0, // 14082
        @SerialName("mtime")
        var mtime: Long = 0, // 1584271945
        @SerialName("official_verify")
        var officialVerify: OfficialVerify = OfficialVerify(),
        @SerialName("sign")
        var sign: String = "", // 都说了是天依爹地，不是妈咪。私信有点多回复不过来～商业合作啥的请移步Weibo私信@山新 哦哦哦～
        @SerialName("special")
        var special: Int = 0, // 0
        @SerialName("tag")
        var tag: List<Int>? = null,
        @SerialName("uname")
        var uname: String = "", // 山新
        @SerialName("vip")
        var vip: Vip = Vip()
    ) {
        @Serializable
        data class OfficialVerify(
            @SerialName("desc")
            var desc: String = "", // 配音演员、声优。洛天依声源提供者。
            @SerialName("type")
            var type: Int = 0 // 0
        )

        @Serializable
        data class Vip(
            @SerialName("accessStatus")
            var accessStatus: Int = 0, // 0
            @SerialName("dueRemark")
            var dueRemark: String = "",
            @SerialName("label")
            var label: Label = Label(),
            @SerialName("themeType")
            var themeType: Int = 0, // 0
            @SerialName("vipDueDate")
            var vipDueDate: Long = 0, // 1601654400000
            @SerialName("vipStatus")
            var vipStatus: Int = 0, // 1
            @SerialName("vipStatusWarn")
            var vipStatusWarn: String = "",
            @SerialName("vipType")
            var vipType: Int = 0 // 2
        ) {
            @Serializable
            data class Label(
                @SerialName("path")
                var path: String = ""
            )
        }
    }
}