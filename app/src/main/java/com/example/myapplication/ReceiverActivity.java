package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {
    public Button btn2;
    public TextView textViewResult;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        
        btn2=findViewById(R.id.btn2);
        textViewResult=findViewById(R.id.textViewResult);
        
        
        Intent received = getIntent();
        String mssg = received.getStringExtra("Text");
        textViewResult.setText((mssg));
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReceiverActivity.this, NavigateActivity.class);
                startActivity(i);
            }

        });
    }
}