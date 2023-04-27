package com.example.claimchapchap.ui.claims.newclaim.partiesinvolved

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentClaimConfirmClaimBinding
import com.example.claimchapchap.databinding.FragmentClaimsThirdPartyBinding

class ThirdParty : Fragment() {

    private lateinit var binding: FragmentClaimsThirdPartyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClaimsThirdPartyBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext
        next.setOnClickListener{

            val firstName = binding.firstName.text.toString()
            val secondName = binding.secondName.text.toString()
            val dob = binding.dateOfBirth.text.toString()
            val idNumber = binding.idNumber.text.toString()
            val phoneNumber = binding.phoneNumber.text.toString()

            findNavController().navigate(R.id.action_partiesInvolvedFragment2_to_confirmClaimFragment2)

//            if (firstName.isEmpty() || secondName.isEmpty() || dob.isEmpty() || idNumber.isEmpty() || phoneNumber.isEmpty()) {
//                Toast.makeText(requireActivity(), "Missing Fields", Toast.LENGTH_SHORT).show()
//            } else {
//                findNavController().navigate(R.id.action_partiesInvolvedFragment2_to_confirmClaimFragment2)
//            }

        }
        return view
    }

}