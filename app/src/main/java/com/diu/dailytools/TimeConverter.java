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

public class TimeConverter extends AppCompatActivity {

    EditText TimeConverterAmount;
    Spinner TimeConverterFromSpinner,TimeConverterToSpinner;
    TextView TimeConverterresultview;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_converter);

        TimeConverterAmount=findViewById(R.id.EnterTimeConverterAmountID);
        TimeConverterFromSpinner=findViewById(R.id.TimeConverterFromSpinnerID);
        TimeConverterToSpinner=findViewById(R.id.TimeConverterToSpinnerID);
        TimeConverterresultview=findViewById(R.id.TimeConverterResultShowID);

        String[] from={"Second [s]","Millisecond [ms]","Microsecond [µs]","Nanosecond [ns]","Minute [min]","Hour [h]","Day [d]","Week [week]","Month [month]","Year [y]"};
        ArrayAdapter aay= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        TimeConverterFromSpinner.setAdapter(aay);

        String[] to={"Second [s]","Millisecond [ms]","Microsecond [µs]","Nanosecond [ns]","Minute [min]","Hour [h]","Day [d]","Week [week]","Month [month]","Year [y]"};
        ArrayAdapter aay2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        TimeConverterToSpinner.setAdapter(aay2);
    }

    public void TimeConverterCalculatorResult(View view) {
        String inpuiAmout=TimeConverterAmount.getText().toString();

        if (inpuiAmout.isEmpty()){

            TimeConverterAmount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Time",Toast.LENGTH_LONG).show();
        }
        else {
            Double Time = Double.parseDouble(TimeConverterAmount.getText().toString());

            //Second [s]
            if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Second [s]") {
                result = Time + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## s");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Millisecond [ms]") {
                result = Time * 1000;
                DecimalFormat showAnswer = new DecimalFormat("#.## ms");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Microsecond [µs]") {
                result = Time * 1000000;
                DecimalFormat showAnswer = new DecimalFormat("#.## µs");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Nanosecond [ns]") {
                result = Time * 1000000000;
                DecimalFormat showAnswer = new DecimalFormat("#.## ns");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Minute [min]") {
                result = (Time / 60);
                DecimalFormat showAnswer = new DecimalFormat("#.## mim");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Hour [h]") {
                result = (Time / 3600);
                DecimalFormat showAnswer = new DecimalFormat("#.## hour");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Day [d]") {
                result = (Time / 86400);
                DecimalFormat showAnswer = new DecimalFormat("#.## day");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Week [week]") {
                result = (Time / 604800);
                DecimalFormat showAnswer = new DecimalFormat("#.## week");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Month [month]") {
                result = (Time / 2592000);
                DecimalFormat showAnswer = new DecimalFormat("#.## month");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Second [s]" && TimeConverterToSpinner.getSelectedItem().toString() == "Year [y]") {
                result = (Time / 31536000);
                DecimalFormat showAnswer = new DecimalFormat("#.## year");
                TimeConverterresultview.setText(showAnswer.format(result));
            }

            //Millisecond [ms]
            if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Second [s]") {
                result = Time * 0.001000;
                DecimalFormat showAnswer = new DecimalFormat("#.## s");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Millisecond [ms]") {
                result = Time + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## ms");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Microsecond [µs]") {
                result = Time * 1000;
                DecimalFormat showAnswer = new DecimalFormat("#.## µs");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Nanosecond [ns]") {
                result = Time * 1000000;
                DecimalFormat showAnswer = new DecimalFormat("#.## ns");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Minute [min]") {
                result = (Time * 0.000017);
                DecimalFormat showAnswer = new DecimalFormat("#.## mim");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Hour [h]") {
                result = (Time * 0.0000003);
                DecimalFormat showAnswer = new DecimalFormat("#.## hour");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Day [d]") {
                result = (Time * 0.00000001);
                DecimalFormat showAnswer = new DecimalFormat("#.## day");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Week [week]") {
                result = (Time * 0.000000003);
                DecimalFormat showAnswer = new DecimalFormat("#.## week");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Month [month]") {
                result = (Time * 0.000000002);
                DecimalFormat showAnswer = new DecimalFormat("#.## month");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Millisecond [ms]" && TimeConverterToSpinner.getSelectedItem().toString() == "Year [y]") {
                result = (Time * 0.000000002);
                DecimalFormat showAnswer = new DecimalFormat("#.## year");
                TimeConverterresultview.setText(showAnswer.format(result));
            }

            //Microsecond [µs] Not Done Yet
            if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Second [s]") {
                result = Time * 0.001000;
                DecimalFormat showAnswer = new DecimalFormat("#.## s");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Millisecond [ms]") {
                result = Time + 0;
                DecimalFormat showAnswer = new DecimalFormat("#.## ms");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Microsecond [µs]") {
                result = Time * 1000;
                DecimalFormat showAnswer = new DecimalFormat("#.## µs");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Nanosecond [ns]") {
                result = Time * 1000000;
                DecimalFormat showAnswer = new DecimalFormat("#.## ns");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Minute [min]") {
                result = (Time * 0.000017);
                DecimalFormat showAnswer = new DecimalFormat("#.## mim");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Hour [h]") {
                result = (Time * 0.0000003);
                DecimalFormat showAnswer = new DecimalFormat("#.## hour");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Day [d]") {
                result = (Time * 0.00000001);
                DecimalFormat showAnswer = new DecimalFormat("#.## day");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Week [week]") {
                result = (Time * 0.000000003);
                DecimalFormat showAnswer = new DecimalFormat("#.## week");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Month [month]") {
                result = (Time * 0.000000002);
                DecimalFormat showAnswer = new DecimalFormat("#.## month");
                TimeConverterresultview.setText(showAnswer.format(result));
            } else if (TimeConverterFromSpinner.getSelectedItem().toString() == "Microsecond [µs]" && TimeConverterToSpinner.getSelectedItem().toString() == "Year [y]") {
                result = (Time * 0.000000002);
                DecimalFormat showAnswer = new DecimalFormat("#.## year");
                TimeConverterresultview.setText(showAnswer.format(result));
            }
        }
         
         

    }
}