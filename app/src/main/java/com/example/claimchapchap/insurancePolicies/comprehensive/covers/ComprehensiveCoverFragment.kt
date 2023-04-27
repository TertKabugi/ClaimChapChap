package com.example.claimchapchap.insurancePolicies.comprehensive.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlyCoverBinding
import com.example.claimchapchap.databinding.FragmentComprehensiveCoverBinding
import com.example.claimchapchap.insurancePolicies.actOnly.covers.ActOnlyCoverAdapter

class ComprehensiveCoverFragment : Fragment() {

    private lateinit var binding:FragmentComprehensiveCoverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentComprehensiveCoverBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_comprehensiveCoverFragment_to_vehicleDetailsFragment)
        }

        val viewPager = binding.viewPager
        val tabLayout = binding.tabOne

        val fragmentAdapter = ComprehensiveCoverAdapter(parentFragmentManager)
        fragmentAdapter.addFragment(GoldCoverFragment(), "Gold")
        fragmentAdapter.addFragment(SilverCoverFragment(), "Silver")
        fragmentAdapter.addFragment(BronzeCoverFragment(), "Bronze")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        return view
    }

}