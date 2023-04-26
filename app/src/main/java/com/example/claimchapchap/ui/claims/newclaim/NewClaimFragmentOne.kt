package com.example.claimchapchap.ui.claims.newclaim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
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

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_newClaimFragmentOne2_to_newClaimFragmentTwo2)

        }
        return view
    }
}