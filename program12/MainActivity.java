package com.example.database;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail;
    Button btnInsert, btnSelect;
    TextView tvResult;
    DatabaseHelper dbHelper;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.txt1);
        etEmail = findViewById(R.id.txt2);
        btnInsert = findViewById(R.id.btn1);
        btnSelect = findViewById(R.id.btn2);
        tvResult = findViewById(R.id.txtview1);

        dbHelper = new DatabaseHelper(this);

        btnInsert.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(
                        this,
                        "Please enter name and email",
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            boolean inserted = dbHelper.insertData(name, email);

            if (inserted) {
                Toast.makeText(
                        this,
                        "Data inserted successfully",
                        Toast.LENGTH_SHORT
                ).show();

                etName.setText("");
                etEmail.setText("");
            } else {
                Toast.makeText(
                        this,
                        "Insertion failed",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        btnSelect.setOnClickListener(v -> {
            String data = dbHelper.getAllData();
            tvResult.setText(data);
        });
    }
}
