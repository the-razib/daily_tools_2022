package com.diu.dailytools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CounterFragment extends Fragment {

     static final String TAG = "CounterFragment";

     TextView counterTextView;
     int counter = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);

        counterTextView = view.findViewById(R.id.counterTextView);
        counterTextView.setText(String.valueOf(counter));

        view.findViewById(R.id.plusButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        view.findViewById(R.id.minusButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                counterTextView.setText(String.valueOf(counter));
            }
        });

        return view;
    }}