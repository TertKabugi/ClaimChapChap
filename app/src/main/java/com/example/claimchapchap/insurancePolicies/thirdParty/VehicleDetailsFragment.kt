package com.example.claimchapchap.insurancePolicies.thirdParty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyVehicleDetailsBinding

class VehicleDetailsFragment : Fragment() {

    private lateinit var binding: FragmentThirdpartyVehicleDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentThirdpartyVehicleDetailsBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_vehicleDetailsFragment_to_personalInformationFragment2)
        }

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_vehicleDetailsFragment_to_thirdPartyCoverActivity)
        }

        return view
    }

}