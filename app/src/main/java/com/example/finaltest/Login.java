package com.example.finaltest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private static final String PREF_NAME = "MyPrefs";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredUsername = username.getText().toString();
                String enteredPassword = password.getText().toString();

                String savedUsername = sharedPreferences.getString(KEY_USERNAME, "admin");
                String savedPassword = sharedPreferences.getString(KEY_PASSWORD, "admin");

                if (enteredUsername.equals(savedUsername) && enteredPassword.equals(savedPassword)) {
                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                    //ActivityOptions.makeSceneTransitionAnimation(Login.this).toBundle()
                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    // Start the MainActivity or perform any other desired action
                    // Intent intent = new Intent(Login.this, MainActivity.class);
                    // startActivity(intent);
                } else {
                    // Incorrect credentials
                    Toast.makeText(Login.this, "Wrong Username or Password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
