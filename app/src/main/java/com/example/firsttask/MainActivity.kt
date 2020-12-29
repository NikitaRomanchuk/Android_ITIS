package com.example.firsttask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView1.setOnClickListener {
            imageView1.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent))
        }

        LessonFragment.newInstance("1", "2").also {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, it, "TAG")
                .commit()
        }
    }
}


