package com.example.claimchapchap.insurancePolicies.comprehensive

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.MainActivity
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityComprehensiveCoverBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ComprehensiveCoverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityComprehensiveCoverBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComprehensiveCoverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        val navigation: BottomNavigationView = binding.coversView
        val navController = findNavController(R.id.nav_host_fragment_covers_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.gold_cover, R.id.silver_cover, R.id.bronze_cover
            )
        )
        navigation.setupWithNavController(navController)
    }
}