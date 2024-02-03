package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public EditText enter_name;
    public TextView your_name;
    public Button click_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        enter_name=findViewById(R.id.enter_name);
        click_me = findViewById(R.id.click_me);
        your_name=findViewById(R.id.your_name);
        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name;
                name = enter_name.getText().toString();
                your_name.setText(name);
            }
        });
    }
}