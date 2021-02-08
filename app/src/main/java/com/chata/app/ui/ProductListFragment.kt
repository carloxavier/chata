package com.chata.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import com.chata.app.databinding.FragmentProductListBinding
import com.chata.app.ui.adapter.ProductListAdapter
import com.chata.app.ui.viewmodel.ProductListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductListFragment : Fragment(), HasDefaultViewModelProviderFactory {
    private val viewModel: ProductListViewModel by viewModels()
    private lateinit var binding: FragmentProductListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProductListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = ProductListAdapter()
        setupProductListObserver()
        setupErrorObserver()
    }

    private fun setupErrorObserver() {
        viewModel.hasError.observe(viewLifecycleOwner) {
            binding.showError = it
            binding.executePendingBindings()
        }
    }

    private fun setupProductListObserver() {
        viewModel.products.observe(
            viewLifecycleOwner,
            (binding.recyclerView.adapter as ProductListAdapter)::submitList,
        )
    }
}
