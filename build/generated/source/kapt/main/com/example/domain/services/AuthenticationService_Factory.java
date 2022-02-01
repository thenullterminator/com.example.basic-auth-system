package com.example.domain.services;

import com.example.adaptor.persistence.UserRepository;
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
  private final Provider<UserRepository> userRepositoryProvider;

  public AuthenticationService_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public AuthenticationService get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static AuthenticationService_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new AuthenticationService_Factory(userRepositoryProvider);
  }

  public static AuthenticationService newInstance(UserRepository userRepository) {
    return new AuthenticationService(userRepository);
  }
}
