package com.example.ryo.sandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.ryo.sandbox.ConstField.RESULT_SUBACTIVITY;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        // 大文字小文字を区別する
        String id = intent.getStringExtra("ID");
        String pw = intent.getStringExtra("PW");

        TextView idView = findViewById(R.id.res_id);
        idView.setText(id);

        TextView pwView = findViewById(R.id.res_pw);
        pwView.setText(pw);
    }
}
