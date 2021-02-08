package com.chata.app.ui.adapter.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.chata.app.data.entity.Product
import com.chata.app.databinding.ViewholderProductListBinding
import com.chata.app.ui.ProductListFragmentDirections

class ProductViewHolder(private val binding: ViewholderProductListBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(thatProduct: Product) =
        binding.apply {
            product = thatProduct
            card.setOnClickListener {
                navigateToProductDetail(thatProduct, it)
            }
            executePendingBindings()
        }

    private fun navigateToProductDetail(thatProduct: Product, view: View) {
        ProductListFragmentDirections.actionMainFragmentToProductDetailFragment(thatProduct.id)
            .also {
                view.findNavController().navigate(it)
            }
    }

    companion object {
        fun from(parent: ViewGroup): ProductViewHolder {
            val binding = ViewholderProductListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
            return ProductViewHolder(binding)
        }
    }
}
