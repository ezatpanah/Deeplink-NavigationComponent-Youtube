package com.ezatpanah.deeplink_navigationcomponent_youtube

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ezatpanah.deeplink_navigationcomponent_youtube.databinding.FragmentMainBinding
import com.ezatpanah.deeplink_navigationcomponent_youtube.databinding.FragmentProductBinding


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnViewPro.setOnClickListener {
               // findNavController().navigate(R.id.action_mainFragment_to_productFragment)
            }
        }

    }

}