package com.chata.app.ui.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.chata.app.data.ProductRepository;
import com.chata.app.data.entity.ProductDetail;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/chata/app/ui/viewmodel/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/chata/app/data/ProductRepository;", "(Lcom/chata/app/data/ProductRepository;)V", "_hasError", "Landroidx/lifecycle/MutableLiveData;", "", "_product", "Lcom/chata/app/data/entity/ProductDetail;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "hasError", "Landroidx/lifecycle/LiveData;", "getHasError", "()Landroidx/lifecycle/LiveData;", "product", "getProduct", "fetchProductDetail", "", "productId", "", "onCleared", "onError", "error", "", "onSuccess", "productDetail", "app_debug"})
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<com.chata.app.data.entity.ProductDetail> _product = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _hasError = null;
    private final com.chata.app.data.ProductRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.chata.app.data.entity.ProductDetail> getProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHasError() {
        return null;
    }
    
    public final void fetchProductDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    private final void onSuccess(com.chata.app.data.entity.ProductDetail productDetail) {
    }
    
    private final void onError(java.lang.Throwable error) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.chata.app.data.ProductRepository repository) {
        super();
    }
}