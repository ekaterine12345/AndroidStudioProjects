package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_random_number_layout.*

var listenerCount:Int=1;

class ChangeAvatarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number_layout)
       init()
    }

    private fun init ()
    {
        changeAvatarButton.setOnClickListener{
            d("button","button is active!")
          //  randomNumberTextView.text="I am active"
            listenerCount++;
            if (listenerCount>3) listenerCount=1;
            randomNumberGenerator()

        }
    }


    private fun randomNumberGenerator()
    {

        if (listenerCount==1) avaterImage.setImageResource(R.mipmap.ic_background);
        else
        if (listenerCount==2) avaterImage.setImageResource(R.mipmap.ic_background2)
        else
            avaterImage.setImageResource(R.mipmap.ic_background3)

    }

}