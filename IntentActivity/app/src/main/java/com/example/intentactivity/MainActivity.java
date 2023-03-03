package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalculator;
    Button btnAddSubtract;
    Button btnAxb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = findViewById(R.id.btn_calculator);
        btnAddSubtract = findViewById(R.id.btn_add_subtract);
        btnAxb = findViewById(R.id.btn_open_axb);


        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,calculator.class);
                startActivity(intent);
            }
        });

        btnAddSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,add_subtract.class);
                startActivity(intent);
            }
        });


        btnAxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ax_b.class);
                startActivity(intent);
            }
        });

    }
}