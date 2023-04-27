package com.example.claimchapchap.storage

import android.annotation.SuppressLint
import android.content.Context
import com.example.claimchapchap.models.Users

class SharedPrefManager private constructor(private val mCtx: Context) {

    val isLoggedIn: Boolean
        get() {
            val sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getInt("id", -1) != -1
        }

    val user: Users
        get() {
            val sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
            return Users(
                sharedPreferences.getInt("id", -1),
                sharedPreferences.getString("firstName", null).toString(),
                sharedPreferences.getString("secondName", null).toString(),
                sharedPreferences.getString("email", null).toString(),
                sharedPreferences.getString("phoneNumber", null).toString(),
                sharedPreferences.getString("password", null).toString(),
                sharedPreferences.getString("confirmPassword", null).toString()

            )
        }


    fun saveUser(user: Users) {

        val sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putInt("id", user.id)
        editor.putString("firstName", user.firstName)
        editor.putString("secondName", user.secondName)
        editor.putString("email", user.email)
        editor.putString("phoneNumber", user.phoneNumber)
        editor.putString("password", user.password)
        editor.putString("confirmPassword", user.cPassword)

        editor.apply()

    }

    fun clear() {
        val sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    companion object {
        private val SHARED_PREF_NAME = "my_shared_preff"

        private var mInstance: SharedPrefManager? = null

        @Synchronized
        fun getInstance(mCtx: Context): SharedPrefManager {
            if (mInstance == null) {
                mInstance = SharedPrefManager(mCtx)
            }
            return mInstance as SharedPrefManager
        }
    }

}