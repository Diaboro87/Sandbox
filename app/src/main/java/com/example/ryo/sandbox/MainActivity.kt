package com.example.ryo.sandbox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.login) as Button
        button.setOnClickListener { view ->
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
    }
}
