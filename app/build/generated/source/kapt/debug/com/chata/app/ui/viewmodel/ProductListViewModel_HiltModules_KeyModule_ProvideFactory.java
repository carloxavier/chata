// Generated by Dagger (https://dagger.dev).
package com.chata.app.ui.viewmodel;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ProductListViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ProductListViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ProductListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ProductListViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}