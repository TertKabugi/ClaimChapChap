package com.example.claimchapchap.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentScreenThreeBinding
import com.example.claimchapchap.databinding.FragmentScreenTwoBinding

class ScreenThree : Fragment() {

    private lateinit var binding: FragmentScreenThreeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentScreenThreeBinding.inflate(layoutInflater)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        val skip = binding.skip
        skip.setOnClickListener{
            viewPager?.currentItem = 3
        }
        return view
    }

}