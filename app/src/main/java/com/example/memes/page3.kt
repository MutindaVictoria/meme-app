package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    lateinit var btnprevious:Button
    lateinit var btnbutton3: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
          intent= Intent(this, meme2::class.java)
          startActivity(intent)
        }
        btnbutton3=findViewById(R.id.buttonpage3)
        btnbutton3.setOnClickListener {
            intent= Intent(this, page4::class.java)
            startActivity(intent)



        }
}}