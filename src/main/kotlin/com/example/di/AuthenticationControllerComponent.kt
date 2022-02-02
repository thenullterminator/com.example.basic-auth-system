package com.example.di

import com.example.adaptor.controller.AuthenticationController
import dagger.Component
import javax.inject.Singleton
@Singleton
@Component (modules = [UserRepositoryPortModule::class])

interface AuthenticationControllerComponent {

    fun createAuthenticationController() : AuthenticationController
}