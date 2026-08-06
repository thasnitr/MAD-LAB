package com.example.sharedpreference;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView name, email, phone, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.Username);
        email = findViewById(R.id.Email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);

        String Username = getIntent().getStringExtra("Username");
        String Email = getIntent().getStringExtra("Email");
        String Phone = getIntent().getStringExtra("Phone");
        String Password = getIntent().getStringExtra("Password");

        name.setText("Username : " + Username);
        email.setText("Email : " + Email);
        phone.setText("Phone : " + Phone);
        password.setText("Password : " + Password);
    }
}