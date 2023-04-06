package com.example.claimchapchap.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view: View = binding.root

        val comprehensive = binding.rlComprehensive
        comprehensive.setOnClickListener{}

        val tpft = binding.rlTPFT
        tpft.setOnClickListener{}

        val thirdParty = binding.thirdParty
        thirdParty.setOnClickListener{}

        val actOnly = binding.rlActOnly
        actOnly.setOnClickListener{}


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}