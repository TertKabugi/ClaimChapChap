package com.example.claimchapchap.insurancePolicies.thirdParty.quotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThidpartySilverQuoteBinding

class SilverQuoteFragment : Fragment() {

    private lateinit var binding: FragmentThidpartySilverQuoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThidpartySilverQuoteBinding.inflate(layoutInflater)
        val view = binding.root

        return view
    }

}