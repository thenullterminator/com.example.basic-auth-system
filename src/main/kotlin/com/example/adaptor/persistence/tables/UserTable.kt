package com.example.adaptor.persistence.tables


import com.example.domain.models.User
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.Table

object UserTable : Table() {

    val id = integer("id").autoIncrement()
    val name = varchar("name", 50)
    val username = varchar("username", 50)
    val password = varchar("password",50)
    val loginCount = integer("loginCount")
    override val primaryKey = PrimaryKey(id)

    fun toUserType(row: ResultRow): User {
        return User(row[id],row[loginCount],row[name],row[username],row[password]);
    }
}