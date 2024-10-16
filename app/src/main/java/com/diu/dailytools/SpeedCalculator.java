package com.diu.dailytools;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class SpeedCalculator extends AppCompatActivity {
    EditText SpeedAmount;
    Spinner speedFromSpinner,speedToSpinner;
    TextView speedresultview;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_calculator);


        SpeedAmount=findViewById(R.id.EnterSpeedAmountID);
        speedFromSpinner=findViewById(R.id.SpeedFromSpinnerID);
        speedToSpinner=findViewById(R.id.SpeedToSpinnerID);
        speedresultview=findViewById(R.id.SpeedResultShowID);

        String[] from={"Meter/second","Kilometer/hour","kilometer/second","Mile/hour","Yard/hour"};
        ArrayAdapter aay= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        speedFromSpinner.setAdapter(aay);

        String[] to={"Meter/second","Kilometer/hour","kilometer/second","Mile/hour","Yard/hour"};
        ArrayAdapter aay2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        speedToSpinner.setAdapter(aay2);
    }

    public void SpeedCalculatorResult(View view) {
        String inpuiAmout=SpeedAmount.getText().toString();

        if (inpuiAmout.isEmpty()){

            SpeedAmount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Speed Amount",Toast.LENGTH_LONG).show();
        }
        else {
            Double Speed = Double.parseDouble(SpeedAmount.getText().toString());

            //Meter/second
            if (speedFromSpinner.getSelectedItem().toString() == "Meter/second" && speedToSpinner.getSelectedItem().toString() == "Meter/second") {
                result = Speed + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## Meter/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Meter/second" && speedToSpinner.getSelectedItem().toString() == "Kilometer/hour") {
                result = Speed * 3.6;

                DecimalFormat showAnswer = new DecimalFormat("#.## Kilometer/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Meter/second" && speedToSpinner.getSelectedItem().toString() == "kilometer/second") {
                result = Speed * 0.001;
                DecimalFormat showAnswer = new DecimalFormat("#.## kilometer/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Meter/second" && speedToSpinner.getSelectedItem().toString() == "Mile/hour") {
                result = Speed * 2.2369;
                DecimalFormat showAnswer = new DecimalFormat("#.## Mile/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Meter/second" && speedToSpinner.getSelectedItem().toString() == "Yard/hour") {
                result = Speed * 1.0936;
                DecimalFormat showAnswer = new DecimalFormat("#.## Yard/hour");
                speedresultview.setText(showAnswer.format(result));
            }

//Kilometer/hour
            if (speedFromSpinner.getSelectedItem().toString() == "Kilometer/hour" && speedToSpinner.getSelectedItem().toString() == "Meter/second") {
                result = Speed * 0.277778;
                DecimalFormat showAnswer = new DecimalFormat("#.## Meter/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Kilometer/hour" && speedToSpinner.getSelectedItem().toString() == "Kilometer/hour") {
                result = Speed + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## Kilometer/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Kilometer/hour" && speedToSpinner.getSelectedItem().toString() == "kilometer/second") {
                result = Speed * 3.6;
                DecimalFormat showAnswer = new DecimalFormat("#.## kilometer/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Kilometer/hour" && speedToSpinner.getSelectedItem().toString() == "Mile/hour") {
                result = Speed * 0.621371;
                DecimalFormat showAnswer = new DecimalFormat("#.## Mile/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Kilometer/hour" && speedToSpinner.getSelectedItem().toString() == "Yard/hour") {
                result = Speed * 1093.61;
                DecimalFormat showAnswer = new DecimalFormat("#.## Yard/hour");
                speedresultview.setText(showAnswer.format(result));
            }


//kilometer/second
            if (speedFromSpinner.getSelectedItem().toString() == "kilometer/second" && speedToSpinner.getSelectedItem().toString() == "Meter/second") {
                result = Speed * 0.62137119223733;
                DecimalFormat showAnswer = new DecimalFormat("#.## Meter/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "kilometer/second" && speedToSpinner.getSelectedItem().toString() == "Kilometer/hour") {
                result = Speed * 3600;
                DecimalFormat showAnswer = new DecimalFormat("#.## Kilometer/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "kilometer/second" && speedToSpinner.getSelectedItem().toString() == "kilometer/second") {
                result = Speed + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## kilometer/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "kilometer/second" && speedToSpinner.getSelectedItem().toString() == "Mile/hour") {
                result = Speed * 2236.94;
                DecimalFormat showAnswer = new DecimalFormat("#.## Mile/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "kilometer/second" && speedToSpinner.getSelectedItem().toString() == "Yard/hour") {
                result = Speed * 3937007.87;
                DecimalFormat showAnswer = new DecimalFormat("#.## Yard/hour");
                speedresultview.setText(showAnswer.format(result));
            }

//Mile/hour
            if (speedFromSpinner.getSelectedItem().toString() == "Mile/hour" && speedToSpinner.getSelectedItem().toString() == "Meter/second") {
                result = Speed * 1.60934;
                DecimalFormat showAnswer = new DecimalFormat("#.## Meter/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Mile/hour" && speedToSpinner.getSelectedItem().toString() == "Kilometer/hour") {
                result = Speed * 1.60934;
                DecimalFormat showAnswer = new DecimalFormat("#.## Kilometer/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Mile/hour" && speedToSpinner.getSelectedItem().toString() == "kilometer/second") {
                result = Speed * 0.00044704;
                DecimalFormat showAnswer = new DecimalFormat("#.## kilometer/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Mile/hour" && speedToSpinner.getSelectedItem().toString() == "Mile/hour") {
                result = Speed + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## Mile/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Mile/hour" && speedToSpinner.getSelectedItem().toString() == "Yard/hour") {
                result = Speed * 1760;
                DecimalFormat showAnswer = new DecimalFormat("#.## Yard/hour");
                speedresultview.setText(showAnswer.format(result));
            }

//Yard/hour
            if (speedFromSpinner.getSelectedItem().toString() == "Yard/hour" && speedToSpinner.getSelectedItem().toString() == "Meter/second") {
                result = Speed * 0.000254;
                DecimalFormat showAnswer = new DecimalFormat("#.## Meter/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Yard/hour" && speedToSpinner.getSelectedItem().toString() == "Kilometer/hour") {
                result = Speed * 0.0009144;
                DecimalFormat showAnswer = new DecimalFormat("#.## Kilometer/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Yard/hour" && speedToSpinner.getSelectedItem().toString() == "kilometer/second") {
                result = Speed * 2.7777777777778E-6;//Big size of data
                DecimalFormat showAnswer = new DecimalFormat("#.## kilometer/second");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Yard/hour" && speedToSpinner.getSelectedItem().toString() == "Mile/hour") {
                result = Speed * 0.00056818181818182;
                DecimalFormat showAnswer = new DecimalFormat("#.## Mile/hour");
                speedresultview.setText(showAnswer.format(result));
            } else if (speedFromSpinner.getSelectedItem().toString() == "Yard/hour" && speedToSpinner.getSelectedItem().toString() == "Yard/hour") {
                result = Speed + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## Yard/hour");
                speedresultview.setText(showAnswer.format(result));
            }
        }


    }
}