package com.diu.dailytools;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LogInToDailyTools extends AppCompatActivity {
    EditText emailEditTextLogin,passwordEditText;
    ProgressBar progressbar;
    Button loginAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_personal_note);

        emailEditTextLogin=findViewById(R.id.EmailEdittextID);
        passwordEditText=findViewById(R.id.PasswordEditTextID);
        progressbar=findViewById(R.id.LoginProgress);
        loginAccountBtn=findViewById(R.id.LoginButtonID);

        loginAccountBtn.setOnClickListener((v) -> logInUser());
    }

    public void SingUPAccountFunction(View view) {
        Intent myIntent=new Intent(this,SignUpPage.class);
        startActivity(myIntent);


    }

    void logInUser(){
        String email = emailEditTextLogin.getText().toString();
        String password = passwordEditText.getText().toString();

        boolean isValidated= validateDatalogin(email,password);
        if (!isValidated){
            return;
        }

        LoginIntoFireBase(email,password);

    }
    void LoginIntoFireBase(String email,String password){

        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
        changeInProgressBer(true);
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                changeInProgressBer(false);
                if (task.isSuccessful()){
                    //login successful
                    if (firebaseAuth.getCurrentUser().isEmailVerified()){
                        //go to main activity

                        Intent myIntent=new Intent(LogInToDailyTools.this,MainActivity.class);
                        startActivity(myIntent);
                    }
                    else {

                        Toast.makeText(LogInToDailyTools.this,"Email not verified ,Pleas verify your email",Toast.LENGTH_SHORT).show();
                    }
                }
                //login fail
                else {
                    Toast.makeText(LogInToDailyTools.this,task.getException().getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    void changeInProgressBer(boolean inProgress){
        if(inProgress){
            progressbar.setVisibility(View.VISIBLE);
            loginAccountBtn.setVisibility(View.GONE);
        }else {
            progressbar.setVisibility(View.GONE);
            loginAccountBtn.setVisibility(View.VISIBLE);
        }
    }


    boolean validateDatalogin(String email,String password){

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_LONG).show();
            emailEditTextLogin.setError("Email is required");
            return false;
        }
        else if (password.isEmpty() ) {
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_LONG).show();
            passwordEditText.setError("Enter Password");
            return false;
        }
        return true;
    }

}
