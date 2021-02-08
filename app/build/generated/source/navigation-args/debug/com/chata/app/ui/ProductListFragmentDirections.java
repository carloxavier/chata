package com.chata.app.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.chata.app.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProductListFragmentDirections {
  private ProductListFragmentDirections() {
  }

  @NonNull
  public static ActionMainFragmentToProductDetailFragment actionMainFragmentToProductDetailFragment(
      @NonNull String productId) {
    return new ActionMainFragmentToProductDetailFragment(productId);
  }

  public static class ActionMainFragmentToProductDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionMainFragmentToProductDetailFragment(@NonNull String productId) {
      if (productId == null) {
        throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productId", productId);
    }

    @NonNull
    public ActionMainFragmentToProductDetailFragment setProductId(@NonNull String productId) {
      if (productId == null) {
        throw new IllegalArgumentException("Argument \"productId\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("productId", productId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("productId")) {
        String productId = (String) arguments.get("productId");
        __result.putString("productId", productId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_mainFragment_to_productDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getProductId() {
      return (String) arguments.get("productId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMainFragmentToProductDetailFragment that = (ActionMainFragmentToProductDetailFragment) object;
      if (arguments.containsKey("productId") != that.arguments.containsKey("productId")) {
        return false;
      }
      if (getProductId() != null ? !getProductId().equals(that.getProductId()) : that.getProductId() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMainFragmentToProductDetailFragment(actionId=" + getActionId() + "){"
          + "productId=" + getProductId()
          + "}";
    }
  }
}
