package com.example.birhdaygreetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName : TextInputEditText =findViewById(R.id.inputName)
        val inputLayout : TextInputLayout=findViewById(R.id.name_layout)
        val createButton : Button =findViewById(R.id.createButton)
        createButton.setOnClickListener{
            if (inputName.text.toString().isEmpty()) {
                inputLayout.error="Please enter name"
                return@setOnClickListener
            }
            val name=inputName.text.toString()
            val intent = Intent(this,BirthdayGreetingActivity :: class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
            startActivity(intent)
        }

    }
}