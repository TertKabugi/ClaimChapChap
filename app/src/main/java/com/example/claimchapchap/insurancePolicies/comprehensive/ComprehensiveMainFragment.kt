package com.example.claimchapchap.insurancePolicies.comprehensive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentComprehensiveMainBinding

class ComprehensiveMainFragment : Fragment() {

    private lateinit var binding: FragmentComprehensiveMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentComprehensiveMainBinding.inflate(layoutInflater)
        val view: View = binding.root

        return view
    }

}