package com.diu.dailytools;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StopwatchFragment extends Fragment {

    private static final String TAG = "StopwatchFragment";

     TextView stopwatchTextView;
     long startTime = 0;
     Handler handler = new Handler();

     Runnable runnable = new Runnable() {
        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;

            stopwatchTextView.setText(String.format("%d:%02d", minutes, seconds));
            handler.postDelayed(this, 500);
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stopwatch, container, false);

        stopwatchTextView = view.findViewById(R.id.stopwatchTextView);
        stopwatchTextView.setText("0:00");

        view.findViewById(R.id.startButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTime = System.currentTimeMillis();
                handler.postDelayed(runnable, 0);
            }
        });

        view.findViewById(R.id.stopButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
            }
        });

        return view;

    }}