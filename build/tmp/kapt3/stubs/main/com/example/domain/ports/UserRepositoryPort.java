package com.example.domain.ports;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H&\u00a8\u0006\f"}, d2 = {"Lcom/example/domain/ports/UserRepositoryPort;", "", "getAllUsers", "", "Lcom/example/domain/models/User;", "getUserByUsernameOrNull", "username", "", "insertUser", "", "user", "updateUser", "com.example.basic-auth-system"})
public abstract interface UserRepositoryPort {
    
    public abstract void insertUser(@org.jetbrains.annotations.NotNull
    com.example.domain.models.User user);
    
    public abstract void updateUser(@org.jetbrains.annotations.NotNull
    com.example.domain.models.User user);
    
    @org.jetbrains.annotations.Nullable
    public abstract com.example.domain.models.User getUserByUsernameOrNull(@org.jetbrains.annotations.NotNull
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.domain.models.User> getAllUsers();
}