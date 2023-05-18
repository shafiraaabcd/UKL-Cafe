package com.example.ukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pass = findViewById<EditText>(R.id.password)
       val email = findViewById<EditText>(R.id.email)
        val btnLoginActivity = findViewById<Button>(R.id.btnLogin)

        btnLoginActivity.setOnClickListener {
            val strEmail = email.text.toString()
            val passs = pass.text.toString()
            if (strEmail.isNotBlank() && passs.isNotBlank()) {
                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("email", strEmail)
                startActivity(intent)
            }
        }


      }
    }




