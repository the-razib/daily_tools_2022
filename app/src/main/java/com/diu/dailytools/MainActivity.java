package com.diu.dailytools;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    ImageView imageMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navagation Drawar h
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        // Drawer click and item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item ) {

                switch (item.getItemId()) {
                    case R.id.calculator:
                        Intent intent =new Intent(MainActivity.this,Calculators.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Calculator", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.Converter:
                        Intent myintent =new Intent(MainActivity.this,Converter.class);
                        startActivity(myintent);
                        Toast.makeText(MainActivity.this, "Converter", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.other:
                        Intent otherintent =new Intent(MainActivity.this,Others.class);
                        startActivity(otherintent);
                        Toast.makeText(MainActivity.this, "Other", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.about:
                        Intent aboutintent =new Intent(MainActivity.this,About_Me_Web_View.class);
                        startActivity(aboutintent);
                        Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.logout:
                        finishAffinity();
                        Toast.makeText(MainActivity.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;

                }

                return false;
            }

        });


        imageMenu = findViewById(R.id.imageMenu);
        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }


    public void CalculatorsFunction(View view) {
        Intent myIntent = new Intent(this,Calculators.class);
        startActivity(myIntent);
    }

    public void ConverterFunction(View view) {
        Intent myIntent = new Intent(this,Converter.class);
        startActivity(myIntent);
    }

    public void PersonalNoteFunction(View view) {
        Intent myIntent = new Intent(this,PerSonalNote.class);
        startActivity(myIntent);
    }

    public void AboutMeFunction(View view) {
        Intent myIntent = new Intent(this,About_Me_Web_View.class);
        startActivity(myIntent);
    }
//popup message show
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setMessage("Are you sure,You want to exit?")
                .setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();

                    }
                })
                .setNegativeButton("No",null).show();
    }

    public void Others(View view) {
        Intent myIntent = new Intent(this,Others.class);
        startActivity(myIntent);

    }
}