package com.example.firsttask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_authentication.*
import kotlinx.android.synthetic.main.activity_authentication.button_entrance
import kotlinx.android.synthetic.main.activity_authentication.editTextTextPassword
import kotlinx.android.synthetic.main.activity_authentication.editTextTextPersonName

class Authentication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        button_reg.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }

        button_entrance.setOnClickListener {
            val userName = PreferenceAuthentication.getInstance(this)?.name
            val userPass = PreferenceAuthentication.getInstance(this)?.pass
            val userEmail = PreferenceAuthentication.getInstance(this)?.email

            val login = editTextTextPersonName.toString().trim()
            val password = editTextTextPassword.toString().trim()

            if ((login == userName || login == userEmail) && (password == userPass)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
