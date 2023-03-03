package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ax_b_sub extends AppCompatActivity {

    TextView text_result;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ax_bsub);

        // anh xa id
        text_result = findViewById(R.id.edt_axb_result);
        btnback = findViewById(R.id.btn_axb_back);
        // Nhan intent
        Intent intent = getIntent();
        // Lay Bundle khoi Intent
        Bundle bundle = intent.getBundleExtra("mypackage");
        /* cach 2:  (2 cach phai dung tuong ung voi nhau)
        Bundle bundle = intent.getExtras();  */
        // Lay du lieu khoi Bundle
        int a = bundle.getInt("soa");
        int b = bundle.getInt("sob");
        // Tim ket qua
        String nghiem;
        if(a==0 && b==0){
            nghiem = "PT vo so nghiem";
        }else if (a == 0 && b!=0 ){
            nghiem = "PT vo nghiem";
        }else{
            nghiem = "Nghiem pt = "+ (-1.0)*b/a;
        }
        text_result.setText(nghiem);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}