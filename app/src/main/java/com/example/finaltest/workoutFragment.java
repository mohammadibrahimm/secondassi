package com.example.finaltest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class workoutFragment extends Fragment {
    private Button planks,lungs,pushups,squats,gultBridge;
    private View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflating the container and adding the views
        view= inflater.inflate(R.layout.fragment_workout,container,false);
        //initialization of buttons with proper ids
        planks= (Button) view.findViewById(R.id.planks);
        lungs= (Button) view.findViewById(R.id.lungs);
        pushups= (Button) view.findViewById(R.id.pushups);
        squats= (Button) view.findViewById(R.id.squat);
        gultBridge= (Button) view.findViewById(R.id.gultbridge);



        //button on click listeners for planks
        planks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlanksActivity();

            }
        });

        //button on click listeners for gult bridge
        gultBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGultbridgeActivity();


            }
        });

        //setting on click listeners for lungs
        lungs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLungsActivity();


            }
        });

        // button to open pushup workout
        pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPushupsActivity();
            }
        });

        // button to open squats workout
        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSquatsActivity();
            }
        });

        return view;

    }

//    method to open Plank Activity when pressed
    void openPlanksActivity(){
        // Apply activity transition
        Intent intent=new Intent(getActivity(),Planks.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());


    }
    // method to open Lungs Activity when pressed
    void openLungsActivity(){

        Intent intent=new Intent(getActivity(),lungs.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());

    }
    void openPushupsActivity(){
        Intent intent=new Intent(getActivity(),lungs.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());

    }

    void openSquatsActivity(){

        Intent intent=new Intent(getActivity(),Squats.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());

    }

    void openGultbridgeActivity(){

        Intent intent=new Intent(getActivity(),Gultbridge.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());

    }



}

