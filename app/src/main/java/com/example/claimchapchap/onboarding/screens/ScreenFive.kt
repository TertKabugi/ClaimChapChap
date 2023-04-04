package com.example.claimchapchap.onboarding.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.claimchapchap.MainActivity
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentScreenFiveBinding
import android.content.Intent as Intent

class ScreenFive : Fragment() {

    private lateinit var binding: FragmentScreenFiveBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentScreenFiveBinding.inflate(layoutInflater)
        val view = binding.root

        val btnHome = binding.btnHome
        btnHome.setOnClickListener{}

        val btnLogIn = binding.btnLogIn
        btnLogIn.setOnClickListener{}
        return view
    }

}