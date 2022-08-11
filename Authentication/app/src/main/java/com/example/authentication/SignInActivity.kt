package com.example.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_in.emailEditText
import kotlinx.android.synthetic.main.activity_sign_in.passwordEditText
import kotlinx.android.synthetic.main.activity_sign_in.progressBar
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignInActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    init()
    }

    private fun init()
    {
        auth = Firebase.auth

        signInButton.setOnClickListener{
            signIn()
        }
    }



    private fun signIn()
    {
        val email:String=emailEditText.text.toString()
        val password:String=passwordEditText.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty())
        {
            progressBar.visibility= View.VISIBLE
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    progressBar.visibility= View.GONE
                    if (task.isSuccessful) {
                       d("sign in", "signInWithEmail:success")
                        val user = auth.currentUser
                        Toast.makeText(baseContext, "Authentication is Success!", Toast.LENGTH_SHORT).show()

                    } else {
                        d("sign in", "signInWithEmail:failure", task.exception)
                        Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
                    }

                }
        }
        else
            Toast.makeText(this, "one or more filds are empty", Toast.LENGTH_SHORT).show()


    }

}