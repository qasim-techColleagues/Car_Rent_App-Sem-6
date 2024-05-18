package com.example.auto_car_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        Boolean flag = pref.getBoolean("flag", false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (flag == false) {

                    Intent p = new Intent(MainActivity.this, login.class);
                    startActivity(p);

                    finish();

                } else {
                    Intent p = new Intent(MainActivity.this, homeactivity.class);
                    startActivity(p);
                    finish();
                }
            }
        }, 2000);
    }
    }
