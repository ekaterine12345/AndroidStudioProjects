package com.example.profilepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   init()
    }


    private fun init()
    {
        signInButton.setOnClickListener{
            if (emailEditText.text.toString().isNotEmpty() && passwordEditText.text.toString().isNotEmpty())
            {
                val intent = Intent (this, ProfilePageActivity::class.java)
                startActivity(intent)
            }

        }
    }
}