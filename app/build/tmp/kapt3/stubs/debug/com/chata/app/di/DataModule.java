package com.chata.app.di;

import com.chata.app.data.DataSource;
import com.chata.app.data.api.ApiService;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/chata/app/di/DataModule;", "", "()V", "bindDataSource", "Lcom/chata/app/data/DataSource;", "apiService", "Lcom/chata/app/data/api/ApiService;", "app_debug"})
@dagger.Module()
public abstract class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.chata.app.data.DataSource bindDataSource(@org.jetbrains.annotations.NotNull()
    com.chata.app.data.api.ApiService apiService);
    
    public DataModule() {
        super();
    }
}