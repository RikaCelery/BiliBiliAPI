package org.celery.bilibili.model.reply


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Reply(
    var config: Config = Config(),
    var control: Control = Control(),
    var page: Page = Page(),
    var replies: List<BasicReply> = listOf(),
    var root: BasicReply = BasicReply(),
    @SerialName("show_bvid")
    var showBvid: Boolean = false,
    @SerialName("show_text")
    var showText: String = "",
    @SerialName("show_type")
    var showType: Int = 0,
    var upper: Upper = Upper()
) {
    @Serializable
    data class Config(
        @SerialName("read_only")
        var readOnly: Boolean = false,
        @SerialName("show_up_flag")
        var showUpFlag: Boolean = false,
        var showtopic: Int = 0
    )

    @Serializable
    data class Control(
        @SerialName("answer_guide_android_url")
        var answerGuideAndroidUrl: String = "",
        @SerialName("answer_guide_icon_url")
        var answerGuideIconUrl: String = "",
        @SerialName("answer_guide_ios_url")
        var answerGuideIosUrl: String = "",
        @SerialName("answer_guide_text")
        var answerGuideText: String = "",
        @SerialName("bg_text")
        var bgText: String = "",
        @SerialName("child_input_text")
        var childInputText: String = "",
        @SerialName("disable_jump_emote")
        var disableJumpEmote: Boolean = false,
        @SerialName("giveup_input_text")
        var giveupInputText: String = "",
        @SerialName("input_disable")
        var inputDisable: Boolean = false,
        @SerialName("root_input_text")
        var rootInputText: String = "",
        @SerialName("screenshot_icon_state")
        var screenshotIconState: Int = 0,
        @SerialName("show_text")
        var showText: String = "",
        @SerialName("show_type")
        var showType: Int = 0,
        @SerialName("upload_picture_icon_state")
        var uploadPictureIconState: Int = 0,
        @SerialName("web_selection")
        var webSelection: Boolean = false
    )

    @Serializable
    data class Page(
        var count: Int = 0,
        var num: Int = 0,
        var size: Int = 0
    )

    @Serializable
    data class Upper(
        var mid: Int = 0
    )

}