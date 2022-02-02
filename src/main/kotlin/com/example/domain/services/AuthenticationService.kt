package com.example.domain.services

import com.example.domain.models.User
import com.example.domain.ports.AuthenticationServicePort
import com.example.domain.ports.UserRepositoryPort
import com.example.request.LoginRequest
import com.example.request.SignUpRequest
import com.example.response.FailureResponse
import com.example.response.Response
import com.example.response.SuccessResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthenticationService @Inject constructor(private val userRepository: UserRepositoryPort) : AuthenticationServicePort {

    override fun signup(request: SignUpRequest): Response {
        val (name,username,password) = request
        if(userRepository.getUserByUsernameOrNull(username)!=null){
            return FailureResponse("username already taken")
        }
        val currentUser = User(name=name,username=username,password=password)
        userRepository.insertUser(currentUser)
        return SuccessResponse("successfully signed up!")
    }

    override fun login(request: LoginRequest):Response {
        val (username,password) = request
        val currentUser = userRepository.getUserByUsernameOrNull(username)
        if(currentUser===null || currentUser.password!=password){
            return FailureResponse("invalid credentials")
        }
        val updatedLoginCount = currentUser.loginCount + 1
        userRepository.updateUser(User(
            id = currentUser.id,
            name = currentUser.name,
            password = currentUser.password,
            username = currentUser.username,
            loginCount = updatedLoginCount))
        return SuccessResponse("successfully logged in! login count: $updatedLoginCount")
    }

    override fun getAllUsers(): Response {
        return SuccessResponse(
            "successfully fetched all users",
            userRepository.getAllUsers()
        )
    }

    override fun getUserByUsernameOrNull(username: String): Response {
        return SuccessResponse(
            "successfully fetched all users",
            userRepository.getUserByUsernameOrNull(username)
        )
    }
}