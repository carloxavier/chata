package com.chata.app.data

import com.chata.app.data.entity.network.ProductClusterResponse
import com.chata.app.data.entity.ProductDetail
import io.reactivex.Single

interface DataSource {
    fun getProducts(): Single<ProductClusterResponse>
    fun getProduct(id: String): Single<ProductDetail>
}