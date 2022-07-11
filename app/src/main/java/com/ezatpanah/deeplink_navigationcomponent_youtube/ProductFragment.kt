package com.ezatpanah.deeplink_navigationcomponent_youtube

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.ezatpanah.deeplink_navigationcomponent_youtube.databinding.FragmentProductBinding


class ProductFragment : Fragment() {
    lateinit var binding: FragmentProductBinding

    private val args : ProductFragmentArgs by navArgs()
    private var productName =""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        productName = args.productName

        binding.tvProductName.text = productName
    }



}