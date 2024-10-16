package com.diu.dailytools;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LengthCalculator extends AppCompatActivity {
    EditText lengthAmount;
    Spinner fromSpinner,toSpinner;
    TextView lengthResultView;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_calculator);

        lengthAmount=findViewById(R.id.EnterLengthAmountID);
        fromSpinner=findViewById(R.id.LengthFromSpinnerID);
        toSpinner=findViewById(R.id.LengthToSpinnerID);
        lengthResultView=findViewById(R.id.LengthResultShowID);

        String[] from={"Meter[m]","kilometer[km]","Decimeter[dml","Centimeter[cml","Millimeter[mm]","Micrometer[µm]","Nanomete[nm]","Mile[mi]","Foot[ft]","Inch[in]"};
        ArrayAdapter aay= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        fromSpinner.setAdapter(aay);

        String[] to={"Meter[m]","kilometer[km]","Decimeter[dml","Centimeter[cml","Millimeter[mm]","Micrometer[µm]","Nanomete[nm]","Mile[mi]","Foot[ft]","Inch[in]"};
        ArrayAdapter aay2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        toSpinner.setAdapter(aay2);

    }

    public void LengthCalculatorResult(View view) {
        String inpuiAmout=lengthAmount.getText().toString();

        if (inpuiAmout.isEmpty()){

            lengthAmount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Length",Toast.LENGTH_LONG).show();
        }
        else {
        }
    }
}