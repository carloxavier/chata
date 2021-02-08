package com.chata.app.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chata.app.data.ProductRepository
import com.chata.app.data.entity.ProductDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel @Inject constructor(
    private val repository: ProductRepository,
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    private val _product = MutableLiveData<ProductDetail>()
    val product: LiveData<ProductDetail>
        get() = _product

    private val _hasError = MutableLiveData<Boolean>()
    val hasError: LiveData<Boolean>
        get() = _hasError

    fun fetchProductDetail(productId: String) {
        repository.getProduct(productId)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(this::onSuccess, this::onError)
            .also(compositeDisposable::add)
    }

    private fun onSuccess(productDetail: ProductDetail?) {
        _hasError.value = false
        _product.value = productDetail
    }


    private fun onError(error: Throwable) {
        _hasError.value = true
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}