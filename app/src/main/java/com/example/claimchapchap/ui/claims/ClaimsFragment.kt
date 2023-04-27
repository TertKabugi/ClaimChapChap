package com.example.claimchapchap.ui.claims

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentClaimsBinding

class ClaimsFragment : Fragment() {

    private var _binding: FragmentClaimsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val claimsViewModel =
            ViewModelProvider(this).get(ClaimsViewModel::class.java)

        _binding = FragmentClaimsBinding.inflate(inflater, container, false)
        val view = binding.root

        val policyOne: TextView = binding.policyOne
        claimsViewModel.policyOne.observe(viewLifecycleOwner) {
            policyOne.text = it
        }
        val txtPolicyOne: TextView = binding.txtPolicyOne
        claimsViewModel.policyOneTxt.observe(viewLifecycleOwner) {
            txtPolicyOne.text = it
        }
        val policyTwo: TextView = binding.policyTwo
        claimsViewModel.policyTwo.observe(viewLifecycleOwner) {
            policyTwo.text = it
        }

        val txtPolicyTwo: TextView = binding.txtPolicyTwo
        claimsViewModel.policyTwoTxt.observe(viewLifecycleOwner) {
            txtPolicyTwo.text = it
        }

        val next = binding.newClaim
        next.setOnClickListener{
            findNavController().navigate(R.id.action_navigation_claims_to_claimsActivity)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}