package com.example.intentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class add_subtract extends AppCompatActivity {

    private TextView mTextViewResult;
    private EditText mEditTextNumber1;
    private EditText mEditTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_subtract);

        mTextViewResult = findViewById(R.id.edt_AddSub_result);
        mEditTextNumber1 = findViewById(R.id.edt_AddSub_1);
        mEditTextNumber2 = findViewById(R.id.edt_AddSub_2);

        Button buttonOpenActivity2 = findViewById(R.id.btn_AddSub_opensub);

        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditTextNumber1.getText().toString().equals("")
                        ||mEditTextNumber1.getText().toString().equals("")){
                    Toast.makeText(add_subtract.this,"Please insert numbers",Toast.LENGTH_SHORT).show();

                }else {
//                    chuyen tu chuoi sang int
                    int number1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                    int number2 = Integer.parseInt(mEditTextNumber2.getText().toString());

                    Intent intent = new Intent(add_subtract.this,add_subtract_sub.class);
                    intent.putExtra("number1",number1);
                    intent.putExtra("number2",number2);
                    startActivityForResult(intent,1);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK){
                int result = data.getIntExtra("result",0);
                mTextViewResult.setText(""+result);
            }
            if (resultCode == RESULT_CANCELED) {
                mTextViewResult.setText("Nothing selected");
            }
        }
    }
}

