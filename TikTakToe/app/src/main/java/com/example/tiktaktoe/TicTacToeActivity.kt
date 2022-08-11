package com.example.tiktaktoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tic_tac_toe.*

class TicTacToeActivity : AppCompatActivity() {
    private var firstPlayer=true
    private var gameIsOver=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)
        
    init()
    }

    private fun init()
    {
        button00.setOnClickListener{
            changeButton(button00)
        }

        button01.setOnClickListener{
            changeButton(button01)
        }

        button02.setOnClickListener{
            changeButton(button02)
        }

        button10.setOnClickListener{
            changeButton(button10)
        }

        button11.setOnClickListener{
            changeButton(button11)
        }

        button12.setOnClickListener{
            changeButton(button12)
        }

        button20.setOnClickListener{
            changeButton(button20)
        }

        button21.setOnClickListener{
            changeButton(button21)
        }

        button22.setOnClickListener{
            changeButton(button22)
        }

        playAgainButton.setOnClickListener{
            firstPlayer=true
            gameIsOver=false
            resetButton(button00)
            resetButton(button01)
            resetButton(button02)

            resetButton(button10)
            resetButton(button11)
            resetButton(button12)

            resetButton(button20)
            resetButton(button21)
            resetButton(button22)

        }

    }


    private fun resetButton(button: Button)
    {
        button.isClickable=true
        button.text=""
    }


    private fun changeButton(button: Button)
    {
        if (firstPlayer) { button.text="X" }
        else
        {
            button.text="O"
        }

        button.isClickable=false
        firstPlayer=!firstPlayer
        checkWinner()
    }


    private fun checkWinner()
    {
         if (button00.text.isNotEmpty() && button00.text.toString()==button01.text.toString() && button00.text.toString()==button02.text.toString() )
             {
               gameIsOver=true
                 Toast.makeText(this,"Winner is ${button00.text.toString()}",Toast.LENGTH_SHORT).show()
             }
        else
         if (button10.text.isNotEmpty() && button10.text.toString()==button11.text.toString() && button10.text.toString()==button12.text.toString() )
            {
                gameIsOver=true
                Toast.makeText(this,"Winner is ${button10.text.toString()}",Toast.LENGTH_SHORT).show()
            }
        else
         if (button20.text.isNotEmpty() && button20.text.toString()==button21.text.toString() && button20.text.toString()==button22.text.toString() )
             {
                 gameIsOver=true
                 Toast.makeText(this,"Winner is ${button20.text.toString()}",Toast.LENGTH_SHORT).show()
             }
        else
         if (button00.text.isNotEmpty() && button00.text.toString()==button10.text.toString() && button00.text.toString()==button20.text.toString() )
            {
                gameIsOver=true
                Toast.makeText(this,"Winner is ${button00.text.toString()}",Toast.LENGTH_SHORT).show()
            }
        else
         if (button01.text.isNotEmpty() && button01.text.toString()==button11.text.toString() && button01.text.toString()==button21.text.toString() )
             {
                 gameIsOver=true
                 Toast.makeText(this,"Winner is ${button01.text.toString()}",Toast.LENGTH_SHORT).show()
             }
        else
         if (button02.text.isNotEmpty() && button02.text.toString()==button12.text.toString() && button02.text.toString()==button22.text.toString() )
             {
                 gameIsOver=true
                 Toast.makeText(this,"Winner is ${button02.text.toString()}",Toast.LENGTH_SHORT).show()
             }
         else
           if (button00.text.isNotEmpty() && button00.text.toString()==button11.text.toString() && button00.text.toString()==button22.text.toString() )
           {
               gameIsOver=true
               Toast.makeText(this,"Winner is ${button00.text.toString()}",Toast.LENGTH_SHORT).show()
           }
         else
           if (button02.text.isNotEmpty() && button02.text.toString()==button11.text.toString() && button02.text.toString()==button20.text.toString() )
            {
                gameIsOver=true
                Toast.makeText(this,"Winner is ${button02.text.toString()}",Toast.LENGTH_SHORT).show()
            }
          else
             if (button00.text.isNotEmpty() && button01.text.isNotEmpty() && button02.text.isNotEmpty() &&
                 button10.text.isNotEmpty() && button11.text.isNotEmpty() && button12.text.isNotEmpty() &&
                 button20.text.isNotEmpty() && button21.text.isNotEmpty() && button22.text.isNotEmpty() )
             {
                 gameIsOver=true
                 Toast.makeText(this,"pre",Toast.LENGTH_SHORT).show()
             }

        if (gameIsOver)
        {
            button00.isClickable=false
            button01.isClickable=false
            button02.isClickable=false

            button10.isClickable=false
            button11.isClickable=false
            button12.isClickable=false

            button20.isClickable=false
            button21.isClickable=false
            button22.isClickable=false


        }


    }

}