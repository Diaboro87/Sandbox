package com.example.ryo.sandbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class RestActivity extends AppCompatActivity {

    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);

        String url = "https://www.google.co.jp/search?q=httpとは";
        this.mQueue = Volley.newRequestQueue(this);

        this.mQueue.add(new StringRequest(Request.Method.GET,url,
                new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {
                        EditText textArea = findViewById(R.id.editText);
                        textArea.setText("SUCCESS:" + response.toString());
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        EditText textArea = findViewById(R.id.editText);
                        textArea.setText("ERROR:"+error.toString());
                    }
                })
        );

    }
}
