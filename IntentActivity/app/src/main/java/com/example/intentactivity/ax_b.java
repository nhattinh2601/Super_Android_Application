package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ax_b extends AppCompatActivity {

    EditText edta,edtb;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ax_b);

        // anh xa ID
        edta = findViewById(R.id.txt_axb_a);
        edtb = findViewById(R.id.txt_axb_b);

        btnResult = findViewById(R.id.btn_axb_result);
        // xu ly Click
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Khai bao Intent
                Intent intent = new Intent(ax_b.this,ax_b_sub.class);
                // Lay du lieu
                int a = Integer.parseInt(edta.getText().toString());
                int b = Integer.parseInt(edtb.getText().toString());
                // Dong goi du lieu vao Bundle
                Bundle bundle = new Bundle();
                bundle.putInt("soa",a);
                bundle.putInt("sob",b);
                // Dua bundle vao intent
                intent.putExtra("mypackage",bundle);
                /*Cach 2:
                intent.putExtras(bundle); */
                // Khoi dong
                startActivity(intent);
            }
        });
    }
}