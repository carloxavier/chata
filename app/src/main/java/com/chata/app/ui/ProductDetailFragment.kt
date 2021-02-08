package com.chata.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import androidx.navigation.fragment.navArgs
import com.chata.app.databinding.FragmentProductDetailBinding
import com.chata.app.ui.viewmodel.ProductDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductDetailFragment : Fragment(), HasDefaultViewModelProviderFactory {
    private val args: ProductDetailFragmentArgs by navArgs()

    val viewModel by viewModels<ProductDetailViewModel>()
    private lateinit var binding: FragmentProductDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProductDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchProductDetail(args.productId)
        setupProductDetailsObserver()
        setupErrorObserver()
    }

    private fun setupErrorObserver() {
        viewModel.hasError.observe(viewLifecycleOwner) {
            binding.showError = it
            binding.executePendingBindings()
        }
    }

    private fun setupProductDetailsObserver() {
        viewModel.product.observe(viewLifecycleOwner) {
            binding.product = it
            binding.executePendingBindings()
        }
    }
}
