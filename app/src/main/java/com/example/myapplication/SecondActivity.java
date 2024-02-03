package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public EditText number_1;
    public EditText number_2;
    public Button button_add;
    public Button button_sub;
    public Button button_mult;
    public Button button_div;
    public TextView text_result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button_add = findViewById(R.id.button_add);
        button_div=findViewById(R.id.button_div);
        button_mult=findViewById(R.id.button_mult);
        button_sub=findViewById(R.id.button_sub);
        number_1=findViewById(R.id.number_1);
        number_2 = findViewById(R.id.number_2);
        text_result=findViewById(R.id.text_result);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numb1, numb2, result;
                numb1 = Integer.parseInt(number_1.getText().toString());
                numb2 = Integer.parseInt(number_2.getText().toString());
                result = numb1 + numb2;
                text_result.setText(Float.toString(result));
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numb1, numb2, result;
                numb1 = Integer.parseInt(number_1.getText().toString());
                numb2 = Integer.parseInt(number_2.getText().toString());
                result = numb1 - numb2;
                text_result.setText(Float.toString(result));
            }
        });
        button_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numb1, numb2, result;
                numb1 = Integer.parseInt(number_1.getText().toString());
                numb2 = Integer.parseInt(number_2.getText().toString());
                result = numb1 * numb2;
                text_result.setText(Float.toString(result));
            }
        });button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numb1, numb2, result;
                numb1 = Integer.parseInt(number_1.getText().toString());
                numb2 = Integer.parseInt(number_2.getText().toString());
                result = numb1 / numb2;
                text_result.setText(Float.toString(result));
            }
        });

    }
}