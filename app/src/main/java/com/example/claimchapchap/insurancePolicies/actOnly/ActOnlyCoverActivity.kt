package com.example.claimchapchap.insurancePolicies.actOnly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.MainActivity
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityActonlyCoversBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActOnlyCoverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActonlyCoversBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActonlyCoversBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        val navigation: BottomNavigationView = binding.coversView
        val navController = findNavController(R.id.nav_host_fragment_covers_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.goldFragment, R.id.silverFragment, R.id.bronzeFragment
            )
        )
        navigation.setupWithNavController(navController)
    }
}