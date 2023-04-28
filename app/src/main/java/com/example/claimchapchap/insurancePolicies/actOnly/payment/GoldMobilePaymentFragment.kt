package com.example.claimchapchap.insurancePolicies.actOnly.payment

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
import com.example.claimchapchap.databinding.FragmentActonlyGoldMobilePaymentBinding

class GoldMobilePaymentFragment : Fragment() {

    private lateinit var binding: FragmentActonlyGoldMobilePaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActonlyGoldMobilePaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_goldMobilePaymentFragment_to_goldPaymentFragment3)
        }

        val next: Button = binding.button4
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
            findNavController().navigate(R.id.action_goldMobilePaymentFragment_to_mainActivity)
        }
        actOnlyDialog.setNegativeButton(
            "NO"
        ) { dialog, which -> dialog.dismiss() }
        actOnlyDialog.show()
    }
}