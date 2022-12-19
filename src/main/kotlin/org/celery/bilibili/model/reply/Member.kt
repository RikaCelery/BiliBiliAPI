package org.celery.bilibili.model.reply

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class Member(
    var avatar: String = "",
    @SerialName("avatar_item") var avatarItem: AvatarItem = AvatarItem(),
    @SerialName("contract_desc") var contractDesc: String = "",
    @SerialName("face_nft_new") var faceNftNew: Int = 0,
    @SerialName("fans_detail") var fansDetail: JsonElement? = null,
    @SerialName("is_contractor") var isContractor: Boolean = false,
    @SerialName("is_senior_member") var isSeniorMember: Int = 0,
    @SerialName("level_info") var levelInfo: LevelInfo = LevelInfo(),
    var mid: Long = 0,
    var nameplate: Nameplate = Nameplate(),
    @SerialName("nft_interaction") var nftInteraction: JsonElement? = null,
    @SerialName("official_verify") var officialVerify: OfficialVerify = OfficialVerify(),
    var pendant: Pendant = Pendant(),
//    var rank: String = "",
    var sex: String = "",
    var sign: String = "",
    var uname: String = "",
//    @SerialName("user_sailing") var userSailing: UserSailing = UserSailing(),
    var vip: Vip = Vip()


) {
    @Serializable
    data class AvatarItem(
        @SerialName("container_size") var containerSize: ContainerSize = ContainerSize(),
        @SerialName("fallback_layers") var fallbackLayers: FallbackLayers = FallbackLayers(),
        var mid: String = ""
    )
    {
        @Serializable
        data class ContainerSize(
            var height: Double = 0.0, var width: Double = 0.0
        )

        @Serializable
        data class FallbackLayers(
            @SerialName("is_critical_group") var isCriticalGroup: Boolean = false, var layers: List<Layer> = listOf()
        ) {
            @Serializable
            data class Layer(
                @SerialName("general_spec") var generalSpec: GeneralSpec = GeneralSpec(),
                @SerialName("layer_config") var layerConfig: LayerConfig = LayerConfig(),
                var resource: Resource = Resource(),
                var visible: Boolean = false
            ) {
                @Serializable
                data class GeneralSpec(
                    @SerialName("pos_spec") var posSpec: PosSpec = PosSpec(),
                    @SerialName("render_spec") var renderSpec: RenderSpec = RenderSpec(),
                    @SerialName("size_spec") var sizeSpec: SizeSpec = SizeSpec()
                ) {
                    @Serializable
                    data class PosSpec(
                        @SerialName("axis_x") var axisX: Double = 0.0,
                        @SerialName("axis_y") var axisY: Double = 0.0,
                        @SerialName("coordinate_pos") var coordinatePos: Int = 0
                    )

                    @Serializable
                    data class RenderSpec(
                        var opacity: Int = 0
                    )

                    @Serializable
                    data class SizeSpec(
                        var height: Double = 0.0, var width: Double = 0.0
                    )
                }

                @Serializable
                data class LayerConfig(
                    @SerialName("is_critical") var isCritical: Boolean? = null,
                    @SerialName("layer_mask") var layerMask: LayerMask? = null,
                    var tags: Tags = Tags()
                ) {
                    @Serializable
                    data class LayerMask(
                        @SerialName("general_spec") var generalSpec: GeneralSpec = GeneralSpec(),
                        @SerialName("mask_src") var maskSrc: MaskSrc = MaskSrc()
                    ) {
                        @Serializable
                        data class GeneralSpec(
                            @SerialName("pos_spec") var posSpec: PosSpec = PosSpec(),
                            @SerialName("render_spec") var renderSpec: RenderSpec = RenderSpec(),
                            @SerialName("size_spec") var sizeSpec: SizeSpec = SizeSpec()
                        ) {
                            @Serializable
                            data class PosSpec(
                                @SerialName("axis_x") var axisX: Double = 0.0,
                                @SerialName("axis_y") var axisY: Double = 0.0,
                                @SerialName("coordinate_pos") var coordinatePos: Int = 0
                            )

                            @Serializable
                            data class RenderSpec(
                                var opacity: Int = 0
                            )

                            @Serializable
                            data class SizeSpec(
                                var height: Double = 0.0, var width: Double = 0.0
                            )
                        }

                        @Serializable
                        data class MaskSrc(
                            var draw: Draw = Draw(), @SerialName("src_type") var srcType: Int = 0
                        ) {
                            @Serializable
                            data class Draw(
                                @SerialName("color_config") var colorConfig: ColorConfig = ColorConfig(),
                                @SerialName("draw_type") var drawType: Int = 0,
                                @SerialName("fill_mode") var fillMode: Int = 0
                            ) {
                                @Serializable
                                data class ColorConfig(
                                    var day: Day = Day()
                                ) {
                                    @Serializable
                                    data class Day(
                                        var argb: String = ""
                                    )
                                }
                            }
                        }
                    }

                    @Serializable
                    data class Tags(
                        @SerialName("AVATAR_LAYER") var aVATARLAYER: AVATARLAYER? = null,
                        @SerialName("PENDENT_LAYER") var pENDENTLAYER: PENDENTLAYER? = null
                    ) {
                        @Serializable
                        class AVATARLAYER

                        @Serializable
                        class PENDENTLAYER
                    }
                }

                @Serializable
                data class Resource(
                    @SerialName("res_image") var resImage: ResImage = ResImage(),
                    @SerialName("res_type") var resType: Int = 0
                ) {
                    @Serializable
                    data class ResImage(
                        @SerialName("image_src") var imageSrc: ImageSrc = ImageSrc()
                    ) {
                        @Serializable
                        data class ImageSrc(
                            var placeholder: Int? = null,
                            var remote: Remote = Remote(),
                            @SerialName("src_type") var srcType: Int = 0
                        ) {
                            @Serializable
                            data class Remote(
                                @SerialName("bfs_style") var bfsStyle: String = "", var url: String = ""
                            )
                        }
                    }
                }
            }
        }
    }

    @Serializable
    data class LevelInfo(
        @SerialName("current_exp") var currentExp: Int = 0,
        @SerialName("current_level") @Deprecated("unknown") var currentLevel: Int = 0,
        @SerialName("current_min") @Deprecated("unknown") var currentMin: Int = 0,
        @SerialName("next_exp") @Deprecated("unknown") var nextExp: Int = 0
    )

    @Serializable
    data class Nameplate(
        var condition: String = "",
        var image: String = "",
        @SerialName("image_small") var imageSmall: String = "",
        var level: String = "",
        var name: String = "",
        var nid: Int = 0
    )

    @Serializable
    data class OfficialVerify(
        var desc: String = "", var type: Int = 0
    )

    @Serializable
    data class Pendant(
        var expire: Int = 0,
        var image: String = "",
        @SerialName("image_enhance") var imageEnhance: String = "",
        @SerialName("image_enhance_frame") @Deprecated("unknown") var imageEnhanceFrame: String = "",
        var name: String = "",
        var pid: Int = 0
    )

    @Serializable
    data class UserSailing(
        var cardbg: Cardbg? = null,
        var pendant: Pendant? = null,
        @Deprecated("unknown") @SerialName("cardbg_with_focus") var cardbgWithFocus: JsonElement? = null,
    ) {
        @Serializable
        data class Cardbg(
            var fan: Fan = Fan(),
            var id: Int = 0,
            var image: String = "",
            @SerialName("jump_url") var jumpUrl: String = "",
            var name: String = "",
            var type: String = ""
        ) {
            @Serializable
            data class Fan(
                var color: String = "",
                @SerialName("is_fan") var isFan: Int = 0,
                var name: String = "",
                @SerialName("num_desc") var numDesc: String = "",
                var number: Int = 0
            )
        }

        @Serializable
        data class Pendant(
            var id: Int = 0,
            var image: String = "",
            @SerialName("image_enhance") var imageEnhance: String = "",
            @SerialName("image_enhance_frame") var imageEnhanceFrame: String = "",
            @SerialName("jump_url") var jumpUrl: String = "",
            var name: String = "",
            var type: String = ""
        )
    }

    @Serializable
    data class Vip(
        @Deprecated("unknown") var accessStatus: Int = 0,
        @Deprecated("unknown") @SerialName("avatar_subscript") var avatarSubscript: Int = 0,
        @Deprecated("unknown") var dueRemark: String = "",
        var label: Label = Label(),
        @SerialName("nickname_color") var nicknameColor: String = "",
        var themeType: Int = 0,
        var vipDueDate: Long = 0,
        var vipStatus: Int = 0,
        var vipStatusWarn: String = "",
        var vipType: Int = 0
    ) {
        @Serializable
        data class Label(
            @Deprecated("unknown") @SerialName("bg_color") var bgColor: String = "",
            @Deprecated("unknown") @SerialName("bg_style") var bgStyle: Int = 0,
            @Deprecated("unknown") @SerialName("border_color") var borderColor: String = "",
            @Deprecated("unknown") @SerialName("img_label_uri_hans") var imgLabelUriHans: String = "",
            @Deprecated("unknown") @SerialName("img_label_uri_hans_static") var imgLabelUriHansStatic: String = "",
            @Deprecated("unknown") @SerialName("img_label_uri_hant") var imgLabelUriHant: String = "",
            @Deprecated("unknown") @SerialName("img_label_uri_hant_static") var imgLabelUriHantStatic: String = "",
            @Deprecated("unknown") @SerialName("label_theme") var labelTheme: String = "",
            @Deprecated("unknown") var path: String = "",
            var text: String = "",
            @SerialName("text_color") var textColor: String = "",
            @Deprecated("unknown") @SerialName("use_img_label") var useImgLabel: Boolean = false
        )
    }
}