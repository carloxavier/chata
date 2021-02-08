package com.chata.app.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProductDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProductDetailFragmentArgs() {
  }

  private ProductDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProductDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProductDetailFragmentArgs __result = new ProductDetailFragmentArgs();
    bundle.setClassLoader(ProductDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("productId")) {
      String productId;
      productId = bundle.getString("productId");
      if (productId == null) {
        throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("productId", productId);
    } else {
      throw new IllegalArgumentException("Required argument \"productId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getProductId() {
    return (String) arguments.get("productId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("productId")) {
      String productId = (String) arguments.get("productId");
      __result.putString("productId", productId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ProductDetailFragmentArgs that = (ProductDetailFragmentArgs) object;
    if (arguments.containsKey("productId") != that.arguments.containsKey("productId")) {
      return false;
    }
    if (getProductId() != null ? !getProductId().equals(that.getProductId()) : that.getProductId() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ProductDetailFragmentArgs{"
        + "productId=" + getProductId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ProductDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String productId) {
      if (productId == null) {
        throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productId", productId);
    }

    @NonNull
    public ProductDetailFragmentArgs build() {
      ProductDetailFragmentArgs result = new ProductDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setProductId(@NonNull String productId) {
      if (productId == null) {
        throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productId", productId);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getProductId() {
      return (String) arguments.get("productId");
    }
  }
}
