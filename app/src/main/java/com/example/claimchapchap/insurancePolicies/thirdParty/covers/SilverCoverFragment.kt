package com.example.claimchapchap.insurancePolicies.thirdParty.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartySilverBinding

class SilverCoverFragment : Fragment() {

    private lateinit var binding: FragmentThirdpartySilverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartySilverBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_thirdPartyCoverFragment_to_silverQuoteFragment6)
        }
        return view
    }

}