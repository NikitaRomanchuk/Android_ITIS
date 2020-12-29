package com.example.firsttask

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.registration.*


class Registration : AppCompatActivity() {

    private lateinit var nickname: String
    private lateinit var email: String
    private lateinit var pass: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration)

        button_entrance.setOnClickListener {
            email = editTextTextEmailAddress.text.toString().trim()
            pass = editTextTextPassword.text.toString().trim()
            nickname = editTextTextPersonName.text.toString().trim()

            PreferenceAuthentication.getInstance(this)?.saveToken(nickname, email, pass)

            Toast.makeText(applicationContext, "Done! You can log in", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Authentication::class.java)
            startActivity(intent)
            finish()
        }
    }
}