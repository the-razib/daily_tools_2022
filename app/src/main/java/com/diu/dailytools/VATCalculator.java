package com.diu.dailytools;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class VATCalculator extends AppCompatActivity {
    EditText taxrate,originalPrice;
    TextView VATCalculation;

    @Override
    protected void onCreate(Bundle TotalPricedInstanceState) {
        super.onCreate(TotalPricedInstanceState);
        setContentView(R.layout.activity_vatcalculator);
        
        taxrate=findViewById(R.id.EnterTAXRateID);
        originalPrice=findViewById(R.id.OriginalPriceID);
        VATCalculation=findViewById(R.id.TotalPaymentID);

    }

    public void VATcalculator(View view) {
        String inputRate=taxrate.getText().toString();
        String inputPrice=originalPrice.getText().toString();

        if (inputRate.isEmpty()){

            taxrate.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Tax Rat",Toast.LENGTH_LONG).show();
        }
        else if (inputPrice.isEmpty()){
            originalPrice.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Price",Toast.LENGTH_LONG).show();
        }
        else {
            Double taxRate,origianlPrice,TAX,TotalPrice;
            taxRate =Double.parseDouble(taxrate.getText().toString());
            origianlPrice=Double.parseDouble(originalPrice.getText().toString());

            TAX=(taxRate/100)*origianlPrice;
            TotalPrice=origianlPrice + TAX;
            VATCalculation.setText("Total TAX  "+TAX+ "\nTotal Price: "+TotalPrice);
        }

    }
}