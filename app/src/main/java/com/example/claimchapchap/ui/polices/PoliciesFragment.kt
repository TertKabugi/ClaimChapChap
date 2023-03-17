package com.example.claimchapchap.ui.polices

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.claimchapchap.databinding.FragmentPoliciesBinding

class PoliciesFragment : Fragment() {

    private var _binding: FragmentPoliciesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val policiesViewModel =
            ViewModelProvider(this).get(PoliciesViewModel::class.java)

        _binding = FragmentPoliciesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val carName: TextView = binding.policyOne
        policiesViewModel.text.observe(viewLifecycleOwner) {
            carName.text = it
        }
        val policyDetails: TextView = binding.txtPolicyOne
        policiesViewModel.policy.observe(viewLifecycleOwner){
            policyDetails.text = it
        }
        val carNameOne: TextView = binding.policyTwo
        policiesViewModel.textOne.observe(viewLifecycleOwner) {
            carNameOne.text = it
        }
        val policyDetailsOne: TextView = binding.txtPolicyTwo
        policiesViewModel.policyOne.observe(viewLifecycleOwner){
            policyDetailsOne.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}