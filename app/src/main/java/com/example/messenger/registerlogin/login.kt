package com.example.messenger.registerlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.messenger.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login_button_login.setOnClickListener {
            val email=email_edittext_login.text.toString()
            val password=password_edittext_login.text.toString()
            Log.d("Login","Attempt login with email/pw: $email/***")
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password)

        }
        back_to_register_textview.setOnClickListener {
            finish()
        }
    }
}
