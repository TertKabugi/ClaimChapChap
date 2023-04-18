package com.example.claimchapchap.insurancePolicies.thirdParty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityThirdpartyCoverBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ThirdPartyCoverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdpartyCoverBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdpartyCoverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            onBackPressed()
        }

        val navigation: BottomNavigationView = binding.coversView
        val navController = findNavController(R.id.nav_host_fragment_covers_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.goldFragment2, R.id.silverFragment2, R.id.bronzeFragment2
            )
        )
        navigation.setupWithNavController(navController)

    }
}