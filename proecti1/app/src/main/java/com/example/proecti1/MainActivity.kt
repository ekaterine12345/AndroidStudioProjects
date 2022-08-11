package com.example.proecti1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

var listenerCount:Int=0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
    }

    private fun init ()
    {
        changeAvatarButton.setOnClickListener{
            Log.d("button", "button is active!")
            //  randomNumberTextView.text="I am active"
            listenerCount++;
            if (listenerCount>3) listenerCount=1;
            randomNumberGenerator()

        }
    }


    private fun randomNumberGenerator()
    {

        if (listenerCount==1) avaterImage.setImageResource(R.mipmap.ic_background1);
        else
            if (listenerCount==2) avaterImage.setImageResource(R.mipmap.ic_background2)
            else
                avaterImage.setImageResource(R.mipmap.ic_background3)

    }
}