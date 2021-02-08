package com.chata.app.ui.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.chata.app.data.entity.Product
import com.chata.app.ui.adapter.util.ProductDiffCallback
import com.chata.app.ui.adapter.viewholder.ProductViewHolder

class ProductListAdapter : ListAdapter<Product, ProductViewHolder>(ProductDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ProductViewHolder.from(parent)

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
