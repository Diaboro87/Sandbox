package com.example.ryo.sandbox

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ryo.sandbox.ConstField.RESULT_SUBACTIVITY

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.login)
        button.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)

            val editText: EditText = findViewById(R.id.id_view)
            val id: String = editText.text.toString()
            intent.putExtra("ID", id)

            val editText2: EditText = findViewById(R.id.pw_view)
            val pw: String = editText2.text.toString()
            intent.putExtra("PW", pw)

            startActivityForResult(intent,RESULT_SUBACTIVITY)
        }
    }
}
