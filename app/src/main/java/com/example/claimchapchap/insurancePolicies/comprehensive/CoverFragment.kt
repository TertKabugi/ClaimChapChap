package com.example.claimchapchap.insurancePolicies.comprehensive

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentComprehensiveCoverBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class CoverFragment : Fragment() {

    private lateinit var binding: FragmentComprehensiveCoverBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment

        binding = FragmentComprehensiveCoverBinding.inflate(layoutInflater)
        val view = binding.root

        val navigation: BottomNavigationView = binding.coversView
        val navController = findNavController().navigate(R.id.nav_host_fragment_covers_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.gold_cover, R.id.silver_cover, R.id.bronze_cover
            )
        )
        //navigation.setupWithNavController(navController)



        return view
    }

}