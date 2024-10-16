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

public class TemperatureCalculator extends AppCompatActivity {
    EditText TemperatureAmount;
    Spinner TemperatureFromSpinner,TemperatureToSpinner;
    TextView Temperatureresultview;
    Double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_calculator);

        TemperatureAmount=findViewById(R.id.EnterTemperatureAmountID);
        TemperatureFromSpinner=findViewById(R.id.TemperatureFromSpinnerID);
        TemperatureToSpinner=findViewById(R.id.TemperatureToSpinnerID);
        Temperatureresultview=findViewById(R.id.TemperatureResultShowID);

        String[] from={"Celsius[°C]","Fahrenheit [°F]","Kelvin [k]"};
        ArrayAdapter aay= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        TemperatureFromSpinner.setAdapter(aay);

        String[] to={"Celsius[°C]","Fahrenheit [°F]","Kelvin [k]"};
        ArrayAdapter aay2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        TemperatureToSpinner.setAdapter(aay2);
    }

    public void TemperatureCalculatorResult(View view) {
        String inpuiAmout=TemperatureAmount.getText().toString();

        if (inpuiAmout.isEmpty()){

            TemperatureAmount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Temperature",Toast.LENGTH_LONG).show();
        }
        else {
            Double Temperature = Double.parseDouble(TemperatureAmount.getText().toString());

            //Celsius[°C]
            if (TemperatureFromSpinner.getSelectedItem().toString() == "Celsius[°C]" && TemperatureToSpinner.getSelectedItem().toString() == "Celsius[°C]") {
                result = Temperature + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## °C");
                Temperatureresultview.setText(showAnswer.format(result));
            } else if (TemperatureFromSpinner.getSelectedItem().toString() == "Celsius[°C]" && TemperatureToSpinner.getSelectedItem().toString() == "Fahrenheit [°F]") {
                result = Temperature * 1.8 + 32;

                DecimalFormat showAnswer = new DecimalFormat("#.## °F");
                Temperatureresultview.setText(showAnswer.format(result));
            } else if (TemperatureFromSpinner.getSelectedItem().toString() == "Celsius[°C]" && TemperatureToSpinner.getSelectedItem().toString() == "Kelvin [k]") {
                result = Temperature + 273.15;
                DecimalFormat showAnswer = new DecimalFormat("#.## °K");
                Temperatureresultview.setText(showAnswer.format(result));
            }

            //Fahrenheit [°F]
            if (TemperatureFromSpinner.getSelectedItem().toString() == "Fahrenheit [°F]" && TemperatureToSpinner.getSelectedItem().toString() == "Celsius[°C]") {
                result = ((Temperature - 32) * 0.56);
                DecimalFormat showAnswer = new DecimalFormat("#.## °C");
                Temperatureresultview.setText(showAnswer.format(result));
            } else if (TemperatureFromSpinner.getSelectedItem().toString() == "Fahrenheit [°F]" && TemperatureToSpinner.getSelectedItem().toString() == "Fahrenheit [°F]") {
                result = Temperature + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## °F");
                Temperatureresultview.setText(showAnswer.format(result));
            } else if (TemperatureFromSpinner.getSelectedItem().toString() == "Fahrenheit [°F]" && TemperatureToSpinner.getSelectedItem().toString() == "Kelvin [k]") {
                result = (Temperature - 32) / 1.8 + 273.15;
                DecimalFormat showAnswer = new DecimalFormat("#.## °K");
                Temperatureresultview.setText(showAnswer.format(result));
            }

            //Kelvin [k]
            if (TemperatureFromSpinner.getSelectedItem().toString() == "Kelvin [k]" && TemperatureToSpinner.getSelectedItem().toString() == "Celsius[°C]") {
                result = Temperature - 273.15;
                DecimalFormat showAnswer = new DecimalFormat("#.## °C");
                Temperatureresultview.setText(showAnswer.format(result));
            } else if (TemperatureFromSpinner.getSelectedItem().toString() == "Kelvin [k]" && TemperatureToSpinner.getSelectedItem().toString() == "Fahrenheit [°F]") {
                result = (Temperature - 273.15) * 1.8 + 32;
                DecimalFormat showAnswer = new DecimalFormat("#.## °F");
                Temperatureresultview.setText(showAnswer.format(result));
            } else if (TemperatureFromSpinner.getSelectedItem().toString() == "Kelvin [k]" && TemperatureToSpinner.getSelectedItem().toString() == "Kelvin [k]") {
                result = Temperature + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## °K");
                Temperatureresultview.setText(showAnswer.format(result));
            }
        }


    }
}