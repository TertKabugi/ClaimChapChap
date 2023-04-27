package com.example.claimchapchap.ui.claims.newclaim.partiesinvolved

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentClaimsDriverOneBinding
import com.example.claimchapchap.databinding.FragmentClaimsDriverTwoBinding

class DriverTwo : Fragment() {

    private lateinit var binding: FragmentClaimsDriverTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClaimsDriverTwoBinding.inflate(layoutInflater)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager>(R.id.viewPager)
        val next = binding.btnNext
        next.setOnClickListener{

            val firstName = binding.firstName.text.toString()
            val secondName = binding.secondName.text.toString()
            val dob = binding.dateOfBirth.text.toString()
            val idNumber = binding.idNumber.text.toString()
            val phoneNumber = binding.phoneNumber.text.toString()
            val licenceNumber = binding.driversLicense.text.toString()
            val numberPlate = binding.numberPlate.text.toString()

            if (firstName.isEmpty() || secondName.isEmpty() || dob.isEmpty() || idNumber.isEmpty() || phoneNumber.isEmpty() || licenceNumber.isEmpty() || numberPlate.isEmpty()) {
                Toast.makeText(requireActivity(), "Missing Fields", Toast.LENGTH_SHORT).show()
            } else {
                viewPager?.currentItem = 2
            }
        }
        return view
    }


}