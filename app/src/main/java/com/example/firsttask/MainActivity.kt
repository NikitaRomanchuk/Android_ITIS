package com.example.firsttask

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileNotFoundException
import java.io.InputStream


class MainActivity : AppCompatActivity() {

//    lateinit var nickname: EditText
    lateinit var btnEditNick: Button
    private var pickImage = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userName = PreferenceAuthentication.getInstance(this)?.name
        val nickname = nick.setText(userName)

        btnEditNick = findViewById(R.id.redprof)

        btnEditNick.setOnClickListener {
            nick.setText(nickname.toString())
        }

        ava.setOnClickListener {
            val photoPickerIntent = Intent(Intent.ACTION_PICK)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, pickImage)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        when (requestCode) {
            pickImage -> if (resultCode === RESULT_OK) {9
                try {
                    val imageUri: Uri? = data?.data
                    val imageStream: InputStream? = imageUri?.let {
                        contentResolver.openInputStream(
                            it
                        )
                    }
                    val selectedImage = BitmapFactory.decodeStream(imageStream)
                    ava.setImageBitmap(selectedImage)
                    Toast.makeText(applicationContext, "Done!", Toast.LENGTH_SHORT).show()
                } catch (e: FileNotFoundException) {
                    e.printStackTrace()
                }
            }
        }
    }
}


