package com.example.claimchapchap.insurancePolicies.thirdParty.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyGoldMobilePaymentBinding

class GoldMobilePayment : Fragment() {

    private lateinit var binding: FragmentThirdpartyGoldMobilePaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartyGoldMobilePaymentBinding.inflate(layoutInflater)
        val view = binding.root

        return view
    }

}