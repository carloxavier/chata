package com.chata.app.ui.adapter.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chata.app.data.entity.Product;
import com.chata.app.databinding.ViewholderProductListBinding;
import com.chata.app.ui.ProductListFragmentDirections;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/chata/app/ui/adapter/viewholder/ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/chata/app/databinding/ViewholderProductListBinding;", "(Lcom/chata/app/databinding/ViewholderProductListBinding;)V", "bind", "thatProduct", "Lcom/chata/app/data/entity/Product;", "navigateToProductDetail", "", "view", "Landroid/view/View;", "Companion", "app_debug"})
public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.chata.app.databinding.ViewholderProductListBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.chata.app.ui.adapter.viewholder.ProductViewHolder.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.chata.app.databinding.ViewholderProductListBinding bind(@org.jetbrains.annotations.NotNull()
    com.chata.app.data.entity.Product thatProduct) {
        return null;
    }
    
    private final void navigateToProductDetail(com.chata.app.data.entity.Product thatProduct, android.view.View view) {
    }
    
    public ProductViewHolder(@org.jetbrains.annotations.NotNull()
    com.chata.app.databinding.ViewholderProductListBinding binding) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/chata/app/ui/adapter/viewholder/ProductViewHolder$Companion;", "", "()V", "from", "Lcom/chata/app/ui/adapter/viewholder/ProductViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.chata.app.ui.adapter.viewholder.ProductViewHolder from(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}