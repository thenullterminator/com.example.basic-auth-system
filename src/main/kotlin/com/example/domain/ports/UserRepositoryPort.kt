package com.example.domain.ports

import com.example.domain.models.User

interface UserRepositoryPort {

    fun insertUser(user:User)
    fun updateUser(user:User)
    fun getUserByUsernameOrNull(username:String):User?
    fun getAllUsers():List<User>
}