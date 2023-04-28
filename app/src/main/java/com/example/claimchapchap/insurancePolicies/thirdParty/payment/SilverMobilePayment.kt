package com.example.claimchapchap.insurancePolicies.thirdParty.payment

import android.os.Binder
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
import com.example.claimchapchap.databinding.FragmentThirdpartySilverMobilePaymentBinding

class SilverMobilePayment : Fragment() {

    private lateinit var binding: FragmentThirdpartySilverMobilePaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartySilverMobilePaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_silverMobilePayment4_to_silverPaymentFragment5)
        }
        val next: Button = binding.button4
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
            findNavController().navigate(R.id.action_silverMobilePayment4_to_mainActivity2)
        }
        thirdPartyDialog.setNegativeButton(
            "NO"
        ) { dialog, which -> dialog.dismiss() }
        thirdPartyDialog.show()
    }
}