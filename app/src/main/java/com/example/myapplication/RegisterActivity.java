package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
AppCompatButton b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
 b3=(AppCompatButton) findViewById(R.id.blog);
 b3.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent i=new Intent(getApplicationContext(),MainActivity.class);
         startActivity(i);
     }
 });

    }
}