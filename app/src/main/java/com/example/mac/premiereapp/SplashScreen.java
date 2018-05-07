package com.example.mac.premiereapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String login =prefs.getString("soul","default");
        String password =prefs.getString("soula","default");
        Toast.makeText(this,"Login: "+"    "+ login + "password: " +password ,Toast.LENGTH_SHORT).show();
    if((!(prefs.getString("soul","default").equals("default")))&&(!(prefs.getString("soula","default").equals("default")))){
        Intent i =new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);

    }else {
        Intent e=new Intent(getApplicationContext(),MainActivity.class);

    }
    }*/}
