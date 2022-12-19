package org.celery.bilibili.serializers

import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import org.celery.bilibili.model.vidoes.info.VideoPages

object VideoPagesSerializer: KSerializer<VideoPages> {
    val s= ListSerializer(VideoPages.VideoPagesItem.serializer())
    override val descriptor: SerialDescriptor
        get() = s.descriptor

    override fun deserialize(decoder: Decoder): VideoPages = VideoPages(s.deserialize(decoder))

    override fun serialize(encoder: Encoder, value: VideoPages) = s.serialize(encoder, value as ArrayList<VideoPages.VideoPagesItem>)

}