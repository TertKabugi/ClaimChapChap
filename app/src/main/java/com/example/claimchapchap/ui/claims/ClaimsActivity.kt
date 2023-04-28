package com.example.claimchapchap.ui.claims

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.claimchapchap.MainActivity
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityClaimsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ClaimsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClaimsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClaimsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                println("Back Pressed")
            }

        })
    }
}