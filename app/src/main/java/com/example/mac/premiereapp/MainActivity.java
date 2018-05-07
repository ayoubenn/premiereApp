package com.example.mac.premiereapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this,monService.class));
        Button btnLogin = (Button) findViewById(R.id.btn);
btnLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

            Intent startService = new Intent("je suis un service");
            startService.setAction("service je suis");
            startService(startService);

    }
});




     /*   btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String Text=((EditText) findViewById(R.id.txt)).getText().toString();
                String pass= ((EditText) findViewById(R.id.edit)).getText().toString();
                prefs.edit().putString("soul",Text).commit();
                prefs.edit().putString("soula",pass).commit();
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
               String Text1=((EditText) findViewById(R.id.txt)).getText().toString();
                i.putExtra("1234",Text1);
                startActivity(i);
            }

        });*/



     /* Button B =(Button) findViewById(R.id.butn);
       B.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {


           }
       });*/



    }

}













