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


public class CurrencyConverter extends AppCompatActivity {
    EditText interAmount;
    Spinner fromSpinner,toSpinner;
    TextView resultView;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        interAmount=findViewById(R.id.EnterAmountID);
        fromSpinner=findViewById(R.id.FromSpinnerID);
        toSpinner=findViewById(R.id.ToSpinnerID);
        resultView=findViewById(R.id.ResultShowID);

        String[] from={"BDT","EUR","USD","Swiss Franc","Indian Rupee"};
        ArrayAdapter aay= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        fromSpinner.setAdapter(aay);

        String[] to={"BDT","EUR","USD","Swiss Franc","Indian Rupee"};
        ArrayAdapter aay2= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        toSpinner.setAdapter(aay2);


    }

    void taka(){
        DecimalFormat showAnswer =new DecimalFormat(" #.## Taka");
        resultView.setText(showAnswer.format(result));
    }
    void euro(){
        DecimalFormat showAnswer =new DecimalFormat(" #.## Euro");
        resultView.setText(showAnswer.format(result));
    }
    void dollar(){
        DecimalFormat showAnswer =new DecimalFormat(" #.## Dollar");
        resultView.setText(showAnswer.format(result));
    }
    void france(){
        DecimalFormat showAnswer =new DecimalFormat(" #.## France");
        resultView.setText(showAnswer.format(result));
    }
    void rupee(){
        DecimalFormat showAnswer =new DecimalFormat(" #.## Rupee");
        resultView.setText(showAnswer.format(result));
    }

    
    public void currencyConverter(View view) {
        String inputAmount=interAmount.getText().toString();

        if (inputAmount.isEmpty()){
            interAmount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Amount",Toast.LENGTH_LONG).show();
        }
        else {
            double amount =Double.parseDouble(interAmount.getText().toString());

            if (fromSpinner.getSelectedItem().toString().equals("BDT") && toSpinner.getSelectedItem().toString().equals("BDT"))
            {
                result=amount+0;
                taka();
            }
            else if (fromSpinner.getSelectedItem().toString().equals("BDT") && toSpinner.getSelectedItem().toString().equals("EUR"))
            {
                result=amount*0.00925;
                euro();
            }
            else if (fromSpinner.getSelectedItem().toString().equals("BDT") && toSpinner.getSelectedItem().toString().equals("USD"))
            {
                result=amount*0.00964;
                dollar();
            }
            else if (fromSpinner.getSelectedItem().toString().equals("BDT") && toSpinner.getSelectedItem().toString()=="Swiss Franc")
            {
                result=amount*0.00908;
                france();
            }
            else if (fromSpinner.getSelectedItem().toString()=="BDT" && toSpinner.getSelectedItem().toString()=="Indian Rupee")
            {
                result=amount*0.78746;
                rupee();
            }


            //"EUR"
            else if (fromSpinner.getSelectedItem().toString().equals("EUR") && toSpinner.getSelectedItem().toString().equals("BDT"))
            {
                result=amount*104.399;
                taka();
            }
            else if (fromSpinner.getSelectedItem().toString()=="EUR" && toSpinner.getSelectedItem().toString()=="EUR")
            {
                result=amount+0;
                euro();
            }
            else if (fromSpinner.getSelectedItem().toString()=="EUR" && toSpinner.getSelectedItem().toString()=="USD")
            {
                result=amount*1.04156;
                dollar();
            }
            else if (fromSpinner.getSelectedItem().toString()=="EUR" && toSpinner.getSelectedItem().toString()=="Swiss Franc")
            {
                result=amount*0.98131;
                france();
            }
            else if (fromSpinner.getSelectedItem().toString()=="EUR" && toSpinner.getSelectedItem().toString()=="Indian Rupee")
            {
                result=amount*85.0706;
                rupee();
            }

            //"USD"
            else if (fromSpinner.getSelectedItem().toString()=="USD" && toSpinner.getSelectedItem().toString()=="BDT")
            {
                result=amount*100.233;
                taka();
            }
            else if (fromSpinner.getSelectedItem().toString()=="USD" && toSpinner.getSelectedItem().toString()=="EUR")
            {
                result=amount*0.95993;
                euro();
            }
            else if (fromSpinner.getSelectedItem().toString()=="USD" && toSpinner.getSelectedItem().toString()=="USD")
            {
                result=amount+0;
                dollar();
            }
            else if (fromSpinner.getSelectedItem().toString()=="USD" && toSpinner.getSelectedItem().toString()=="Swiss Franc")
            {
                result=amount*0.94209;
                france();
            }
            else if (fromSpinner.getSelectedItem().toString()=="USD" && toSpinner.getSelectedItem().toString()=="Indian Rupee")
            {
                result=amount*81.6759;
                rupee();
            }
            //"Swiss Franc"
            else if (fromSpinner.getSelectedItem().toString()=="Swiss Franc" && toSpinner.getSelectedItem().toString()=="BDT")
            {
                result=amount*106.367;
                taka();
            }
            else if (fromSpinner.getSelectedItem().toString()=="Swiss Franc" && toSpinner.getSelectedItem().toString()=="EUR")
            {
                result=amount*1.01878;
                euro();
            }
            else if (fromSpinner.getSelectedItem().toString()=="Swiss Franc" && toSpinner.getSelectedItem().toString()=="USD")
            {
                result=amount*1.0612;
                dollar();
            }
            else if (fromSpinner.getSelectedItem().toString()=="Swiss Franc" && toSpinner.getSelectedItem().toString()=="Swiss Franc")
            {
                result=amount+0;
                france();
            }
            else if (fromSpinner.getSelectedItem().toString()=="Swiss Franc" && toSpinner.getSelectedItem().toString()=="Indian Rupee")
            {
                result=amount*86.6745;
                rupee();
            }
        }



        }

    }