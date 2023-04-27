package com.example.claimchapchap.api

import android.util.Base64
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object RetrofitClient {

    //private val AUTH = "Basic"+ Base64.encodeToString("username:qwerty".toByteArray(), Base64.NO_WRAP)
    private const val BASE_URL = "http://10.20.33.104:8080/api/v1/auth/register/"

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()


//    private val okHttpClient = OkHttpClient.Builder()
//        .addInterceptor{ chain ->
//            val original = chain.request()
//
//            val requestBuilder = original.newBuilder()
//                .addHeader("Authorization","").method(original.method(), original.body())
//
//            val request = requestBuilder.build()
//            chain.proceed(request)
//        }.build()


    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            //.client(okHttpClient)
            .build()

        retrofit.create(Api::class.java)
    }
}