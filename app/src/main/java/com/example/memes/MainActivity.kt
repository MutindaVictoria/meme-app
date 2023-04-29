package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnbutton1:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbutton1=findViewById(R.id.btnbutton1)
        btnbutton1.setOnClickListener {
            val intent=Intent(this, meme2::class.java)
            startActivity(intent)
        }
    }
}