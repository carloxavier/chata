package com.chata.app.data.api;

import com.chata.app.data.DataSource;
import com.chata.app.data.entity.network.ProductClusterResponse;
import com.chata.app.data.entity.ProductDetail;
import com.rx2androidnetworking.Rx2AndroidNetworking;
import io.reactivex.Single;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/chata/app/data/api/ApiService;", "Lcom/chata/app/data/DataSource;", "()V", "getProduct", "Lio/reactivex/Single;", "Lcom/chata/app/data/entity/ProductDetail;", "id", "", "getProducts", "Lcom/chata/app/data/entity/network/ProductClusterResponse;", "app_debug"})
public final class ApiService implements com.chata.app.data.DataSource {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.chata.app.data.entity.network.ProductClusterResponse> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.chata.app.data.entity.ProductDetail> getProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiService() {
        super();
    }
}