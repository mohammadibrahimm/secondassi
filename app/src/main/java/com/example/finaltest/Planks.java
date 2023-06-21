package com.example.finaltest;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Planks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_planks);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}