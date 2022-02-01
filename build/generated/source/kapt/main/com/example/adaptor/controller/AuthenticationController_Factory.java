package com.example.adaptor.controller;

import com.example.domain.services.AuthenticationService;
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
public final class AuthenticationController_Factory implements Factory<AuthenticationController> {
  private final Provider<AuthenticationService> authenticationServiceProvider;

  public AuthenticationController_Factory(
      Provider<AuthenticationService> authenticationServiceProvider) {
    this.authenticationServiceProvider = authenticationServiceProvider;
  }

  @Override
  public AuthenticationController get() {
    return newInstance(authenticationServiceProvider.get());
  }

  public static AuthenticationController_Factory create(
      Provider<AuthenticationService> authenticationServiceProvider) {
    return new AuthenticationController_Factory(authenticationServiceProvider);
  }

  public static AuthenticationController newInstance(AuthenticationService authenticationService) {
    return new AuthenticationController(authenticationService);
  }
}
