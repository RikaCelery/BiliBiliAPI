package org.celery.bilibili.serializers

import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * 仅在值为 1 时被解析为 true 其他时候均为false
 */
object IntToBooleanSerializer:KSerializer<Boolean> {
    override val descriptor: SerialDescriptor
        get() = Int.serializer().descriptor

    override fun deserialize(decoder: Decoder): Boolean {
       return decoder.decodeInt() == 1
    }

    override fun serialize(encoder: Encoder, value: Boolean) {
        if (value){
            encoder.encodeInt(1)
        }else{
            encoder.encodeInt(0)
        }
    }

}
