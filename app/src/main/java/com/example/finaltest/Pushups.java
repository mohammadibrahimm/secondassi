package com.example.finaltest;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Pushups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushups);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}