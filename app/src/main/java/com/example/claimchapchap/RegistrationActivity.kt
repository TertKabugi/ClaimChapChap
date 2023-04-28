package com.example.claimchapchap

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.claimchapchap.api.RetrofitClient
import com.example.claimchapchap.databinding.ActivityRegistrationBinding
import com.example.claimchapchap.models.LoginResponsePayload
import com.example.claimchapchap.services.RegisterRequestPayload
import retrofit2.Call
import retrofit2.Response

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnSignUp: Button = findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {

            val firstName = binding.firstName.text.toString()
            val secondName = binding.secondName.text.toString()
            val email = binding.etEmailAddress.text.toString()
            val phoneNumber = binding.etPhoneNumber.text.toString()
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()

            val requestData = RegisterRequestPayload(
                binding.firstName.text.toString(),
                binding.secondName.text.toString(),
                binding.etEmailAddress.text.toString(),
                binding.etPhoneNumber.text.toString(),
                binding.etPassword.text.toString(),
                binding.etConfirmPassword.text.toString()
            )

            if (firstName.isEmpty() || secondName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(applicationContext, "Missing Fields", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(applicationContext, "Passwords Do Not Match", Toast.LENGTH_SHORT)
                    .show()
            } else {
                RetrofitClient.authService.register(requestData)
                    .enqueue(object : retrofit2.Callback<LoginResponsePayload> {
                        override fun onResponse(
                            call: Call<LoginResponsePayload>,
                            response: Response<LoginResponsePayload>
                        ) {
                            Log.d("REQ", call.request().toString())
                            Log.d("RES", response.toString())

                            Toast.makeText(applicationContext,  "Success", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this@RegistrationActivity, VerifyAccount::class.java))
                        }

                        override fun onFailure(call: Call<LoginResponsePayload>, t: Throwable) {
                            Log.e("Failed: ", t.message.toString())
                        }

                    })
//                RetrofitClient.authService.register(requestData)
//                    .enqueue(object : retrofit2.Callback<LoginResponsePayload> {
//                        override fun onResponse(
//                            call: Call<LoginResponsePayload>,
//                            response: Response<LoginResponsePayload>
//                        ) {
//                            Toast.makeText(applicationContext,  "Success", Toast.LENGTH_SHORT).show()
//                            startActivity(Intent(this@RegistrationActivity, VerifyAccount::class.java))
//
//                        }
//                        override fun onFailure(call: Call<LoginResponsePayload>, t: Throwable) {
//                            Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
//                        }
//
//                    })
            }

        }
    }
}

