package com.example.claimchapchap.ui.claims.newclaim.partiesinvolved

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentClaimsDriverOneBinding


class DriverOne : Fragment() {

    private lateinit var binding: FragmentClaimsDriverOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClaimsDriverOneBinding.inflate(layoutInflater)
        val view = binding.root
        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_driver_one_to_driver_two)

        }
        return view
    }

}