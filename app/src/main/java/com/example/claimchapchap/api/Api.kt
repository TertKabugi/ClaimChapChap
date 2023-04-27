package com.example.claimchapchap.api

import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.claimchapchap.models.DefaultResponse
import com.example.claimchapchap.models.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {
    @FormUrlEncoded
    @POST("register")
    fun createUser(
        @Field("firstName") firstName: String,
        @Field("secondName") secondName: String,
        @Field("email") email: String,
        @Field("phone") phoneNumber: String,
        @Field("password") password: String,
        @Field("confirm password") cPassword: String

    ): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("userlogin")
    fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<LoginResponse>
}