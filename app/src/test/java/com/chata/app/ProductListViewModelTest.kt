package com.chata.app

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.chata.app.data.ProductRepository
import com.chata.app.data.entity.Product
import com.chata.app.ui.viewmodel.ProductListViewModel
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
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ProductListViewModelTest {
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
    fun `fetch products list`() {
        `when`(repository.getProducts()).thenReturn(Single.just(MULTI_PRODUCT_RESPONSE))

        with(ProductListViewModel(repository)) {
            assertThat(products.value, `is`(MULTI_PRODUCT_RESPONSE))
            assertThat(hasError.value, `is`(false))
        }
    }

    @Test
    fun `show error`() {
        `when`(repository.getProducts()).thenReturn(Single.error(Exception()))

        with(ProductListViewModel(repository)) {
            assertThat(hasError.value, `is`(true))
        }
    }

    companion object {
        val MULTI_PRODUCT_RESPONSE = listOf(
            Product(title = "dummy product 1",
                imageUrl = "http://dumyurl.com/img1.png",
                id = "1"),
            Product(title = "dummy product 2",
                imageUrl = "http://dumyurl.com/img2.png",
                id = "2"),
        )
    }
}