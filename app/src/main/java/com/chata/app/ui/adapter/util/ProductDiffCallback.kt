package com.chata.app.ui.adapter.util

import androidx.recyclerview.widget.DiffUtil
import com.chata.app.data.entity.Product

object ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product) = oldItem == newItem

    override fun areContentsTheSame(oldItem: Product, newItem: Product) = oldItem.id == newItem.id
}
