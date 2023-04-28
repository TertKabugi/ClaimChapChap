package com.example.claimchapchap.insurancePolicies.actOnly.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlyBronzeCardBinding


class BronzeCardFragment : Fragment() {

    private lateinit var binding: FragmentActonlyBronzeCardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActonlyBronzeCardBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_bronzeCardFragment2_to_bronzePaymentFragment4)
        }

        val next: Button = binding.btnNext
        next.setOnClickListener{
            showActOnlyDialog()
        }
        return view
    }

    private fun showActOnlyDialog() {
        val actOnlyDialog = AlertDialog.Builder(requireActivity())
        actOnlyDialog.setTitle("Do You Want To Apply For This Act Only Insurance Plan?")
        val input = EditText(requireActivity())
        actOnlyDialog.setView(input)
        actOnlyDialog.setPositiveButton(
            "Yes"
        ) { dialog, which ->

            Toast.makeText(requireActivity(), "Act Only Insurance Plan Applied Successfully!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_bronzeCardFragment2_to_mainActivity)
        }
        actOnlyDialog.setNegativeButton(
            "NO"
        ) { dialog, which -> dialog.dismiss() }
        actOnlyDialog.show()
    }
}