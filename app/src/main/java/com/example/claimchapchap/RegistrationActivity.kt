package com.example.claimchapchap

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.claimchapchap.api.RetrofitClient
import com.example.claimchapchap.databinding.ActivityRegistrationBinding
import com.example.claimchapchap.models.DefaultResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.firstName.onFocusChangeListener = this
//        binding.secondName.onFocusChangeListener = this
//        binding.etEmailAddress.onFocusChangeListener = this
//        binding.etPhoneNumber.onFocusChangeListener = this
//        binding.etPassword.onFocusChangeListener = this
//        binding.etConfirmPassword.onFocusChangeListener = this


        val btnSignUp: Button = findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {

            val firstName = binding.firstName.text.toString()
            val secondName = binding.secondName.text.toString()
            val email = binding.etEmailAddress.text.toString()
            val phoneNumber = binding.etPhoneNumber.text.toString()
            val password = binding.etPassword.text.toString()
            val cPassword = binding.etConfirmPassword.text.toString()

            if (firstName.isEmpty() || secondName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty() || cPassword.isEmpty()) {
                Toast.makeText(applicationContext, "Missing Fields", Toast.LENGTH_SHORT).show()
            } else if (password != cPassword) {
                Toast.makeText(applicationContext, "Passwords Do Not Match", Toast.LENGTH_SHORT)
                    .show()
            } else {

                RetrofitClient.instance.createUser(firstName, secondName, email, phoneNumber, password, cPassword)
                    .enqueue(object : Callback<DefaultResponse> {
                        override fun onResponse(
                            call: Call<DefaultResponse>,
                            response: Response<DefaultResponse>
                        ) {
                            Toast.makeText(
                                applicationContext,
                                response.body()?.message,
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                        override fun onFailure(call: Call<DefaultResponse>, t: Throwable) {
                            Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
                        }

                    })
                
                startActivity(Intent(this@RegistrationActivity, MainActivity::class.java))
            }

        }
    }
}


//    override fun onFocusChange(view: View?, hasFocus: Boolean) {
//        if (view!=null){
//            when (view.id){
//                R.id.firstName -> {
//                    if (hasFocus){
//                        if (binding.firstNameTil.isCounterEnabled){
//                            binding.firstNameTil.isErrorEnabled = false
//                        }
//                    }else{
//                        validateFirstName()
//                    }
//                }
//                R.id.secondName -> {
//                    if (hasFocus){
//                        if (binding.secondNameTil.isCounterEnabled){
//                            binding.secondNameTil.isErrorEnabled = false
//                        }
//                    }else{
//                        validateSecondName()
//                    }
//                }
//                R.id.etEmailAddress -> {
//                    if (hasFocus){
//                        if (binding.emailTil.isCounterEnabled){
//                            binding.emailTil.isErrorEnabled = false
//                        }
//                    }else{
//                        validateMail()
//                    }
//                }
//                R.id.etPhoneNumber -> {
//                    if (hasFocus){
//                        if (binding.numberTil.isCounterEnabled){
//                            binding.numberTil.isErrorEnabled = false
//                        }
//                    }else{
//                        validatePhoneNumber()
//                    }
//                }
//                R.id.etPassword -> {
//                    if (hasFocus){
//                        if (binding.passwordTil.isCounterEnabled){
//                            binding.passwordTil.isErrorEnabled = false
//                        }
//                    }else{
//                        validatePass()
//                    }
//                }
//                R.id.etConfirmPassword -> {
//                    if (hasFocus){
//                        if (binding.cPasswordTil.isCounterEnabled){
//                            binding.cPasswordTil.isErrorEnabled = false
//                        }
//                    }else{
//                        validatecPass()
//                    }
//                }
//            }
//        }
//    }

//    override fun onKey(view: View?, keyCode: Int, event: KeyEvent?): Boolean {
//        TODO("Not yet implemented")
//    }
