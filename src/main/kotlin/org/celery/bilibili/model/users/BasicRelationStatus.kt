package org.celery.bilibili.model.users


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BasicRelationStatus(
    @SerialName("black")
    var black: Int = 0, // 0
    @SerialName("follower")
    var follower: Int = 0, // 919515
    @SerialName("following")
    var following: Int = 0, // 32
    @SerialName("mid")
    var mid: Long = 0, // 332704117
    @SerialName("whisper")
    var whisper: Int = 0 // 0
)