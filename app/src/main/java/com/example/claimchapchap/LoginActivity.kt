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
import com.example.claimchapchap.databinding.ActivityLoginBinding
import com.example.claimchapchap.databinding.FragmentComprehensiveMainBinding
import org.intellij.lang.annotations.Pattern

class LoginActivity : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etEmailAddress.onFocusChangeListener = this
        binding.etPassword.onFocusChangeListener = this
    }

    private fun validateEmail(): Boolean{
        var errorMessage: String? = null
        val mail = binding.etEmailAddress.text.toString()
        if (mail.isEmpty()){
            errorMessage = "Email Address is Required"
        }else if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
            errorMessage = "Invalid Email Address"
        }

        if (errorMessage!=null){
            binding.emailTil.apply{
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    private fun validatePassword(): Boolean{
        var errorMessage: String? = null
        val pass = binding.etPassword.text.toString()
        if (pass.isEmpty()){
            errorMessage = "Password is Required"
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


    override fun onClick(view: View?) {
        TODO("Not yet implemented")
    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if (view!=null){
            when(view.id){
                R.id.etEmailAddress -> {
                    if (hasFocus){
                        if (binding.emailTil.isCounterEnabled){
                            binding.emailTil.isErrorEnabled = false
                        }
                    }else{
                        validateEmail()
                    }
                }
                R.id.etPassword -> {
                    if (hasFocus){
                        if (binding.passwordTil.isCounterEnabled){
                            binding.passwordTil.isErrorEnabled = false
                        }
                    }else{
                        validateEmail()
                    }
                }
            }
        }
    }

    override fun onKey(view: View?, keyCode: Int, event: KeyEvent?): Boolean {
        TODO("Not yet implemented")
    }
}