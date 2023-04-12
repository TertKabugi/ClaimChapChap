package com.example.claimchapchap.insurancePolicies.comprehensive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.claimchapchap.databinding.FragmentComprehensiveGoldQuoteBinding

class GoldQuoteFragment : Fragment() {

    private lateinit var binding: FragmentComprehensiveGoldQuoteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentComprehensiveGoldQuoteBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext
        next.setOnClickListener{
            //findNavController().navigate(R.id.action_quoteFragment_to_paymentFragment)
        }
        return view
    }


}