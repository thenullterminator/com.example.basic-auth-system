package com.example.adaptor.controller

import com.example.domain.services.AuthenticationService
import com.example.request.LoginRequest
import com.example.request.SignUpRequest
import com.example.response.FailureResponse
import com.example.response.SuccessResponse
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.sessions.*
import javax.inject.Inject

data class UserSession(val username: String) : Principal

class AuthenticationController @Inject constructor(private val authenticationService: AuthenticationService){

    fun start(){
        embeddedServer(Netty, port = 8080, host = "0.0.0.0") {

            install(CallLogging) {
            }

            install(ContentNegotiation) {
                gson {
                    setPrettyPrinting()
                }
            }

            install(Sessions) {
                cookie<UserSession>("user_session") {
                    cookie.path = "/"
                    cookie.maxAgeInSeconds = 60
                }
            }

            install(Authentication) {
                session<UserSession>("auth-session") {
                    validate { session ->
                        if(authenticationService.getUserByUsernameOrNull(session.username) is SuccessResponse) {
                            session
                        } else {
                            null
                        }
                    }
                    challenge {
                        call.respondText("login required!")
                    }
                }
            }

            routing{
                route("/users"){

                    get("/") {
                        call.respondText("Authentication Service")
                    }

                    post("/signup"){
                        val request = call.receive<SignUpRequest>()
                        when(val response = authenticationService.signup(request)){
                            is SuccessResponse -> call.respondText(response.message,status = HttpStatusCode.OK)
                            is FailureResponse -> call.respondText(response.message,status = HttpStatusCode.BadRequest)
                        }
                    }

                    post("/login"){
                        val request = call.receive<LoginRequest>()
                        when(val response = authenticationService.login(request)){
                            is SuccessResponse -> {
                                call.sessions.set(UserSession(request.username))
                                call.respondText(response.message, status = HttpStatusCode.OK)
                            }
                            is FailureResponse -> call.respondText(response.message,status = HttpStatusCode.BadRequest)
                        }
                    }

                    get("/logout"){
                        call.sessions.clear<UserSession>()
                        call.respondText("logged out successfully!")
                    }

                    authenticate("auth-session") {
                        get("/all-users") {
                            call.respond(authenticationService.getAllUsers())
                            when(val response = authenticationService.getAllUsers()){
                                is SuccessResponse -> call.respond(response.payload as Any)
                                is FailureResponse -> call.respondText(response.message,status = HttpStatusCode.BadRequest)
                            }
                        }
                    }
                }
            }
        }.start(wait = true)
    }
}