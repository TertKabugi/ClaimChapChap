package com.example.claimchapchap.ui.claims.newclaim.partiesinvolved

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentClaimsPartiesInvolvedBinding

class PartiesInvolvedFragment : Fragment() {

    private lateinit var binding: FragmentClaimsPartiesInvolvedBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClaimsPartiesInvolvedBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_partiesInvolvedFragment_to_newClaimMainFragment)
        }

        val viewPager = binding.viewPager as ViewPager
        val tabLayout = binding.tabOne

        val fragmentAdapter = PartiesInvolvedAdapter(parentFragmentManager)
        fragmentAdapter.addFragment(DriverOne(), "Driver One")
        fragmentAdapter.addFragment(DriverTwo(), "Driver Two")
        fragmentAdapter.addFragment(ThirdParty(), "Third Party")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)


        return view
    }
}