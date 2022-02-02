package com.example.di;

import com.example.adaptor.controller.AuthenticationController;
import com.example.domain.ports.UserRepositoryPort;
import com.example.domain.services.AuthenticationService;
import com.example.domain.services.AuthenticationService_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
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
public final class DaggerAuthenticationControllerComponent implements AuthenticationControllerComponent {
  private final DaggerAuthenticationControllerComponent authenticationControllerComponent = this;

  private Provider<UserRepositoryPort> providesUserRepositoryPortProvider;

  private Provider<AuthenticationService> authenticationServiceProvider;

  private DaggerAuthenticationControllerComponent(
      UserRepositoryPortModule userRepositoryPortModuleParam) {

    initialize(userRepositoryPortModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  public static AuthenticationControllerComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final UserRepositoryPortModule userRepositoryPortModuleParam) {
    this.providesUserRepositoryPortProvider = UserRepositoryPortModule_ProvidesUserRepositoryPortFactory.create(userRepositoryPortModuleParam);
    this.authenticationServiceProvider = DoubleCheck.provider(AuthenticationService_Factory.create(providesUserRepositoryPortProvider));
  }

  @Override
  public AuthenticationController createAuthenticationController() {
    return new AuthenticationController(authenticationServiceProvider.get());
  }

  public static final class Builder {
    private UserRepositoryPortModule userRepositoryPortModule;

    private Builder() {
    }

    public Builder userRepositoryPortModule(UserRepositoryPortModule userRepositoryPortModule) {
      this.userRepositoryPortModule = Preconditions.checkNotNull(userRepositoryPortModule);
      return this;
    }

    public AuthenticationControllerComponent build() {
      if (userRepositoryPortModule == null) {
        this.userRepositoryPortModule = new UserRepositoryPortModule();
      }
      return new DaggerAuthenticationControllerComponent(userRepositoryPortModule);
    }
  }
}
