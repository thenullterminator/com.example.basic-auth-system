package com.example.domain.models

data class User(
    val id: Int = -1,
    val loginCount: Int = 0,
    val name: String,
    val username: String,
    val password: String) {
}