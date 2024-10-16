package com.diu.dailytools;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class discountCalculator extends AppCompatActivity {
    EditText amount,discount;
    TextView DiscountShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_calculator);
        amount=findViewById(R.id.EnterAmountID);
        discount=findViewById(R.id.DiscountID);
        DiscountShow=findViewById(R.id.TotalPaymentID);
    }

    public void DiscountCalculate(View view) {
        String inputamount=amount.getText().toString();
        String inputDiscount=discount.getText().toString();

        if (inputamount.isEmpty()){

            amount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter sale price",Toast.LENGTH_LONG).show();
        }
        else if (inputDiscount.isEmpty()){
            discount.setError("Filed is Empty.");
            Toast.makeText(this,"Pleas Enter Discount percent",Toast.LENGTH_LONG).show();
        }
        else{
            Double Taka,percentence,payAmount,save;
            Taka =Double.parseDouble(amount.getText().toString());
            percentence=Double.parseDouble(discount.getText().toString());

            payAmount=(Taka-(percentence*Taka)/100);
            save=(percentence*Taka/100);
            DiscountShow.setText("Price After Discount  "+payAmount+ "\nYou Save: "+save);
        }



    }
}