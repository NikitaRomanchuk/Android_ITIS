package com.example.firsttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var nickname: EditText
    lateinit var btnEditNick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userName = PreferenceAuthentication.getInstance(this)?.name
        val nickname = nick.setText(userName)

        btnEditNick = findViewById(R.id.redprof)

        btnEditNick.setOnClickListener {
            nick.setText(nickname.toString())
        }
    }
}


