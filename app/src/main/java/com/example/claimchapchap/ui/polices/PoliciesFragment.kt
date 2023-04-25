package com.example.claimchapchap.ui.polices

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.claimchapchap.databinding.FragmentPoliciesBinding
import com.example.claimchapchap.models.Policies
import com.example.claimchapchap.services.PolicyServices
import com.example.claimchapchap.services.ServiceBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
            ViewModelProvider(this)[PoliciesViewModel::class.java]

        _binding = FragmentPoliciesBinding.inflate(inflater, container, false)
        val list: RecyclerView = binding.recyclerView


//        val carName: TextView = binding.policyOne
//        policiesViewModel.text.observe(viewLifecycleOwner) {
//            carName.text = it
//        }
//        val policyDetails: TextView = binding.txtPolicyOne
//        policiesViewModel.policy.observe(viewLifecycleOwner){
//            policyDetails.text = it
//        }
//        val carNameOne: TextView = binding.policyTwo
//        policiesViewModel.textOne.observe(viewLifecycleOwner) {
//            carNameOne.text = it
//        }
//        val policyDetailsOne: TextView = binding.txtPolicyTwo
//        policiesViewModel.policyOne.observe(viewLifecycleOwner){
//            policyDetailsOne.text = it
//        }
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

//    private fun loadPolicies(){
//        val list: RecyclerView = binding.recyclerView
//        //list.adapter = Users(SampleData)
//        val usersServices = ServiceBuilder.buildService(PolicyServices::class.java)
//        val requestCall = usersServices.getPolicyList()
//        requestCall.enqueue(object: Callback<List<Policies>> {
//            override fun onResponse(
//                call: Call<List<Policies>>,
//                response: Response<List<Policies>>
//            ) {
//                if (response.isSuccessful){
//                    val policiesList = response.body()!!
//                    val list: RecyclerView = binding.recyclerView
//                    list.adapter = PolicyAdapter(policiesList)
//                }
//            }
//
//            override fun onFailure(call: Call<List<Policies>>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//        })
//    }
}