package com.example.claimchapchap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.claimchapchap.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener {
    
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etName.onFocusChangeListener = this
        binding.etEmailAddress.onFocusChangeListener = this
        binding.etPhoneNumber.onFocusChangeListener = this
        binding.etPassword.onFocusChangeListener = this
        binding.etConfirmPassword.onFocusChangeListener = this

        val btnSignUp: Button = findViewById(R.id.btnSignUp)

    }

    private fun validateName(): Boolean{
        var errorMessage: String? = null
        val sName = binding.etName.text.toString()
        if (sName.isEmpty()){
            errorMessage = "UserName Is Required"
        }
        if (errorMessage!=null){
            binding.nameTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }
    private fun validateMail(): Boolean{
        var errorMessage: String? = null
        val mail = binding.etEmailAddress.text.toString()
        if (mail.isEmpty()){
            errorMessage = "Email Address Is Required"
        }else if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
            errorMessage = "Invalid Email Address"
        }
        if (errorMessage!=null){
            binding.emailTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }
        return errorMessage == null
    }

    private fun validatePhoneNumber(): Boolean{
        var errorMessage: String? = null
        val number = binding.etPhoneNumber.text.toString()
        if (number.isEmpty()){
            errorMessage = "Phone Number is Required"
        }else if (number.length < 10){
            errorMessage = "Phone Number is Too Short"
        }
        if (errorMessage!=null){
            binding.numberTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }
        return errorMessage == null
    }

    private fun validatePass(): Boolean{
        var errorMessage: String? = null
        val pass = binding.etPassword.text.toString()
        if (pass.isEmpty()){
            errorMessage = "Password Is Required"
        }else if (pass.length < 6){
            errorMessage = "Password Must Be 6 or More Characters"
        }
        if (errorMessage!=null){
            binding.passwordTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }
        return errorMessage == null
    }

    private fun validatecPass(): Boolean{
        var errorMessage: String? = null
        val cPass = binding.etConfirmPassword.text.toString()
        val pass = binding.etPassword.text.toString()
        if (cPass.isEmpty()){
            errorMessage = "Confirm Password is Required"
        }else if (cPass != pass){
            errorMessage = "Passwords Do Not Match"
        }
        if (errorMessage!=null){
            binding.cPasswordTil.apply {
                isErrorEnabled = true
                error = errorMessage
            }
        }
        return errorMessage == null
    }


    override fun onClick(view: View?) {
        TODO("Not yet implemented")
    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if (view!=null){
            when (view.id){
                R.id.etName -> {
                    if (hasFocus){
                        if (binding.nameTil.isCounterEnabled){
                            binding.nameTil.isErrorEnabled = false
                        }
                    }else{
                        validateName()
                    }
                }
                R.id.etEmailAddress -> {
                    if (hasFocus){
                        if (binding.emailTil.isCounterEnabled){
                            binding.emailTil.isErrorEnabled = false
                        }
                    }else{
                        validateMail()
                    }
                }
                R.id.etPhoneNumber -> {
                    if (hasFocus){
                        if (binding.numberTil.isCounterEnabled){
                            binding.numberTil.isErrorEnabled = false
                        }
                    }else{
                        validatePhoneNumber()
                    }
                }
                R.id.etPassword -> {
                    if (hasFocus){
                        if (binding.passwordTil.isCounterEnabled){
                            binding.passwordTil.isErrorEnabled = false
                        }
                    }else{
                        validatePass()
                    }
                }
                R.id.etConfirmPassword -> {
                    if (hasFocus){
                        if (binding.cPasswordTil.isCounterEnabled){
                            binding.cPasswordTil.isErrorEnabled = false
                        }
                    }else{
                        validatecPass()
                    }
                }
            }
        }
    }

    override fun onKey(view: View?, keyCode: Int, event: KeyEvent?): Boolean {
        TODO("Not yet implemented")
    }
}