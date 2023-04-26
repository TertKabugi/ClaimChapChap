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
import com.example.claimchapchap.sampleData.SampleDataPolicies
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
            newPolicy.carMake = binding.carMake.toString()
            newPolicy.carModel = binding.carModel.toString()
            newPolicy.yom = binding.yearOfManufacture.toString()
            newPolicy.dop = binding.dateOfPurchase.toString()
            newPolicy.carValuation = binding.carValuation.toString()
            newPolicy.numberPlate = binding.numberPlate.toString()

            SampleDataPolicies.addPolicy(newPolicy)
            findNavController().navigate(R.id.action_vehicleDetailsFragment_to_comprehensiveCoverActivity)
        }

        return view
    }


}