package com.example.claimchapchap.insurancePolicies.thirdParty.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
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

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_goldMobilePayment3_to_goldPaymentFragment)
        }
        val next: Button = binding.button4
        next.setOnClickListener{
            findNavController().navigate(R.id.action_goldMobilePayment3_to_mainActivity2)
        }
        return view
    }

}