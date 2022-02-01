package com.example.adaptor.persistence;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/example/adaptor/persistence/UserRepository;", "Lcom/example/domain/ports/UserRepositoryPort;", "()V", "getAllUsers", "", "Lcom/example/domain/models/User;", "getUserByUsernameOrNull", "username", "", "insertUser", "", "user", "updateUser", "com.example.basic-auth-system"})
@javax.inject.Singleton
public final class UserRepository implements com.example.domain.ports.UserRepositoryPort {
    
    @javax.inject.Inject
    public UserRepository() {
        super();
    }
    
    @java.lang.Override
    public void insertUser(@org.jetbrains.annotations.NotNull
    com.example.domain.models.User user) {
    }
    
    @java.lang.Override
    public void updateUser(@org.jetbrains.annotations.NotNull
    com.example.domain.models.User user) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.example.domain.models.User getUserByUsernameOrNull(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.example.domain.models.User> getAllUsers() {
        return null;
    }
}