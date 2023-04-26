package com.example.claimchapchap.models

data class Users(
    var id: Int,
    var firstName: String,
    var secondName: String,
    var email: String,
    var phoneNumber: String,
    var password: String,
    var cPassword: String
)