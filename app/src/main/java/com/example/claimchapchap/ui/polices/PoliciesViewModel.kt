package com.example.claimchapchap.ui.polices

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PoliciesViewModel : ViewModel() {

    private val _carName = MutableLiveData<String>().apply {
        value = "Toyota Demio"
    }
    val text: LiveData<String> = _carName

    private val _policy = MutableLiveData<String>().apply {
        value = "Comprehensive Insurance Cover\n" +
                "Policy Ends: 09/05/2024\n" +
                "Next Payment: 17/08/2023"
    }
    val policy: LiveData<String> = _policy

    private val _carNameOne = MutableLiveData<String>().apply {
        value = "Ford Bronco"
    }
    val textOne: LiveData<String> = _carNameOne

    private val _policyOne = MutableLiveData<String>().apply {
        value = "Comprehensive Insurance Cover\n" +
                "Policy Ends: 09/05/2024\n" +
                "Next Payment: 17/08/2023"
    }
    val policyOne: LiveData<String> = _policyOne
}