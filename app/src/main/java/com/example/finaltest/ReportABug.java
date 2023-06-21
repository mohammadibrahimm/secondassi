package com.example.finaltest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReportABug extends AppCompatActivity {
    TextView firstName,lastName,bug;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bugreport);
        firstName=findViewById(R.id.firstName);
        lastName=findViewById(R.id.lastName);
        send=findViewById(R.id.bugButton);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendAndClose();
            }
        });

    }

    //method to send bug and close the screen
    public void    sendAndClose(){
        Intent intent=new Intent(this, settingsFragment.class);

        Toast.makeText(this, "Bug Sent", Toast.LENGTH_SHORT).show();

        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }
}
