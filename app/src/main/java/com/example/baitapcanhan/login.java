package com.example.baitapcanhan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        Button buttonlogin = findViewById(R.id.btn_login);
        buttonlogin.setOnClickListener(v -> {

            Intent intent = new Intent(login.this, MainActivity.class);
            startActivity(intent);
        });
    }
}