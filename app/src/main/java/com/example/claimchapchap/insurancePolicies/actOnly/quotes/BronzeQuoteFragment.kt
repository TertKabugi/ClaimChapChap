package com.example.claimchapchap.insurancePolicies.actOnly.quotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlyBronzeQuoteBinding

class BronzeQuoteFragment : Fragment() {

    private lateinit var binding: FragmentActonlyBronzeQuoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActonlyBronzeQuoteBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_bronzeQuoteFragment2_to_actOnlyCoverActivity)
        }

        val next: Button = binding.btnNxt
        next.setOnClickListener{
            findNavController().navigate(R.id.action_bronzeQuoteFragment2_to_bronzePaymentFragment2)
        }
        return view
    }

}