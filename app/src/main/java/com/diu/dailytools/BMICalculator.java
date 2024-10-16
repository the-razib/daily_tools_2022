package com.diu.dailytools;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class BMICalculator extends AppCompatActivity {
    EditText inputKG ,inputMeter;
    TextView resultShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        inputKG = findViewById(R.id.InputKGID);
        inputMeter = findViewById(R.id.InputMeterID);
        resultShow = findViewById(R.id.ResultShowID);


    }

    public void Calculation(View view) {
        String inputkg=inputKG.getText().toString();
        String inputmeter=inputMeter.getText().toString();

        if (inputkg.isEmpty()){

            inputKG.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Your Weight",Toast.LENGTH_LONG).show();
        }
        else if (inputmeter.isEmpty()){
            inputMeter.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Your Height",Toast.LENGTH_LONG).show();
        }

        else {
            Double kg,meter,result;
            kg =Double.parseDouble(inputKG.getText().toString());
            meter = Double.parseDouble(inputMeter.getText().toString());
            result= kg/(2*meter);
            if (result<=18.5)
            {
                DecimalFormat showAnswer =new DecimalFormat("Underweight \n Your BMI is: #.## ");
                resultShow.setText(showAnswer.format(result));
            }
            else if (result>=18.5 && result<=24.9)
            {
                DecimalFormat showAnswer =new DecimalFormat("Normal weight \n Your BMI is: #.## ");
                resultShow.setText(showAnswer.format(result));
            }
            else if (result>=25 && result<=29.9)
            {
                DecimalFormat showAnswer =new DecimalFormat("Over Weight \n Your BMI is: #.## ");
                resultShow.setText(showAnswer.format(result));
            }
            else if (result>=30 && result<=34.9)
            {
                DecimalFormat showAnswer =new DecimalFormat("Obesity Class I \n Your BMI is: #.## ");
                resultShow.setText(showAnswer.format(result));
            }
            else if (result>=35 && result<=39.9)
            {
                DecimalFormat showAnswer =new DecimalFormat("Obesity Class II \n Your BMI is: #.## ");
                resultShow.setText(showAnswer.format(result));
            }
            else if (result>=40 )
            {
                DecimalFormat showAnswer =new DecimalFormat("Obesity Class III  \n Your BMI is: #.## ");
                resultShow.setText(showAnswer.format(result));
            }
        }
        }



    public void BMiCalculation(View view) {
        String inputkg=inputKG.getText().toString();
        if (inputkg.isEmpty()){

            inputKG.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Your Weight",Toast.LENGTH_LONG).show();
        }
        else{
            Double kg,meter,result;
            kg =Double.parseDouble(inputKG.getText().toString());
            result = kg*2.20462;
//        resultShow.setText(""+kg+" Kg To Pound is "+result );
            DecimalFormat showAnswer =new DecimalFormat("Your weight is: #.## Pound");
            resultShow.setText(showAnswer.format(result));
        }


    }
}