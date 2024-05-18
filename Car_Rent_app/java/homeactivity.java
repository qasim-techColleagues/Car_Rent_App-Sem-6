package com.example.auto_car_rent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        ImageView imageView1=findViewById(R.id.home);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               
                Intent intent = new Intent(homeactivity.this, homeactivity.class);
                startActivity(intent);
            }
        });
        ImageView imageView2=findViewById(R.id.add);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeactivity.this, add_page.class);
                startActivity(intent);
            }
        });
        
        ImageView imageView3=findViewById(R.id.message);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeactivity.this, homeactivity.class);
                startActivity(intent);
            }
        });
        final TextView r = (TextView) findViewById(R.id.honda);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(homeactivity.this, "HONDA", Toast.LENGTH_SHORT).show();
                Intent meIntent = new Intent(view.getContext(),honda.class);
                startActivity(meIntent);
            }
        });
        final TextView b = (TextView) findViewById(R.id.bmw);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(homeactivity.this, "BMW", Toast.LENGTH_SHORT).show();
                Intent meIntent = new Intent(view.getContext(),BMW.class);
                startActivity(meIntent);
            }
        });
        final TextView a = (TextView) findViewById(R.id.acura);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(homeactivity.this, "Acura", Toast.LENGTH_SHORT).show();
                Intent meIntent = new Intent(view.getContext(),Acura.class);
                startActivity(meIntent);
            }
        });
        final TextView t = (TextView) findViewById(R.id.tro);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(homeactivity.this, "TRO", Toast.LENGTH_SHORT).show();
                Intent meIntent = new Intent(view.getContext(),TRO.class);
                startActivity(meIntent);
            }
        });
        final TextView s = (TextView) findViewById(R.id.suzuki);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(homeactivity.this, "Suzuki", Toast.LENGTH_SHORT).show();
                Intent meIntent = new Intent(view.getContext(),Suzuki.class);
                startActivity(meIntent);
            }
        });
    }
}