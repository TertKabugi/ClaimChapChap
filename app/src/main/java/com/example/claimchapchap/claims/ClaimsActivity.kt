package com.example.claimchapchap.claims

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityClaimsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ClaimsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClaimsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityClaimsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navigation: BottomNavigationView = binding.claimsView
        val navController = findNavController(R.id.nav_host_fragment_claims_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.driver_one, R.id.driver_two, R.id.third_party
            )
        )
        navigation.setupWithNavController(navController)
    }
}