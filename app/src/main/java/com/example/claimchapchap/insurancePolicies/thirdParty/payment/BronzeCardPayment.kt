package com.example.claimchapchap.insurancePolicies.thirdParty.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartyBronzeCardPaymentBinding

class BronzeCardPayment : Fragment() {

    private lateinit var binding: FragmentThirdpartyBronzeCardPaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartyBronzeCardPaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_bronzeCardPayment4_to_bronzePaymentFragment)
        }
        val next: Button = binding.btnNext
        next.setOnClickListener{
            showThirdPartyDialog()
        }
        return view
    }

    private fun showThirdPartyDialog() {
        val thirdPartyDialog = AlertDialog.Builder(requireActivity())
        thirdPartyDialog.setTitle("Do You Want To Apply For This Third Party Insurance Plan?")
        val input = EditText(requireActivity())
        thirdPartyDialog.setView(input)
        thirdPartyDialog.setPositiveButton(
            "Yes"
        ) { dialog, which ->

            Toast.makeText(requireActivity(), "Third Party Insurance Plan Applied Successfully!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_bronzeCardPayment4_to_mainActivity2)
        }
        thirdPartyDialog.setNegativeButton(
            "NO"
        ) { dialog, which -> dialog.dismiss() }
        thirdPartyDialog.show()
    }
}