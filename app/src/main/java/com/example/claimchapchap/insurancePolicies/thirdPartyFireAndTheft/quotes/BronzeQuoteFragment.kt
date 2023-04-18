package com.example.claimchapchap.insurancePolicies.thirdPartyFireAndTheft.quotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyBronzeQuoteBinding
import com.example.claimchapchap.databinding.FragmentTpftBronzeQuoteBinding

class BronzeQuoteFragment : Fragment() {

    private lateinit var binding: FragmentTpftBronzeQuoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTpftBronzeQuoteBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_bronzeQuoteFragment4_to_TPFTCoversActivity4)
        }

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_bronzeQuoteFragment4_to_bronzePaymentFragment4)
        }
        return view
    }

}