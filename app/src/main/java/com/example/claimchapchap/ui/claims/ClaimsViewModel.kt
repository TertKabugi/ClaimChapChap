package com.example.claimchapchap.ui.claims

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClaimsViewModel : ViewModel() {

    private val _policyOne = MutableLiveData<String>().apply {
        value = "Toyota Demio"
    }
    val policyOne: LiveData<String> = _policyOne

    private val _txtPoicyOne = MutableLiveData<String>().apply {
        value = "Comprehensive Insurance Cover\n" +
                "Policy Ends: 09/05/2024\n" +
                "Next Payment: 17/08/2023"
    }
    val policyOneTxt: LiveData<String> = _txtPoicyOne

    private val _policyTwo = MutableLiveData<String>().apply {
        value = "Ford Bronco"
    }
    val policyTwo: LiveData<String> = _policyTwo

    private val _policyTwoTxt = MutableLiveData<String>().apply {
        value = "Comprehensive Insurance Cover\n" +
                "Policy Ends: 09/05/2024\n" +
                "Next Payment: 17/08/2023"
    }
    val policyTwoTxt: LiveData<String> = _policyTwoTxt
}