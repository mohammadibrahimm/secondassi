package com.example.finaltest;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class dietFragment extends Fragment {
    private Button dinner, breakfast, lunch;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_diet, container, false);
        breakfast = (Button) view.findViewById(R.id.breakfast1);
        dinner = (Button) view.findViewById(R.id.dinner1);
        lunch= (Button) view.findViewById(R.id.lunch1);


        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                breakfastClicked();
            }


        });

        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lunchClicked();
            }


        });

        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dinnerClicked();
            }


        });

        return view;

    }

    public void breakfastClicked() {

        // Apply activity transition
        Intent intent = new Intent(getActivity(), Breakfast.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());
    }

    public void lunchClicked() {

        // Apply activity transition
        Intent intent = new Intent(getActivity(), Lunch.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());
    }


    public void dinnerClicked() {

        // Apply activity transition
        Intent intent = new Intent(getActivity(), Dinner.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());
    }
}
