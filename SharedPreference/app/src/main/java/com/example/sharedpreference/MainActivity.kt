package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreference:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init()
    {
        sharedPreference=getSharedPreferences("data",MODE_PRIVATE)

        val email=sharedPreference.getString("email","")
        val firstName=sharedPreference.getString("firstName","")
        val lastName=sharedPreference.getString("lastName","")
        val age=sharedPreference.getString("age","")
        val address=sharedPreference.getString("address","")

        emailET.setText(email)
        firstNameET.setText(firstName)
        lastNameET.setText(lastName)
        ageET.setText(age)
        addressET.setText(address)
    }

    fun save(view: View)
    {

        val email=emailET.text.toString()
        val firstName=firstNameET.text.toString()
        val lastName=lastNameET.text.toString()
        val age=ageET.text.toString()
        val address=addressET.text.toString()


        if (email.isNotEmpty() && firstName.isNotEmpty() && lastName.isNotEmpty() && age.isNotEmpty() && address.isNotEmpty())
        {
            val editor=sharedPreference.edit()
            editor.putString("email",email)
            editor.putString("firstName",firstName)
            editor.putString("lastName",lastName)
            editor.putString("age",age)
            editor.putString("address",address)

            editor.apply()
        }





    }
}