package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {
    Button Go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
      Go = findViewById(R.id.btn1) ;
      Go.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent Go = new Intent(ContactActivity.this,MainActivity.class);
              startActivity(Go);
          }
      });
    }
}