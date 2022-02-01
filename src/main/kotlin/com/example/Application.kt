package com.example

import com.example.di.DaggerAuthenticationControllerComponent

fun main() {
    val controller =
        DaggerAuthenticationControllerComponent
        .builder()
        .build()
        .createAuthenticationController()

    controller.start()
}
