package com.diu.dailytools;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.RadioGroup;

public class Others extends AppCompatActivity {
     RadioGroup radioGroup;
     FragmentManager fragmentManager;
     CounterFragment counterFragment;
     StopwatchFragment stopwatchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        radioGroup = findViewById(R.id.radioGroup);
        fragmentManager = getSupportFragmentManager();

        counterFragment = new CounterFragment();
        stopwatchFragment = new StopwatchFragment();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.counterRadioButton:
                        showCounterFragment();
                        break;
                    case R.id.stopwatchRadioButton:
                        showStopwatchFragment();
                        break;
                }
            }
        });

        showCounterFragment();
    }

    private void showCounterFragment() {
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, counterFragment)
                .commit();
    }

    private void showStopwatchFragment() {
        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, stopwatchFragment)
                .commit();
    }
}
