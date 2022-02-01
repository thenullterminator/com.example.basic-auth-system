package com.example.domain.ports

import com.example.domain.models.User
import com.example.request.LoginRequest
import com.example.request.SignUpRequest
import com.example.response.Response

interface AuthenticationServicePort {

    fun signup(request: SignUpRequest):Response
    fun login(request: LoginRequest):Response
    fun getAllUsers():Response
    fun getUserByUsernameOrNull(username:String):Response
}