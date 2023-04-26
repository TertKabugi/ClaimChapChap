package com.example.claimchapchap.onboarding.screens

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.MainActivity
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentScreenFiveBinding
import android.content.Intent as Intent

class ScreenFive : Fragment() {

    private lateinit var binding: FragmentScreenFiveBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment

        binding = FragmentScreenFiveBinding.inflate(layoutInflater)
        val view = binding.root

        val btnLogIn = binding.btnLogIn
        btnLogIn.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)
        }

        val btnSignUp = binding.btnSignUp
        btnSignUp.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_registrationActivity)
        }

        val btnHome = binding.btnHome
        btnHome.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_mainActivity)
            //onBoardingFinished()
        }

        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("finished", true)
        editor.apply()
    }
}