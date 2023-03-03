package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class add_subtract_sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subtract_sub);


        Intent intent = getIntent();
//      default value dung de khi lay du lieu ko thanh cong thi se la so 0
        int number1 = intent.getIntExtra("number1",0);
        int number2 = intent.getIntExtra("number2",0);

        TextView textViewNumbers = findViewById(R.id.txt_AddSub_number);
        textViewNumbers.setText("Numbers: " + number1 + ", " +number2);

        Button buttonAdd = findViewById(R.id.btn_AddSub_add);
        Button buttonSubTract = findViewById(R.id.btn_AddSub_subtract);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = number1 + number2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK,resultIntent);
                finish();
            }
        });

        buttonSubTract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = number1 - number2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK,resultIntent);
                finish();
            }
        });
    }
}