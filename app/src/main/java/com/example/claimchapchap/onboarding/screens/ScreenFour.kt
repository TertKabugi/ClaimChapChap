package com.example.claimchapchap.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentScreenFourBinding
import com.example.claimchapchap.databinding.FragmentScreenThreeBinding

class ScreenFour : Fragment() {

    private lateinit var binding: FragmentScreenFourBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentScreenFourBinding.inflate(layoutInflater)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        view.findViewById<Button>(R.id.btnNext).setOnClickListener{
            viewPager?.currentItem = 4
        }
        view.findViewById<Button>(R.id.btnPrev).setOnClickListener{
            viewPager?.currentItem = 4
        }

        return view
    }

}