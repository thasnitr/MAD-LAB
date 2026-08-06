package com.example.sharedpreference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    EditText name, mail, mob, password, confpassword;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.edit1);
        mob = findViewById(R.id.edit2);
        mail = findViewById(R.id.edit3);
        password = findViewById(R.id.edit4);
        confpassword = findViewById(R.id.edit5);
        submit = findViewById(R.id.btn1);

        sharedPreferences = getSharedPreferences("userDetails", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Username = name.getText().toString().trim();
                String Mobile = mob.getText().toString().trim();
                String Email = mail.getText().toString().trim();
                String Password = password.getText().toString().trim();
                String ConfirmPassword = confpassword.getText().toString().trim();

                if (Username.isEmpty()) {
                    name.setError("Username is Empty");
                    name.requestFocus();
                    return;
                }

                if (Mobile.isEmpty()) {
                    mob.setError("Mobile number is Empty");
                    mob.requestFocus();
                    return;
                }

                if (Email.isEmpty()) {
                    mail.setError("Enter Email");
                    mail.requestFocus();
                    return;
                }

                if (Password.length() < 6) {
                    password.setError("Password must contain at least 6 characters");
                    password.requestFocus();
                    return;
                }

                if (!Password.equals(ConfirmPassword)) {
                    confpassword.setError("Password not matched");
                    confpassword.requestFocus();
                    return;
                }

                editor.putString("Keyusername", Username);
                editor.putString("Keymobile", Mobile);
                editor.putString("Keyemail", Email);
                editor.putString("Keypassword", Password);
                editor.apply();

                Toast.makeText(MainActivity.this,
                        "Registration Successful",
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("Username", Username);
                intent.putExtra("Email", Email);
                intent.putExtra("Phone", Mobile);
                intent.putExtra("Password", Password);

                startActivity(intent);
            }
        });
    }
}