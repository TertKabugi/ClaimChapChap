package com.example.claimchapchap.ui.claims.newclaim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.ActivityNewClaimBinding
import com.example.claimchapchap.databinding.TestBinding
import com.google.android.material.tabs.TabLayout

class NewClaimActivity : AppCompatActivity() {

    private lateinit var binding: TestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TestBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val viewPager = binding.viewPager as ViewPager
//        val tablayout = binding.tabOne
//
//        val fragmentAdapter = NewClaimAdapter(supportFragmentManager)
//        fragmentAdapter.addFragment(NewClaimFragmentOne(), "Page One")
//        fragmentAdapter.addFragment(NewClaimFragmentTwo(), "Page Two")
//
//        viewPager.adapter = fragmentAdapter
//        tablayout.setupWithViewPager(viewPager)

        val item = listOf("me","me","me","me","me")
        val text: AutoCompleteTextView = binding.text
        val adapter = ArrayAdapter(this,R.layout.z_list_item, item)
        text.setAdapter(adapter)



    }
}