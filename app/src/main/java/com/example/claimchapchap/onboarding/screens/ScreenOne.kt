package com.example.claimchapchap.onboarding.screens

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentScreenOneBinding

class ScreenOne : Fragment() {

    private lateinit var binding: FragmentScreenOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentScreenOneBinding.inflate(layoutInflater)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        val skip = binding.skip
        skip.setOnClickListener{
            viewPager?.currentItem = 1
        }
        return view
    }

}