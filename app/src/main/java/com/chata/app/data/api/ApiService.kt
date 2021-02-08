package com.chata.app.data.api

import com.chata.app.data.DataSource
import com.chata.app.data.entity.network.ProductClusterResponse
import com.chata.app.data.entity.ProductDetail
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import javax.inject.Inject

class ApiService @Inject constructor() : DataSource {
    override fun getProducts(): Single<ProductClusterResponse> =
        Rx2AndroidNetworking.get("https://60182731971d850017a3f9e4.mockapi.io/api/products")
            .build()
            .getObjectSingle(ProductClusterResponse::class.java)

    override fun getProduct(id: String): Single<ProductDetail> =
        Rx2AndroidNetworking.get("https://60182731971d850017a3f9e4.mockapi.io/api/product/$id")
            .build()
            .getObjectSingle(ProductDetail::class.java)
}