package com.example.claimchapchap.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentScreenOneBinding
import com.example.claimchapchap.databinding.FragmentScreenTwoBinding

class ScreenTwo : Fragment() {

    private lateinit var binding: FragmentScreenTwoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentScreenTwoBinding.inflate(layoutInflater)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        view.findViewById<Button>(R.id.btnNext).setOnClickListener{
            viewPager?.currentItem = 2
        }
        view.findViewById<Button>(R.id.btnPrev).setOnClickListener{
            viewPager?.currentItem = 2
        }

        return view
    }


}