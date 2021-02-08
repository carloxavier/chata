package com.chata.app.data

import com.chata.app.data.entity.Product
import com.chata.app.data.entity.ProductCluster
import com.chata.app.data.entity.ProductDetail
import io.reactivex.Single
import javax.inject.Inject

open class ProductRepository @Inject constructor(private val dataSource: DataSource) {
    open fun getProducts(): Single<List<Product>> = dataSource.getProducts().map {
        it.clusters.map(ProductCluster::items).flatten()
    }

    open fun getProduct(id: String): Single<ProductDetail> = dataSource.getProduct(id)
}
