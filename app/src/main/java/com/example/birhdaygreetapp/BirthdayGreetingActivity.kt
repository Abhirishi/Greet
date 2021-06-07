package com.example.birhdaygreetapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val textView1 : TextView = findViewById(R.id.tv1)
        val name=intent.getStringExtra(NAME_EXTRA)
        textView1.text="Happy Birthday $name"
    }
}