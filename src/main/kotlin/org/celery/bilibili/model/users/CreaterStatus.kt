package org.celery.bilibili.model.users


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreaterStatus(
    @SerialName("archive")
    var archive: Archive = Archive(),
    @SerialName("article")
    var article: Article = Article(),
    @SerialName("likes")
    var likes: Int = 0 // 20295095
) {
    @Serializable
    data class Archive(
        @SerialName("view")
        var view: Int = 0 // 213567370
    )

    @Serializable
    data class Article(
        @SerialName("view")
        var view: Int = 0 // 3230808
    )
}