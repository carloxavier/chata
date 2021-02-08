package com.chata.app.di

import com.chata.app.data.DataSource
import com.chata.app.data.api.ApiService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindDataSource(apiService: ApiService): DataSource
}