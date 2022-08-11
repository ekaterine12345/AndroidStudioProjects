package com.example.informationexchanger

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var firstNameTV: TextView
    private lateinit var lastNameTV: TextView
    private lateinit var ageTV: TextView
    private lateinit var addressET:EditText
    private lateinit var returnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        init()
    }

    private fun init()
    {
        firstNameTV=findViewById(R.id.firstNameTextView)
        lastNameTV=findViewById(R.id.lastNameTextView)
        ageTV=findViewById(R.id.ageTextView)
        addressET=findViewById(R.id.addressEditText)
        returnButton=findViewById(R.id.returnAddressButton)

        val firstName= intent.extras?.getString("first_name","")
        val lastName= intent.extras?.getString("last_name","")
        val age=intent.extras?.getInt("age",0)

        firstNameTV.text=firstName
        lastNameTV.text=lastName
        ageTV.text=age.toString()

        returnButton.setOnClickListener{
            returnAddres()
        }
    }

    private fun returnAddres()
    {
        val intentOb=intent
        intentOb.putExtra("address",addressET.text.toString())
        setResult(Activity.RESULT_OK,intentOb)
        finish()

    }
}