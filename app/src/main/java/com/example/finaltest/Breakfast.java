package com.example.finaltest;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Breakfast extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        //enabling the back button
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView=(TextView) findViewById(R.id.meal_one);
        //setting text as scrollable
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
