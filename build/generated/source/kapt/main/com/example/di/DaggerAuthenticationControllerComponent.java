package com.example.di;

import com.example.adaptor.controller.AuthenticationController;
import com.example.adaptor.persistence.UserRepository;
import com.example.adaptor.persistence.UserRepository_Factory;
import com.example.domain.services.AuthenticationService;
import com.example.domain.services.AuthenticationService_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
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

  private Provider<UserRepository> userRepositoryProvider;

  private Provider<AuthenticationService> authenticationServiceProvider;

  private DaggerAuthenticationControllerComponent() {

    initialize();

  }

  public static Builder builder() {
    return new Builder();
  }

  public static AuthenticationControllerComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.userRepositoryProvider = DoubleCheck.provider(UserRepository_Factory.create());
    this.authenticationServiceProvider = DoubleCheck.provider(AuthenticationService_Factory.create(userRepositoryProvider));
  }

  @Override
  public AuthenticationController createAuthenticationController() {
    return new AuthenticationController(authenticationServiceProvider.get());
  }

  public static final class Builder {
    private Builder() {
    }

    public AuthenticationControllerComponent build() {
      return new DaggerAuthenticationControllerComponent();
    }
  }
}
