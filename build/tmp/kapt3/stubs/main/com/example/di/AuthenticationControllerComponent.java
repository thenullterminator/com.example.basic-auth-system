package com.example.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/di/AuthenticationControllerComponent;", "", "createAuthenticationController", "Lcom/example/adaptor/controller/AuthenticationController;", "com.example.basic-auth-system"})
@dagger.Component(modules = {com.example.di.UserRepositoryPortModule.class})
@javax.inject.Singleton
public abstract interface AuthenticationControllerComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.adaptor.controller.AuthenticationController createAuthenticationController();
}