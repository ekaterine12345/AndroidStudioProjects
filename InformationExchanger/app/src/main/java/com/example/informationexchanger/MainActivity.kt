package com.example.informationexchanger

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var openSecondActivityButton:Button
    private lateinit var firstNameET:EditText
    private lateinit var lastNameET:EditText
    private lateinit var ageET:EditText
    private lateinit var addressTV: TextView
    private val requestCodeAddress=10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }


    private fun init()
    {
        openSecondActivityButton=findViewById(R.id.openSecondActivityButton)
        firstNameET=findViewById(R.id.firstNameEditText)
        lastNameET=findViewById(R.id.lastNameEditText)
        ageET=findViewById(R.id.ageEditText)
        addressTV=findViewById(R.id.addressTextView)
        openSecondActivityButton.setOnClickListener{
            openActivity()
        }
    }

    private fun openActivity()
    {
        val intent=Intent(this,SecondActivity::class.java)
        intent?.putExtra("first_name",firstNameET.text.toString())
        intent?.putExtra("last_name",lastNameET.text.toString())
        intent?.putExtra("age",ageET.text.toString().toInt())
        startActivityForResult(intent,requestCodeAddress)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode==requestCodeAddress && resultCode== Activity.RESULT_OK)
        {
            val address=data?.extras?.getString("address","")
            addressTextView.text=address
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

}