package com.example.adaptor.persistence

import com.example.adaptor.persistence.tables.UserTable
import com.example.domain.models.User
import com.example.domain.ports.UserRepositoryPort
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor() : UserRepositoryPort {

    init{
        Database.connect("jdbc:h2:mem:regular;DB_CLOSE_DELAY=-1;", "org.h2.Driver")

        transaction {
            addLogger(StdOutSqlLogger)
            SchemaUtils.create(UserTable)
        }
    }

    override fun insertUser(user: User){
        transaction {
            UserTable.insert {
                it[name] = user.name
                it[username] = user.username
                it[password] = user.password
                it[loginCount] = user.loginCount
            }
        }
    }

    override fun updateUser(user: User) {
        transaction{
            UserTable.update({ UserTable.id eq user.id}){
                it[name] = user.name
                it[username] = user.username
                it[password] = user.password
                it[loginCount] = user.loginCount
            }
        }
    }

    override fun getUserByUsernameOrNull(username: String): User? {
        val user:User? = transaction {
            UserTable
                .select { UserTable.username eq username }
                .limit(1)
                .map { UserTable.toUserType(it) }
                .singleOrNull()
        }
        return user
    }

    override fun getAllUsers(): List<User> {
        val allUsers = transaction {
            UserTable.selectAll().map{ UserTable.toUserType(it)}
        }
        return allUsers
    }
}