package com.example.firsttask

import android.os.Bundle
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
            email = editTextTextEmailAddress.text.toString()
            pass = editTextTextPassword.text.toString()
            nickname = editTextTextPersonName.text.toString()

//            val fileText: String = applicationContext.assets.open("db.txt").bufferedReader().use {
//                it.readText()
//            }
//            println(fileText)
//
//            applicationContext.assets.open("db.txt")

//            WriteInDB("$email $nickname $pass")
//            val text = "$email $nickname $pass"


//            val myfile = File(fileName)
//
//            myfile.printWriter().use { out ->
//                out.println("First line")
//                out.println("Second line")
//            }
//
//            File("db.txt").printWriter().use { out ->
//                out.println("$email $nickname $pass")
//            }

//            File("C:\\Users\\User\\Desktop\\Android_ITIS\\FirstTask\\app\\src\\main\\res\\DB.txt")
//                .writeText("$email $nickname $pass")

//            val path = filesDir
//            val letDirectory = File(path, "LET")
//            letDirectory.mkdirs()
//            val file = File(letDirectory, "db.txt")
//            file.appendText(email)

            // val inputAsString = FileInputStream(file).bufferedReader().use { it.readText() }
        }
    }

//    fun WriteInDB(str: String) {
//        try {
//            val fileName = FileWriter("db.txt")
//            fileName.write(str)
//            fileName.close()
//        } catch (ex: Exception) {
//            print(ex.message)
//        }
//    }
}