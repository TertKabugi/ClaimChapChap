package com.example.claimchapchap.ui.claims.newclaim.partiesinvolved

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
import com.example.claimchapchap.databinding.FragmentClaimConfirmClaimBinding

class ConfirmClaimFragment : Fragment() {

    private lateinit var binding: FragmentClaimConfirmClaimBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentClaimConfirmClaimBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_confirmClaimFragment2_to_partiesInvolvedFragment2)
        }

        val claim: Button = binding.btnClaim
        claim.setOnClickListener{
            showClaimDialog()
        }
        return view
    }

    private fun showClaimDialog() {
        val claimDialog = AlertDialog.Builder(requireActivity())
        claimDialog.setTitle("Proceed To Make Claim?")
        val input = EditText(requireActivity())
        claimDialog.setView(input)
        claimDialog.setPositiveButton(
            "Yes"
        ) { dialog, which ->

            Toast.makeText(requireActivity(), "Claim Made Successfully", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_confirmClaimFragment2_to_mainActivity4)
        }
        claimDialog.setNegativeButton(
            "NO"
        ) { dialog, which -> dialog.dismiss() }
        claimDialog.show()
    }
}