package com.example.claimchapchap.insurancePolicies.actOnly.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlySilverBinding

class ActOnlySilverCoverFragment : Fragment() {

    private lateinit var binding: FragmentActonlySilverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActonlySilverBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_actOnlyCoverFragment_to_silverQuoteFragment4)
        }
        return view
    }
}