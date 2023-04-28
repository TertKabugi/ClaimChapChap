package com.example.claimchapchap.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Authentication {

    private const val LOGIN_BASE_URL = "http://10.20.33.73:8080/api/v1/auth/login/"
    private const val REGISTRATION_BASE_URL = "http://10.20.33.73:8080/api/v1/auth/register/"

    private val httpClient = OkHttpClient.Builder().build()

    private val loginRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(LOGIN_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }

    private val registrationRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(REGISTRATION_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }

}