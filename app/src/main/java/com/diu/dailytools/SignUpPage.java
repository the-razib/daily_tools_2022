package com.diu.dailytools;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public class SignUpPage extends AppCompatActivity {

    EditText fullNameEditText,emailEditText,passwordEditText,confirmPassword;
    RadioGroup gender;
    RadioButton GenderSelect;
    ProgressBar progressbar;
    Button createAccountBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page_for_note);

        fullNameEditText=findViewById(R.id.UserNameTextID);
        emailEditText=findViewById(R.id.EmailSignupEdittextID);

        passwordEditText=findViewById(R.id.PasswordSingUpEditTextID);
        confirmPassword=findViewById(R.id.ConPasswordSingUpEditTextID);
        createAccountBtn =findViewById(R.id.CreatAcountButtonID);
        progressbar=findViewById(R.id.signUpProgress_ber);

        gender=findViewById(R.id.GenderID);
        gender.clearCheck();

        createAccountBtn.setOnClickListener(view -> createAccount() );
    }

    void createAccount(){

        String Name = fullNameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String confirmPass = confirmPassword.getText().toString();

        boolean isValidated= validateData(Name,email,password,confirmPass);
        if (!isValidated){
            return;
        }

        CreateAccountInFireBase(Name,email,password);

    }
    void CreateAccountInFireBase(String Name,String email,String password){
        changeInProgressBer(true);

        FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();
        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignUpPage.this,
                new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            //Create Account is Done
                            Toast.makeText(SignUpPage.this,"Successfully create account,Check email to verify",Toast.LENGTH_SHORT).show();
                            firebaseAuth.getCurrentUser().sendEmailVerification(); //verification email send to user
                            firebaseAuth.signOut(); // Logout the user //After verify the mail user can login
                            finish();
                        }else {
                            //Failure
                            Toast.makeText(SignUpPage.this,task.getException().getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                        }

                    }
                }

        );



    }

    void changeInProgressBer(boolean inProgress){
        if(inProgress){
            progressbar.setVisibility(View.VISIBLE);
            createAccountBtn.setVisibility(View.GONE);
        }else {
            progressbar.setVisibility(View.GONE);
            createAccountBtn.setVisibility(View.VISIBLE);
        }
    }


    boolean validateData(String Name,String email,String password,String confirmPass ){
        if (Name.isEmpty()) {
            Toast.makeText(this, "Please Enter your full name", Toast.LENGTH_LONG).show();
            fullNameEditText.setError("Enter Your Name");
            return false;
        }
        else if (email.isEmpty()){
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_LONG).show();
            emailEditText.setError("Email is required");
            return false;
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Please Enter valid Email", Toast.LENGTH_LONG).show();
            emailEditText.setError("Please Enter Valid Email");
            return false;
        }

        else if (password.isEmpty() ) {
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_LONG).show();
            passwordEditText.setError("Enter Password");
            return false;
        }

        else if (confirmPass.isEmpty()) {
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_LONG).show();
            confirmPassword.setError("Enter Same Password");
            return false;
        }
        else if (gender.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "Please Select your Gender", Toast.LENGTH_LONG).show();
            return false;
        }
        else if(!password.equals(confirmPass)) {
            Toast.makeText(this, "Passwords do not match. ", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }


    public void BackToLogInPage(View view) {
        Intent myIntent = new Intent(this, LogInToDailyTools.class);
        startActivity(myIntent);
    }
}
