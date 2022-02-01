package com.example.di

import com.example.adaptor.controller.AuthenticationController
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface AuthenticationControllerComponent {

    fun createAuthenticationController() : AuthenticationController
}