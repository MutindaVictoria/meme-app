package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme2 : AppCompatActivity() {
    lateinit var btnbutton2:Button
    lateinit var btnbutton8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        btnbutton2=findViewById(R.id.btnbutton2)
        btnbutton2.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnbutton8=findViewById(R.id.btnbutton8)
        btnbutton8.setOnClickListener {
            intent=Intent(this, page3::class.java)
            startActivity(intent)
        }
    }
}