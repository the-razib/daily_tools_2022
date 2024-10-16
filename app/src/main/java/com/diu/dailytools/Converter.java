package com.diu.dailytools;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Converter extends AppCompatActivity {
    ListView listView;
    String[] items = {"Currency Converter", "Speed Converter", "Temperature Converter", "Angle Converter", "Time Converter"};
    Integer[] images = {R.drawable.currency,R.drawable.speed, R.drawable.temperature, R.drawable.angle, R.drawable.time};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        listView = findViewById(R.id.list);

        CustomAdapter customAdapter = new CustomAdapter(this, items, images);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    Intent intent = new Intent(Converter.this, CurrencyConverter.class);
                    startActivity(intent);
                }
                if(position == 1) {
                    Intent intent = new Intent(Converter.this, SpeedCalculator.class);
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(Converter.this, TemperatureCalculator.class);
                    startActivity(intent);
                }
                if(position == 3) {
                    Intent intent = new Intent(Converter.this, AngleCalculator.class);
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(Converter.this, TimeConverter.class);
                    startActivity(intent);
                }

            }
        });

    }

//    public void LengthCalculatorEnter(View view) {
//        Intent myIntent = new Intent(this,CurrencyConverter.class);
//        startActivity(myIntent);
//    }
//
//    public void SpeedCalculatorEnter(View view) {
//        Intent myIntent = new Intent(this,SpeedCalculator.class);
//        startActivity(myIntent);
//    }
//
//    public void TemperatureCalculatorEnter(View view) {
//        Intent myIntent = new Intent(this,TemperatureCalculator.class);
//        startActivity(myIntent);
//
//    }
//
//    public void AngleCalculatorEnter(View view) {
//        Intent myIntent = new Intent(this,AngleCalculator.class);
//        startActivity(myIntent);
//    }
//
//    public void NumberBaseCalculatorEnter(View view) {
//        Intent myIntent = new Intent(this,TimeConverter.class);
//        startActivity(myIntent);
//    }
}