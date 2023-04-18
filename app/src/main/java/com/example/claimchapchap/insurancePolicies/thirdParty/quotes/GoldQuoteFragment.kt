package com.example.claimchapchap.insurancePolicies.thirdParty.quotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyGoldQuoteBinding

class GoldQuoteFragment : Fragment() {

    private lateinit var binding: FragmentThirdpartyGoldQuoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartyGoldQuoteBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_goldQuoteFragment3_to_thirdPartyCoverActivity3)
        }
        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_goldQuoteFragment3_to_goldPaymentFragment3)
        }

        return view
    }

}