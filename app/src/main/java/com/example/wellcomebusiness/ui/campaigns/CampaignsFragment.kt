package com.example.wellcomebusiness.ui.campaigns

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wellcomebusiness.R
import com.example.wellcomebusiness.databinding.FragmentCampaignsBinding


class CampaignsFragment : Fragment() {

    private var _binding: FragmentCampaignsBinding? = null
    private val binding by lazy {
        _binding!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding= FragmentCampaignsBinding.inflate(inflater, container,false)
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = CampaignsFragment()
    }
}