package com.example.firsttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var nickname: EditText
    lateinit var btnEditNick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print(Child().age)

        val userName = PreferenceAuthentication.getInstance(this)?.name

        nickname.setText(userName)

        nickname = findViewById(R.id.nick)
        btnEditNick = findViewById(R.id.redprof)

        btnEditNick.setOnClickListener {
            nickname.text = nickname.text
        }
    }
}

