package org.celery.bilibili.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(
    @SerialName("code")
    var code: Int, // 0
    @SerialName("data")
    var data: T,
    @SerialName("message")
    var message: String , // 0
    @SerialName("ttl")
    var ttl: Int // 1
){
    suspend inline fun useData(crossinline block:suspend T.(T)->Any): Response<T> {
        if (code!=0){
            throw IllegalStateException("err: ${this.code}, ${this.message}")
        }
        data.block(data)
        return this
    }
    suspend inline fun <R : Any>convertData(crossinline block:suspend T.(T)->R):R{
        if (code!=0){
            throw IllegalStateException("err: ${this.code}, ${this.message}")
        }
        return data.block(data)
    }
}