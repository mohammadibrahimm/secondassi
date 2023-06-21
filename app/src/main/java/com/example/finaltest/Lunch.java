package com.example.finaltest;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lunch extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView=(TextView) findViewById(R.id.lunch_meal_one);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
