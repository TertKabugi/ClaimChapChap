package com.example.claimchapchap.insurancePolicies.actOnly.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlySilverCardPaymentBinding
import com.example.claimchapchap.databinding.FragmentComprehensiveSilverCardPaymentBinding

class SilverCardPaymentFragment : Fragment() {

    private lateinit var binding: FragmentActonlySilverCardPaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentActonlySilverCardPaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_silverCardPaymentFragment_to_silverPaymentFragment2)
        }
        return view
    }
}