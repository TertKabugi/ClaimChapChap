package com.example.claimchapchap.insurancePolicies.comprehensive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentComprehensivePersonalInformationBinding
import com.example.claimchapchap.models.Policies
import com.example.claimchapchap.models.Users
import com.example.claimchapchap.sampleData.SampleDataPolicies
import com.example.claimchapchap.sampleData.SampleDataUsers
import com.google.android.material.bottomnavigation.BottomNavigationView

class PersonalInformationFragment : Fragment() {

    private lateinit var binding: FragmentComprehensivePersonalInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentComprehensivePersonalInformationBinding.inflate(layoutInflater)
        val view = binding.root


        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_personalInformationFragmentComprehensive_to_homeFragment)
        }
        val next: Button = binding.btnNext
        next.setOnClickListener{
            val newPolicy = Policies()
            newPolicy.firstName = binding.firstName.toString()
            newPolicy.secondName = binding.secondName.toString()
            newPolicy.dob = binding.dateOfBirth.toString()
            newPolicy.nationalID = binding.idNumber.toString()
            newPolicy.kraPin = binding.kra.toString()
            newPolicy.phoneNumber = binding.phoneNumber.toString()
            newPolicy.driversLicenceNo = binding.driversLicense.toString()

            SampleDataPolicies.addPolicy(newPolicy)
            findNavController().navigate(R.id.action_personalInformationFragmentComprehensive_to_vehicleDetailsFragment)
        }


        return view
    }
}