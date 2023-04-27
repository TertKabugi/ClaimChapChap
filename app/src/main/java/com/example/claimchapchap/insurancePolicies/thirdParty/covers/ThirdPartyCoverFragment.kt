package com.example.claimchapchap.insurancePolicies.thirdParty.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyCoverBinding
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.BronzeCoverFragment
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.ComprehensiveCoverAdapter
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.GoldCoverFragment
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.SilverCoverFragment

class ThirdPartyCoverFragment : Fragment() {

    private lateinit var binding: FragmentThirdpartyCoverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartyCoverBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_thirdPartyCoverFragment_to_vehicleDetailsFragment)
        }

        val viewPager = binding.viewPager
        val tabLayout = binding.tabOne

        val fragmentAdapter = ThirdPartyCoverAdapter(parentFragmentManager)
        fragmentAdapter.addFragment(com.example.claimchapchap.insurancePolicies.thirdParty.covers.GoldCoverFragment(), "Gold")
        fragmentAdapter.addFragment(com.example.claimchapchap.insurancePolicies.thirdParty.covers.SilverCoverFragment(), "Silver")
        fragmentAdapter.addFragment(com.example.claimchapchap.insurancePolicies.thirdParty.covers.BronzeCoverFragment(), "Bronze")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        return view
    }
}