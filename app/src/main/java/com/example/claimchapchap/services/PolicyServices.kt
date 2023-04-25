package com.example.claimchapchap.services

import com.example.claimchapchap.models.Policies
import retrofit2.Call
import retrofit2.http.GET

interface PolicyServices {

    @GET("policies")
    fun getPolicyList(): Call<List<Policies>>
}