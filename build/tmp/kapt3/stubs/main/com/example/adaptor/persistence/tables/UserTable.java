package com.example.adaptor.persistence.tables;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0018\u0010\u000f\u001a\u00060\u0010R\u00020\u0001X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/example/adaptor/persistence/tables/UserTable;", "Lorg/jetbrains/exposed/sql/Table;", "()V", "id", "Lorg/jetbrains/exposed/sql/Column;", "", "getId", "()Lorg/jetbrains/exposed/sql/Column;", "loginCount", "getLoginCount", "name", "", "getName", "password", "getPassword", "primaryKey", "Lorg/jetbrains/exposed/sql/Table$PrimaryKey;", "getPrimaryKey", "()Lorg/jetbrains/exposed/sql/Table$PrimaryKey;", "username", "getUsername", "toUserType", "Lcom/example/domain/models/User;", "row", "Lorg/jetbrains/exposed/sql/ResultRow;", "com.example.basic-auth-system"})
public final class UserTable extends org.jetbrains.exposed.sql.Table {
    @org.jetbrains.annotations.NotNull
    public static final com.example.adaptor.persistence.tables.UserTable INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.exposed.sql.Column<java.lang.Integer> id = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.exposed.sql.Column<java.lang.Integer> loginCount = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.exposed.sql.Table.PrimaryKey primaryKey = null;
    
    private UserTable() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.exposed.sql.Column<java.lang.Integer> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.exposed.sql.Column<java.lang.Integer> getLoginCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.exposed.sql.Table.PrimaryKey getPrimaryKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.models.User toUserType(@org.jetbrains.annotations.NotNull
    org.jetbrains.exposed.sql.ResultRow row) {
        return null;
    }
}