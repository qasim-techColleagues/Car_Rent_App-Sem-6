package com.example.auto_car_rent;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button button;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=findViewById(R.id.sign);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                pref.edit().putBoolean("flag", true).apply();
                Intent intent = new Intent(login.this, homeactivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(login.this, signpage.class);
                startActivity(intent);
            }
        });

       TextView f =findViewById(R.id.fpassword);

        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent meIntent = new Intent(login.this,forgetpassword.class);
                startActivity(meIntent);
            }
        });
    }
}