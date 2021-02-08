// Generated by Dagger (https://dagger.dev).
package com.chata.app.ui.viewmodel;

import com.chata.app.data.ProductRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductDetailViewModel_Factory implements Factory<ProductDetailViewModel> {
  private final Provider<ProductRepository> repositoryProvider;

  public ProductDetailViewModel_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProductDetailViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ProductDetailViewModel_Factory create(
      Provider<ProductRepository> repositoryProvider) {
    return new ProductDetailViewModel_Factory(repositoryProvider);
  }

  public static ProductDetailViewModel newInstance(ProductRepository repository) {
    return new ProductDetailViewModel(repository);
  }
}
