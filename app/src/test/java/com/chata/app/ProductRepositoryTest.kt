package com.chata.app

import com.chata.app.data.DataSource
import com.chata.app.data.ProductRepository
import com.chata.app.data.entity.Product
import com.chata.app.data.entity.ProductCluster
import com.chata.app.data.entity.network.ProductClusterResponse
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ProductRepositoryTest {
    private lateinit var repository: ProductRepository

    @Mock
    private lateinit var dataSource: DataSource

    @Before
    fun setup() {
        repository = ProductRepository(dataSource)
    }

    @Test
    fun `returns an empty list of products, on empty clusters`() {
        `when`(dataSource.getProducts()).thenReturn(Single.just(EMPTY_CLUSTERS_RESPONSE))

        repository.getProducts().test().assertValues(emptyList())
    }

    @Test
    fun `returns an empty list of products, on empty products`() {
        `when`(dataSource.getProducts()).thenReturn(Single.just(EMPTY_PRODUCTS_RESPONSE))

        repository.getProducts().test().assertValues(emptyList())
    }

    @Test
    fun `returns a list of products`() {
        `when`(dataSource.getProducts()).thenReturn(Single.just(MANY_PRODUCTS_CLUSTERS_RESPONSE))

        repository.getProducts().test().assertValues(listOf(PRODUCT1, PRODUCT2, PRODUCT3))
    }

    companion object {
        val PRODUCT1 = Product(
            id = "dummyProduct1",
            imageUrl = "dummyUrlProduct1",
            title = "Dummy Title Product 1",
        )
        val PRODUCT2 = Product(
            id = "dummyProduct2",
            imageUrl = "dummyUrlProduct2",
            title = "Dummy Title Product 2",
        )
        val PRODUCT3 = Product(
            id = "dummyProduct3",
            imageUrl = "dummyUrlProduct3",
            title = "Dummy Title Product 3",
        )
        val EMPTY_CLUSTERS_RESPONSE = ProductClusterResponse(listOf())
        val EMPTY_PRODUCTS_RESPONSE = ProductClusterResponse(
            listOf(ProductCluster(tag = "emptyDummy", items = listOf()))
        )
        val MANY_PRODUCTS_CLUSTERS_RESPONSE = ProductClusterResponse(
            listOf(
                ProductCluster(tag = "dummy-cluster1", items = listOf(PRODUCT1, PRODUCT2)),
                ProductCluster(tag = "dummy-cluster2", items = listOf()),
                ProductCluster(tag = "dummy-cluster3", items = listOf(PRODUCT3)),
            )
        )
    }
}