package com.example.claimchapchap.ui.claims.newclaim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityNewClaimBinding
import com.example.claimchapchap.databinding.FragmentNewClaimTwoBinding
import com.example.claimchapchap.databinding.TestBinding
import com.google.android.material.tabs.TabLayout

class NewClaimActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewClaimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewClaimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.viewPager as ViewPager
        val tablayout = binding.tabOne

        val fragmentAdapter = NewClaimAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(NewClaimFragmentOne(), "Page One")
        fragmentAdapter.addFragment(NewClaimFragmentTwo(), "Page Two")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

    }
}