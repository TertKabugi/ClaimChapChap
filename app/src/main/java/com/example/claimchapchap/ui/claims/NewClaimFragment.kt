package com.example.claimchapchap.ui.claims

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentNewClaimBinding
import com.example.claimchapchap.onboarding.ViewPagerAdapter
import com.example.claimchapchap.onboarding.screens.*
import com.example.claimchapchap.ui.claims.newclaim.NewClaimFragmentOne
import com.example.claimchapchap.ui.claims.newclaim.NewClaimFragmentTwo
import com.google.android.material.bottomnavigation.BottomNavigationView

class NewClaimFragment : Fragment() {

    private lateinit var binding: FragmentNewClaimBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewClaimBinding.inflate(layoutInflater)
        val view = binding.root

        val fragmentList = arrayListOf<Fragment>(
            NewClaimFragmentOne(),
            NewClaimFragmentTwo()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        // viewPager = id
        binding.viewPager.adapter = adapter

        return view
    }
}