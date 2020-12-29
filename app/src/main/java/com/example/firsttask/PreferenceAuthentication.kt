package com.example.firsttask

import android.content.Context
import android.content.SharedPreferences

class PreferenceAuthentication private constructor(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("com.example.firsttask", Context.MODE_PRIVATE)
    private val USER_PASS = "USER_PASS"
    private val USER_NAME = "USER_NAME"
    private val USER_EMAIL = "USER_EMAIL"

    fun saveToken(name: String, email: String?, pass: String?) {
        sharedPreferences.edit().putString(USER_NAME, name).apply()
        sharedPreferences.edit().putString(USER_EMAIL, email).apply()
        sharedPreferences.edit().putString(USER_PASS, pass).apply()
    }

    val name: String?
        get() = sharedPreferences.getString(USER_NAME, "empty")
    val email: String?
        get() = sharedPreferences.getString(USER_EMAIL, "empty")
    val pass: String?
        get() = sharedPreferences.getString(USER_PASS, "empty")

    companion object {
        private var INSTANCE: PreferenceAuthentication? = null
        fun getInstance(context: Context): PreferenceAuthentication? {
            if (INSTANCE == null) {
                synchronized(PreferenceAuthentication::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE =
                            PreferenceAuthentication(context)
                    }
                }
            }
            return INSTANCE
        }
    }

}
