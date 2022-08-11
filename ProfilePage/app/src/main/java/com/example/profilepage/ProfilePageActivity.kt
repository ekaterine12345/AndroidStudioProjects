package com.example.profilepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile_page.*

class ProfilePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)
        init()
    }

    private fun init()
    {
        Glide.with(this)
            .load("https://images.unsplash.com/photo-1531804055935-76f44d7c3621?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80")
            .placeholder(R.mipmap.ic_launcher).into(profileImageView)

        Glide.with(this)
            .load("https://image.shutterstock.com/image-photo/bright-spring-view-cameo-island-260nw-1048185397.jpg")
            .placeholder(R.mipmap.ic_launcher).into(coverImageView)

        doneButton.setOnClickListener{
            nameTextView.visibility= View.VISIBLE
            lastnameTextView.visibility= View.VISIBLE
            ageTextView.visibility= View.VISIBLE
            phoneTextView.visibility= View.VISIBLE
            genderTextView.visibility= View.VISIBLE
            bornTextView.visibility= View.VISIBLE


            nameEditText.isEnabled=false
            lastnameEditText.isEnabled=false
            ageEditText.isEnabled=false
            phoneEditText.isEnabled=false
            genderEditText.isEnabled=false
            bornEditText.isEnabled=false
        }

    }
}