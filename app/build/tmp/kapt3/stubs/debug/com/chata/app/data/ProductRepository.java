package com.chata.app.data;

import com.chata.app.data.entity.Product;
import com.chata.app.data.entity.ProductCluster;
import com.chata.app.data.entity.ProductDetail;
import io.reactivex.Single;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/chata/app/data/ProductRepository;", "", "dataSource", "Lcom/chata/app/data/DataSource;", "(Lcom/chata/app/data/DataSource;)V", "getProduct", "Lio/reactivex/Single;", "Lcom/chata/app/data/entity/ProductDetail;", "id", "", "getProducts", "", "Lcom/chata/app/data/entity/Product;", "app_debug"})
public class ProductRepository {
    private final com.chata.app.data.DataSource dataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<java.util.List<com.chata.app.data.entity.Product>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<com.chata.app.data.entity.ProductDetail> getProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProductRepository(@org.jetbrains.annotations.NotNull()
    com.chata.app.data.DataSource dataSource) {
        super();
    }
}