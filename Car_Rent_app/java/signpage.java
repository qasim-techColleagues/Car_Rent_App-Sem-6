package com.example.auto_car_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class signpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signpage);
        Button button=findViewById(R.id.sigpage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(signpage.this, "Sing_up", Toast.LENGTH_SHORT).show();

            }
        });
        final TextView l;
        l = (TextView) findViewById(R.id.login);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(signpage.this, "Login", Toast.LENGTH_SHORT).show();
                Intent meIntent = new Intent(view.getContext(),login.class);
                startActivity(meIntent);
            }
        });


    }
}