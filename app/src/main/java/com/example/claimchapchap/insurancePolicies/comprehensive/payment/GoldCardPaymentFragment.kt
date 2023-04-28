package com.example.claimchapchap.insurancePolicies.comprehensive.payment

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
import com.example.claimchapchap.databinding.FragmentComprehensiveGoldCardPaymentBinding

class GoldCardPaymentFragment : Fragment() {

    private lateinit var binding: FragmentComprehensiveGoldCardPaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentComprehensiveGoldCardPaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_goldCardPaymentFragment3_to_goldPaymentFragment5)
        }

        val next: Button = binding.btnNext
        next.setOnClickListener{
            showComprehensiveDialog()
        }

        return view
    }
    private fun showComprehensiveDialog() {
        val comprehensiveDialog = AlertDialog.Builder(requireActivity())
        comprehensiveDialog.setTitle("Do You Want To Apply For This Comprehensive Plan?")
        val input = EditText(requireActivity())
        comprehensiveDialog.setView(input)
        comprehensiveDialog.setPositiveButton(
            "Yes"
        ) { dialog, which ->

            Toast.makeText(requireActivity(), "Comprehensive Plan Applied Successfully!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_goldCardPaymentFragment3_to_mainActivity)
        }
        comprehensiveDialog.setNegativeButton(
            "NO"
        ) { dialog, which -> dialog.dismiss() }
        comprehensiveDialog.show()
    }
}