package com.example.claimchapchap.insurancePolicies.thirdPartyFireAndTheft

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyPersonalInformationBinding
import com.example.claimchapchap.databinding.FragmentTpftPersonalInformationBinding

class PersonalInformationFragment : Fragment() {

    private lateinit var binding: FragmentTpftPersonalInformationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTpftPersonalInformationBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_personalInformationFragment_to_mainActivity3)
        }

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_personalInformationFragment_to_vehicleDetailsFragment)
        }
        return view
    }

}