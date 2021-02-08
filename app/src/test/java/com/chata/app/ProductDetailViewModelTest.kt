package com.chata.app

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.chata.app.data.ProductRepository
import com.chata.app.data.entity.ProductDetail
import com.chata.app.ui.viewmodel.ProductDetailViewModel
import io.reactivex.Single
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ProductDetailViewModelTest {
    @Mock
    lateinit var repository: ProductRepository

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.trampoline() }
    }

    @After
    fun clear() {
        RxJavaPlugins.reset()
        RxAndroidPlugins.reset()
    }

    @Test
    fun `show product details`() {
        `when`(repository.getProduct(anyString()))
            .thenReturn(Single.just(DUMMY_PRODUCT_DETAIL))

        with(ProductDetailViewModel(repository)) {
            fetchProductDetail("1")

            assertThat(product.value, `is`(DUMMY_PRODUCT_DETAIL))
            assertThat(hasError.value, `is`(false))
        }
    }

    @Test
    fun `show error`() {
        `when`(repository.getProduct(anyString())).thenReturn(Single.error(Exception()))

        with(ProductDetailViewModel(repository)) {
            fetchProductDetail("2")

            assertThat(hasError.value, `is`(true))
        }
    }

    companion object {
        val DUMMY_PRODUCT_DETAIL = ProductDetail(
            id = "Product detail",
            imageUrl = "http://image.com/dummy",
            title = "dummy title",
            allergyInformation = "dummy info",
            description = "dummy desc",
            price = "2",
        )
    }
}