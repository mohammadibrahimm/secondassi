package com.example.finaltest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class settingsFragment extends Fragment {
    private Button reportBug;
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_settings,container,false);
        reportBug=(Button) view.findViewById(R.id.reportBug);
        reportBug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reportBugClicked();
            }
        });

        return view;
    }

    public void reportBugClicked(){
        Intent intent=new Intent(getActivity(),ReportABug.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());

        Toast.makeText(getActivity(), "Report A bug", Toast.LENGTH_SHORT).show();
    }
}
