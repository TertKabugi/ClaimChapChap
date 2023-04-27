package com.example.claimchapchap.ui.claims.newclaim

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.claimchapchap.R
import com.example.claimchapchap.VerifyAccount
import com.example.claimchapchap.databinding.FragmentNewClaimOneBinding

class NewClaimFragmentOne : Fragment() {

    private lateinit var binding: FragmentNewClaimOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewClaimOneBinding.inflate(layoutInflater)
        val view = binding.root

        val incidentType = listOf("Multi Vehicle Collision","Parked Car","Single Vehicle Collision","Vehicle Theft")
        val incident: AutoCompleteTextView = binding.incident
        val incidentAdapter = ArrayAdapter(requireContext(),R.layout.z_list_incident_type, incidentType)
        incident.setAdapter(incidentAdapter)

        val collisionType = listOf("Front Collision","Rear Collision","Side Collision","Not Sure")
        val collision: AutoCompleteTextView = binding.collision
        val collisionAdapter = ArrayAdapter(requireContext(),R.layout.z_list_collision_type, collisionType)
        collision.setAdapter(collisionAdapter)

        val viewPager = activity?.findViewById<ViewPager>(R.id.viewPager)
        val next = binding.btnNext
        next.setOnClickListener{

            val policyNumber = binding.policyNumber.text.toString()
            val location = binding.location.text.toString()
            val accidentDate = binding.accidentDate.text.toString()
            val accidentTime = binding.accidentTime.text.toString()
            val incidentType = binding.incident.text.toString()
            val collisionType = binding.collision.text.toString()

            if (policyNumber.isEmpty() || location.isEmpty() || accidentDate.isEmpty() || accidentTime.isEmpty() || incidentType.isEmpty() || collisionType.isEmpty()) {
                Toast.makeText(requireActivity(), "Missing Fields", Toast.LENGTH_SHORT).show()
            } else {
                viewPager?.currentItem = 1
            }

        }
        return view
    }
}