package com.example.domain.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/domain/services/AuthenticationService;", "Lcom/example/domain/ports/AuthenticationServicePort;", "userRepository", "Lcom/example/domain/ports/UserRepositoryPort;", "(Lcom/example/domain/ports/UserRepositoryPort;)V", "getAllUsers", "Lcom/example/response/Response;", "getUserByUsernameOrNull", "username", "", "login", "request", "Lcom/example/request/LoginRequest;", "signup", "Lcom/example/request/SignUpRequest;", "com.example.basic-auth-system"})
@javax.inject.Singleton
public final class AuthenticationService implements com.example.domain.ports.AuthenticationServicePort {
    private final com.example.domain.ports.UserRepositoryPort userRepository = null;
    
    @javax.inject.Inject
    public AuthenticationService(@org.jetbrains.annotations.NotNull
    com.example.domain.ports.UserRepositoryPort userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.response.Response signup(@org.jetbrains.annotations.NotNull
    com.example.request.SignUpRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.response.Response login(@org.jetbrains.annotations.NotNull
    com.example.request.LoginRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.response.Response getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.response.Response getUserByUsernameOrNull(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
}