package com.example.claimchapchap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.claimchapchap.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(){

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val register: LinearLayout = findViewById(R.id.register)
        register.setOnClickListener{
            startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
        }

        val btnLogIn: Button = findViewById(R.id.btnLogIn)
        btnLogIn.setOnClickListener {
            val email = binding.etEmailAddress.text.toString()
            val password = binding.etPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(applicationContext, "Missing Fields", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this@LoginActivity, MainActivity::class.java))

//                RetrofitClient.instance.userLogin(email, password)
//                    .enqueue(object: Callback<LoginResponse>{
//                        override fun onResponse(
//                            call: Call<LoginResponse>,
//                            response: Response<LoginResponse>
//                        ) {
//                            if (response.body()?.error!!){
//                                SharedPrefManager.getInstance(applicationContext).saveUser(response.body()?.user!!)
//                                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
//                            }else{
//                                Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
//                            }
//                        }
//
//                        override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                            Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
//                        }
//
//                    })

            }

        }

    }

    override fun onStart() {
        super.onStart()

//        if(SharedPrefManager.getInstance(this).isLoggedIn){
//            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
//        }
    }
}