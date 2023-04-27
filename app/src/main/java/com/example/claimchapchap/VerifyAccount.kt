package com.example.claimchapchap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class VerifyAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_account)

        val next: Button = findViewById(R.id.next)
        next.setOnClickListener{
            startActivity(Intent(this@VerifyAccount, MainActivity::class.java))
        }
    }
}