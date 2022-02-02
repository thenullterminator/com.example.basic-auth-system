package com.example.di

import com.example.adaptor.persistence.UserRepositoryH2
import com.example.domain.ports.UserRepositoryPort
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryPortModule  {

    @Provides
    fun providesUserRepositoryPort(): UserRepositoryPort {
        return UserRepositoryH2()
    }
}