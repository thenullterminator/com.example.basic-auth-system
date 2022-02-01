package com.example.domain.ports;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/example/domain/ports/AuthenticationServicePort;", "", "getAllUsers", "Lcom/example/response/Response;", "getUserByUsernameOrNull", "username", "", "login", "request", "Lcom/example/request/LoginRequest;", "signup", "Lcom/example/request/SignUpRequest;", "com.example.basic-auth-system"})
public abstract interface AuthenticationServicePort {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.response.Response signup(@org.jetbrains.annotations.NotNull
    com.example.request.SignUpRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.response.Response login(@org.jetbrains.annotations.NotNull
    com.example.request.LoginRequest request);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.response.Response getAllUsers();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.response.Response getUserByUsernameOrNull(@org.jetbrains.annotations.NotNull
    java.lang.String username);
}