package com.diu.dailytools;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Calculators extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculators);
    }

    public void CurrencyConverterFunction(View view) {
        Intent myIntent = new Intent(this,CurrencyConverter.class);
        startActivity(myIntent);
    }

    public void scientificCalculatorFunction(View view) {
        Intent myIntent = new Intent(this,ScientificCalculator.class);
        startActivity(myIntent);
    }

    public void BMICalculator(View view) {
        Intent myIntent = new Intent(this,BMICalculator.class);
        startActivity(myIntent);
    }

    public void DiscountCalculatorFunction(View view) {
        Intent myIntent = new Intent(this,discountCalculator.class);
        startActivity(myIntent);
    }

    public void VatCalculatorFunction(View view) {
        Intent myIntent = new Intent(this,VATCalculator.class);
        startActivity(myIntent);
    }
}