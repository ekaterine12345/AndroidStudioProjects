package com.example.helloworld

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
      buttonTest.setOnClickListener{
          val intent =Intent (this, TestActivity::class.java)
          startActivity(intent)
      }

      buttonPNC.setOnClickListener{
          val intent =Intent (this, PrimeNumberCalculatorActivity::class.java)
          startActivity(intent)
      }

      buttonQE.setOnClickListener{
          val intent =Intent (this, QuadraticEquationActivity::class.java)
          startActivity(intent)
      }

     buttonGCD_LCM.setOnClickListener{
         val intent =Intent (this, GCD_LCMActivity::class.java)
         startActivity(intent)
     }


    }




}