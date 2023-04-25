package com.example.claimchapchap.insurancePolicies.comprehensive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlyVehicleDetailsBinding
import com.example.claimchapchap.databinding.FragmentComprehensiveVehicleDetailsBinding
import com.example.claimchapchap.models.Policies
import com.example.claimchapchap.sampleData.SampleDataUsers


class VehicleDetailsFragment : Fragment() {

    private lateinit var binding: FragmentComprehensiveVehicleDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentComprehensiveVehicleDetailsBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_vehicleDetailsFragment_to_personalInformationFragmentComprehensive)
        }

        val next: Button = binding.btnNext
        next.setOnClickListener{
            val newPolicy = Policies()
            newPolicy.firstName = binding.firstName.toString()
            newPolicy.secondName = binding.secondName.toString()
            newPolicy.email = binding.etEmailAddress.toString()
            newPolicy.phoneNumber = binding.etPhoneNumber.toString()
            newPolicy.password = binding.etPassword.toString()
            newPolicy.cPassword = binding.etConfirmPassword.toString()

            SampleDataUsers.addUser(newUser)
            findNavController().navigate(R.id.action_vehicleDetailsFragment_to_comprehensiveCoverActivity)
        }

        return view
    }


}