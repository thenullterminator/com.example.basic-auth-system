package com.example.domain.services;

import com.example.domain.ports.UserRepositoryPort;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthenticationService_Factory implements Factory<AuthenticationService> {
  private final Provider<UserRepositoryPort> userRepositoryProvider;

  public AuthenticationService_Factory(Provider<UserRepositoryPort> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public AuthenticationService get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static AuthenticationService_Factory create(
      Provider<UserRepositoryPort> userRepositoryProvider) {
    return new AuthenticationService_Factory(userRepositoryProvider);
  }

  public static AuthenticationService newInstance(UserRepositoryPort userRepository) {
    return new AuthenticationService(userRepository);
  }
}
