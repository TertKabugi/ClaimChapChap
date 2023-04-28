package com.example.claimchapchap.insurancePolicies.thirdPartyFireAndTheft.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentTpftBronzePaymentBinding
import com.example.claimchapchap.databinding.FragmentTpftSilverMobilePaymentBinding


class SilverMobilePayment : Fragment() {

    private lateinit var binding: FragmentTpftSilverMobilePaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTpftSilverMobilePaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_silverMobilePayment_to_silverPaymentFragment2)
        }
        val next: Button = binding.button4
        next.setOnClickListener{
            findNavController().navigate(R.id.action_silverMobilePayment_to_mainActivity3)
        }
        return view
    }
}