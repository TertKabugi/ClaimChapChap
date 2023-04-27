package com.example.claimchapchap.insurancePolicies.comprehensive.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentComprehensiveBronzeBinding
import com.example.claimchapchap.databinding.FragmentComprehensiveSilverBinding

class BronzeCoverFragment : Fragment() {

    private lateinit var binding: FragmentComprehensiveBronzeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentComprehensiveBronzeBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_comprehensiveCoverFragment_to_bronzeQuoteFragment6)
        }
        return view
    }
}