import TestImplement.json
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import org.celery.bilibili.model.users.UserInfo
import org.celery.bilibili.model.vidoes.info.VideoPages
import org.junit.jupiter.api.Test

class SerializeTest {
    @Test
    fun AccountInfo(){
        json.decodeFromString(
            UserInfo.serializer(),"""
        {
            "mid": 2,
            "name": "碧诗",
            "sex": "男",
            "face": "https://i2.hdslb.com/bfs/face/ef0457addb24141e15dfac6fbf45293ccf1e32ab.jpg",
            "face_nft": 0,
            "face_nft_type": 0,
            "sign": "https://kami.im 直男过气网红 #  We Are Star Dust",
            "rank": 20000,
            "level": 6,
            "jointime": 0,
            "moral": 0,
            "silence": 0,
            "coins": 0,
            "fans_badge": true,
            "fans_medal": {
                "show": true,
                "wear": true,
                "medal": {
                    "uid": 2,
                    "target_id": 335115,
                    "medal_id": 45408,
                    "level": 21,
                    "medal_name": "伍千万",
                    "medal_color": 1725515,
                    "intimacy": 1980,
                    "next_intimacy": 2000,
                    "day_limit": 250000,
                    "medal_color_start": 1725515,
                    "medal_color_end": 5414290,
                    "medal_color_border": 1725515,
                    "is_lighted": 1,
                    "light_status": 1,
                    "wearing_status": 1,
                    "score": 50001980
                }
            },
            "official": {
                "role": 2,
                "title": "bilibili创始人（站长）",
                "desc": "",
                "type": 0
            },
            "vip": {
                "type": 2,
                "status": 1,
                "due_date": 3915273600000,
                "vip_pay_type": 0,
                "theme_type": 0,
                "label": {
                    "path": "",
                    "text": "十年大会员",
                    "label_theme": "ten_annual_vip",
                    "text_color": "#FFFFFF",
                    "bg_style": 1,
                    "bg_color": "#FB7299",
                    "border_color": "",
                    "use_img_label": true,
                    "img_label_uri_hans": "https://i0.hdslb.com/bfs/activity-plat/static/20220608/e369244d0b14644f5e1a06431e22a4d5/wltavwHAkL.gif",
                    "img_label_uri_hant": "",
                    "img_label_uri_hans_static": "https://i0.hdslb.com/bfs/vip/802418ff03911645648b63aa193ba67997b5a0bc.png",
                    "img_label_uri_hant_static": "https://i0.hdslb.com/bfs/activity-plat/static/20220614/e369244d0b14644f5e1a06431e22a4d5/8u7iRTPE7N.png"
                },
                "avatar_subscript": 1,
                "nickname_color": "#FB7299",
                "role": 7,
                "avatar_subscript_url": "",
                "tv_vip_status": 1,
                "tv_vip_pay_type": 0
            },
            "pendant": {
                "pid": 32257,
                "name": "EveOneCat2",
                "image": "https://i2.hdslb.com/bfs/garb/item/488870931b1bba66da36d22848f0720480d3d79a.png",
                "expire": 0,
                "image_enhance": "https://i2.hdslb.com/bfs/garb/item/5974f17f9d96a88bafba2f6d18d647a486e88312.webp",
                "image_enhance_frame": "https://i2.hdslb.com/bfs/garb/item/4316a3910bb0bd6f2f1c267a3e9187f0b9fe5bd0.png"
            },
            "nameplate": {
                "nid": 10,
                "name": "见习偶像",
                "image": "https://i2.hdslb.com/bfs/face/e93dd9edfa7b9e18bf46fd8d71862327a2350923.png",
                "image_small": "https://i2.hdslb.com/bfs/face/275b468b043ec246737ab8580a2075bee0b1263b.png",
                "level": "普通勋章",
                "condition": "所有自制视频总播放数\u003e=10万"
            },
            "user_honour_info": {
                "mid": 0,
                "colour": null,
                "tags": []
            },
            "is_followed": false,
            "top_photo": "http://i1.hdslb.com/bfs/space/cb1c3ef50e22b6096fde67febe863494caefebad.png",
            "theme": {},
            "sys_notice": {},
            "live_room": {
                "roomStatus": 1,
                "liveStatus": 0,
                "url": "https://live.bilibili.com/1024?broadcast_type=0\u0026is_room_feed=0",
                "title": "试图恰鸡",
                "cover": "http://i0.hdslb.com/bfs/live/new_room_cover/96ee5bfd0279a0f18b190340334f43f473038288.jpg",
                "roomid": 1024,
                "roundStatus": 0,
                "broadcast_type": 0,
                "watched_show": {
                    "switch": true,
                    "num": 21,
                    "text_small": "21",
                    "text_large": "21人看过",
                    "icon": "https://i0.hdslb.com/bfs/live/a725a9e61242ef44d764ac911691a7ce07f36c1d.png",
                    "icon_location": "",
                    "icon_web": "https://i0.hdslb.com/bfs/live/8d9d0f33ef8bf6f308742752d13dd0df731df19c.png"
                }
            },
            "birthday": "09-19",
            "school": {
                "name": ""
            },
            "profession": {
                "name": "",
                "department": "",
                "title": "",
                "is_show": 0
            },
            "tags": null,
            "series": {
                "user_upgrade_status": 3,
                "show_upgrade_window": false
            },
            "is_senior_member": 1,
            "mcn_info": null,
            "gaia_res_type": 0,
            "gaia_data": null,
            "is_risk": false,
            "elec": {
                "show_info": {
                    "show": true,
                    "state": 1,
                    "title": "",
                    "icon": "",
                    "jump_url": ""
                }
            },
            "contract": {
                "is_display": false,
                "is_follow_display": false
            }
        }
        """.trimIndent())
    }

    @Test
    fun videoPages(){
        val array = json.decodeFromString<VideoPages>("""
            [{
        "cid": 66445301,
        "page": 1,
        "from": "vupload",
        "part": "00. 宣传短片",
        "duration": 33,
        "vid": "",
        "weblink": "",
        "dimension": {
            "width": 1920,
            "height": 1080,
            "rotate": 0
        }
    }, {
        "cid": 35039663,
        "page": 2,
        "from": "vupload",
        "part": "01. 火柴人与动画师",
        "duration": 133,
        "vid": "",
        "weblink": "",
        "dimension": {
            "width": 1484,
            "height": 1080,
            "rotate": 0
        }
    }, {
        "cid": 35039678,
        "page": 3,
        "from": "vupload",
        "part": "02. 火柴人与动画师 II",
        "duration": 210,
        "vid": "",
        "weblink": "",
        "dimension": {
            "width": 1484,
            "height": 1080,
            "rotate": 0
        }
    }, {
        "cid": 35039693,
        "page": 4,
        "from": "vupload",
        "part": "03. 火柴人与动画师 III",
        "duration": 503,
        "vid": "",
        "weblink": "",
        "dimension": {
            "width": 992,
            "height": 720,
            "rotate": 0
        }
    }]
        """.trimIndent())
        val encode = json.encodeToString(array)
        val array2 = json.decodeFromString<VideoPages>(encode)
        assert(array.containsAll(array2))
        assert(array2.containsAll(array))
    }
}