package com.chata.app.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chata.app.data.ProductRepository
import com.chata.app.data.entity.Product
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val repository: ProductRepository,
) : ViewModel() {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    private val _hasError = MutableLiveData<Boolean>()
    val hasError: LiveData<Boolean>
        get() = _hasError

    init {
        fetchProducts()
    }

    private fun fetchProducts() {
        repository.getProducts()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(this::onSuccess, this::onError)
            .also(compositeDisposable::add)
    }

    private fun onError(error: Throwable) {
        _hasError.value = true
    }

    private fun onSuccess(productList: List<Product>?) {
        _hasError.value = false
        _products.value = productList
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}