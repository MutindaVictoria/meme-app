package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5 : AppCompatActivity() {
    lateinit var btnbutton:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        btnbutton=findViewById(R.id.btnbutton)
        btnbutton.setOnClickListener {
            intent= Intent(this,page4::class.java)
            startActivity(intent)
        }
    }
}