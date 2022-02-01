package com.example.response

open class Response(message: String, payload: Any? = null) {
    val Message: String = message
    val Payload: Any? = payload
}