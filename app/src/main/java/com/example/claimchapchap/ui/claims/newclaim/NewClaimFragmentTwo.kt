package com.example.claimchapchap.ui.claims.newclaim

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.core.view.get
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentNewClaimTwoBinding
import com.example.claimchapchap.databinding.TestBinding

class NewClaimFragmentTwo : Fragment() {

    private lateinit var binding: FragmentNewClaimTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewClaimTwoBinding.inflate(layoutInflater)
        val view = binding.root

        val incidentSeverity = listOf("Trivial Damage","Minor Damage","Major Damage","Total Loss")
        val incident: AutoCompleteTextView = binding.incident
        val incidentAdapter = ArrayAdapter(requireContext(),R.layout.z_list_incident_severity, incidentSeverity)
        incident.setAdapter(incidentAdapter)

        val authoritiesContacted = listOf("Paramedics","Fire Department","Traffic Police","Others","None")
        val authorities: AutoCompleteTextView = binding.authorities
        val authoritiesAdapter = ArrayAdapter(requireContext(),R.layout.z_list_authorities_contacted, authoritiesContacted)
        authorities.setAdapter(authoritiesAdapter)

        val policeReportAvailable = listOf("Yes","No","N/A")
        val policeReport: AutoCompleteTextView = binding.policeReport
        val policeReportAdapter = ArrayAdapter(requireContext(),R.layout.z_list_authorities_contacted, policeReportAvailable)
        policeReport.setAdapter(policeReportAdapter)

        val propertyDamage = listOf("Yes","No","N/A")
        val damage: AutoCompleteTextView = binding.propertyDamage
        val damageAdapter = ArrayAdapter(requireContext(),R.layout.z_list_yes_no, propertyDamage)
        damage.setAdapter(damageAdapter)

        val next: Button = binding.btnNext
        next.setOnClickListener{
            findNavController().navigate(R.id.action_newClaimMainFragment_to_partiesInvolvedFragment)
        }

        return view
    }
}