package com.example.claimchapchap.insurancePolicies.thirdParty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyPersonalInformationBinding

class PersonalInformationFragment : Fragment() {

    private lateinit var binding: FragmentThirdpartyPersonalInformationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentThirdpartyPersonalInformationBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_personalInformationFragment_to_vehicleDetailsFragment)
        }
        return view
    }

}