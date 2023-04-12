package com.example.claimchapchap.ui.home

import android.content.Intent
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
import com.example.claimchapchap.insurancePolicies.comprehensive.ComprehensiveMainFragment

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
        comprehensive.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_personalInformationFragmentComprehensive)
        }

        val tpft = binding.rlTPFT
        tpft.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_personalInformationFragmentTPFT)
        }

        val thirdParty = binding.rlThirdParty
        thirdParty.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_personalInformationFragmentThirdParty)
        }

        val actOnly = binding.rlActOnly
        actOnly.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_home_to_personalInformationFragmentActOnly)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}