package com.example.claimchapchap.services

import com.example.claimchapchap.models.Users
import retrofit2.Call
import retrofit2.http.GET


interface UsersServices {

    @GET("users")
    fun getUserList(): Call<List<Users>>
}