package com.example.claimchapchap.insurancePolicies.thirdPartyFireAndTheft.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentTpftCoverBinding

class TPFTCoverFragment : Fragment() {

    private lateinit var binding: FragmentTpftCoverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTpftCoverBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_TPFTCoverFragment_to_vehicleDetailsFragment)
        }

        val viewPager = binding.viewPager
        val tabLayout = binding.tabOne

        val fragmentAdapter = TPFTCoverAdapter(parentFragmentManager)
        fragmentAdapter.addFragment(GoldFragment(), "Gold")
        fragmentAdapter.addFragment(SilverFragment(), "Silver")
        fragmentAdapter.addFragment(BronzeFragment(), "Bronze")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        return view
    }
}