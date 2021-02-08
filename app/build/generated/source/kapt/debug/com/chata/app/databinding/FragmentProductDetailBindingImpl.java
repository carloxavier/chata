package com.chata.app.databinding;
import com.chata.app.R;
import com.chata.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailBindingImpl extends FragmentProductDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.errorView.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.productDetailTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.showError == variableId) {
            setShowError((java.lang.Boolean) variable);
        }
        else if (BR.product == variableId) {
            setProduct((com.chata.app.data.entity.ProductDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowError(@Nullable java.lang.Boolean ShowError) {
        this.mShowError = ShowError;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showError);
        super.requestRebind();
    }
    public void setProduct(@Nullable com.chata.app.data.entity.ProductDetail Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Boolean showError = mShowError;
        java.lang.String productImageUrl = null;
        java.lang.String productTitle = null;
        com.chata.app.data.entity.ProductDetail product = mProduct;
        java.lang.String productDescription = null;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (product != null) {
                    // read product.imageUrl
                    productImageUrl = product.getImageUrl();
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.description
                    productDescription = product.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.chata.app.ui.adapter.BindingAdaptersKt.bindIsVisible(this.errorView, showError);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.imageView.setContentDescription(productTitle);
            }
            // api target 1

            com.chata.app.ui.adapter.BindingAdaptersKt.bindImageFromUrl(this.imageView, productImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, productDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productDetailTitle, productTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showError
        flag 1 (0x2L): product
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}