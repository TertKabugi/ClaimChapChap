package com.example.claimchapchap.ui.claims

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClaimsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    private val _anotherText = MutableLiveData<String>().apply {
        value = "Another TextView "
    }
    val anotherText: LiveData<String> = _anotherText
}