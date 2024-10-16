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

public class AngleCalculator extends AppCompatActivity {
    EditText AngleAmount;
    Spinner AngleFromSpinner,AngleToSpinner;
    TextView Angleresultview;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle_calculator);

        AngleAmount=findViewById(R.id.EnterAngleAmountID);
        AngleFromSpinner=findViewById(R.id.AngleFromSpinnerID);
        AngleToSpinner=findViewById(R.id.AngleToSpinnerID);
        Angleresultview=findViewById(R.id.AngleResultShowID);

        String[] from={"Degree [°]","Radian [rad]","Grad [g]","Circle [c]"};
        ArrayAdapter aay= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        AngleFromSpinner.setAdapter(aay);

        String[] to={"Degree [°]","Radian [rad]","Grad [g]","Circle [c]"};
        ArrayAdapter aay2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        AngleToSpinner.setAdapter(aay2);
    }

    public void AngleCalculatorResult(View view) {

        String inpuiAmout=AngleAmount.getText().toString();

        if (inpuiAmout.isEmpty()){

            AngleAmount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Angle ",Toast.LENGTH_LONG).show();
        }
        else {
            Double Angle = Double.parseDouble(AngleAmount.getText().toString());

            //Degree [°]
            if (AngleFromSpinner.getSelectedItem().toString() == "Degree [°]" && AngleToSpinner.getSelectedItem().toString() == "Degree [°]") {
                result = Angle + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## °");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Degree [°]" && AngleToSpinner.getSelectedItem().toString() == "Radian [rad]") {
                result = Angle * 0.0174533;
                DecimalFormat showAnswer = new DecimalFormat("#.## rad");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Degree [°]" && AngleToSpinner.getSelectedItem().toString() == "Grad [g]") {
                result = Angle * 1.111111;
                DecimalFormat showAnswer = new DecimalFormat("#.## g");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Degree [°]" && AngleToSpinner.getSelectedItem().toString() == "Circle [c]") {
                result = Angle * 0.00277778;
                DecimalFormat showAnswer = new DecimalFormat("#.## c");
                Angleresultview.setText(showAnswer.format(result));
            }

            //Radian [rad]
            if (AngleFromSpinner.getSelectedItem().toString() == "Radian [rad]" && AngleToSpinner.getSelectedItem().toString() == "Degree [°]") {
                result = Angle * 57.29578;
                DecimalFormat showAnswer = new DecimalFormat("#.## °");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Radian [rad]" && AngleToSpinner.getSelectedItem().toString() == "Radian [rad]") {
                result = Angle + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## rad");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Radian [rad]" && AngleToSpinner.getSelectedItem().toString() == "Grad [g]") {
                result = Angle * 63.661977;
                DecimalFormat showAnswer = new DecimalFormat("#.## g");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Radian [rad]" && AngleToSpinner.getSelectedItem().toString() == "Circle [c]") {
                result = Angle * 1.15957;
                DecimalFormat showAnswer = new DecimalFormat("#.## c");
                Angleresultview.setText(showAnswer.format(result));
            }

//Radian [rad]
            if (AngleFromSpinner.getSelectedItem().toString() == "Grad [g]" && AngleToSpinner.getSelectedItem().toString() == "Degree [°]") {
                result = Angle * 0.900;
                DecimalFormat showAnswer = new DecimalFormat("#.## °");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Grad [g]" && AngleToSpinner.getSelectedItem().toString() == "Radian [rad]") {
                result = Angle + 0.016;
                DecimalFormat showAnswer = new DecimalFormat("#.## rad");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Grad [g]" && AngleToSpinner.getSelectedItem().toString() == "Grad [g]") {
                result = Angle + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## g");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Grad [g]" && AngleToSpinner.getSelectedItem().toString() == "Circle [c]") {
                result = Angle * 0.002;
                DecimalFormat showAnswer = new DecimalFormat("#.## c");
                Angleresultview.setText(showAnswer.format(result));
            }

//Circle [c]
            if (AngleFromSpinner.getSelectedItem().toString() == "Circle [c]" && AngleToSpinner.getSelectedItem().toString() == "Degree [°]") {
                result = Angle * 360;
                DecimalFormat showAnswer = new DecimalFormat("#.## °");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Circle [c]" && AngleToSpinner.getSelectedItem().toString() == "Radian [rad]") {
                result = Angle * 6.283;
                DecimalFormat showAnswer = new DecimalFormat("#.## rad");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Circle [c]" && AngleToSpinner.getSelectedItem().toString() == "Grad [g]") {
                result = Angle * 400.0;
                DecimalFormat showAnswer = new DecimalFormat("#.## g");
                Angleresultview.setText(showAnswer.format(result));
            } else if (AngleFromSpinner.getSelectedItem().toString() == "Circle [c]" && AngleToSpinner.getSelectedItem().toString() == "Circle [c]") {
                result = Angle + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## c");
                Angleresultview.setText(showAnswer.format(result));
            }
        }


    }
}