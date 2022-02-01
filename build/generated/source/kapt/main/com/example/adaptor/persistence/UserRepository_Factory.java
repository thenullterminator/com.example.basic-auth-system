package com.example.adaptor.persistence;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepository_Factory implements Factory<UserRepository> {
  @Override
  public UserRepository get() {
    return newInstance();
  }

  public static UserRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserRepository newInstance() {
    return new UserRepository();
  }

  private static final class InstanceHolder {
    private static final UserRepository_Factory INSTANCE = new UserRepository_Factory();
  }
}
