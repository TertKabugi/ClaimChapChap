package com.example.claimchapchap.insurancePolicies.thirdPartyFireAndTheft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.MainActivity
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityTpftCoversBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class TPFTCoversActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTpftCoversBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTpftCoversBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            //onBackPressed()
            startActivity(Intent(this, MainActivity::class.java))
        }

//        val back: ImageView = binding.backIcon
//        back.setOnClickListener(View.OnClickListener {
//
//        })

        val navigation: BottomNavigationView = binding.coversView
        val navController = findNavController(R.id.nav_host_fragment_covers_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.goldFragment3, R.id.silverFragment3, R.id.bronzeFragment3
            )
        )
        navigation.setupWithNavController(navController)
    }
}