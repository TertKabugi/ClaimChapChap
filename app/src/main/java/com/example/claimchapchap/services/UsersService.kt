package com.example.claimchapchap.services

import com.example.claimchapchap.models.LoginResponsePayload
import com.squareup.moshi.Json
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

data class RegisterRequestPayload(
    @Json(name = "firstName")
    val firstName: String,
    @Json(name = "secondName")
    val secondName: String,
    @Json(name = "email")
    val email: String,
    @Json(name = "phoneNumber")
    val phoneNumber: String,
    @Json(name = "password")
    val password: String,
    @Json(name = "confirmPassword")
    val confirmPassword: String
)

data class LoginRequestPayload(
    @Json(name = "email")
    val email: String,
    @Json(name = "password")
    val password: String
)

data class LoginResponsePayload(
    @Json(name = "access_token")
    val access_token: String
)

interface UsersService {
    @Headers("Content-Type: application/json")
    @POST("user/login")
    fun login(@Body data: LoginRequestPayload): Call<LoginResponsePayload>

    @Headers("Content-Type: application/json")
    @POST("user/register")
    fun register(@Body data: RegisterRequestPayload): Call<LoginResponsePayload>

}