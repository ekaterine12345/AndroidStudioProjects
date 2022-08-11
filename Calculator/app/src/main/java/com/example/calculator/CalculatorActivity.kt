package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity(),View.OnClickListener {

    private var variable1=0.0
    private var variable2=0.0
    private var operation=""
    private var c=""
    private var k=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        init()
    }


    private fun init()
    {
    button0.setOnClickListener(this)
    button1.setOnClickListener(this)
    button2.setOnClickListener(this)
    button3.setOnClickListener(this)
    button4.setOnClickListener(this)
    button5.setOnClickListener(this)
    button6.setOnClickListener(this)
    button7.setOnClickListener(this)
    button8.setOnClickListener(this)
    button9.setOnClickListener(this)
    buttonDot.setOnClickListener(this)
    deleteButton.setOnLongClickListener {
        resultTextView.text=""
        true
    }

    }
    fun equal (view: View)
    {
        val value=resultTextView.text.toString()
        if (value.isNotEmpty())
        {
            variable2=value.toDouble()
            calculate()
        }
    }

    private fun calculate()
    {
    if (operation==":" && variable2==0.0) {
        resultTextView.text=""
        Toast.makeText(this,"divided by zero is not available",Toast.LENGTH_SHORT).show()
    }
        else
    {
        var ans=0.0
        if (operation==":") ans=variable1/variable2
        else
        if (operation=="*") ans=variable1*variable2
        else
        if (operation=="+") ans=variable1+variable2
        else
        if (operation=="-") ans=variable1-variable2

        resultTextView.text=ans.toString()
    }

    }

    fun plus (view: View)
    {
        val value=resultTextView.text.toString()
        if (value.isNotEmpty()){
            variable1=value.toDouble()
            operation="+"
            resultTextView.text=""
        }
    }

    fun minus (view: View)
    {
        val value=resultTextView.text.toString()
        if (value.isNotEmpty()) {
            variable1=value.toDouble()
            operation="-"
            resultTextView.text=""
        }
    }

    fun product (view: View)
    {
        val value=resultTextView.text.toString()
        if (value.isNotEmpty()) {
            variable1=value.toDouble()
            operation="*"
            resultTextView.text=""
        }
    }


    fun divide (view: View)
    {
        val value=resultTextView.text.toString()
        if (value.isNotEmpty())
        {
            variable1=value.toDouble()
            operation=":"
            resultTextView.text=""
        }
    }


    fun delete(view: View)
    {
        val value=resultTextView.text.toString()
     if (value.isNotEmpty())  resultTextView.text=value.substring(0,value.length-1)
    }

    override fun onClick(v: View?) {
        val button=v as Button
        c=button.text.toString()
        val value=resultTextView.text.toString()


        if (c!=".")  resultTextView.text=value+c
        else
        if (value.isNotEmpty())
        {
            k=true
            for (cr in value) {
                if (cr=='.') k=false
            }

            if (k) resultTextView.text=value+c
        }

    }
}