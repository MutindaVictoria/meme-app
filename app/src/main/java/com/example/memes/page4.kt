package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page4 : AppCompatActivity() {
    lateinit var btnbutton5:Button
    lateinit var btnbutton6:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
      btnbutton5=findViewById(R.id.btnbutton5)
      btnbutton5.setOnClickListener {
          intent= Intent(this, page3::class.java)
          startActivity(intent)
      }
        btnbutton6=findViewById(R.id.btnbutton6)
        btnbutton6.setOnClickListener {
            intent= Intent(this, Page5::class.java)
            startActivity(intent)

    }
}}