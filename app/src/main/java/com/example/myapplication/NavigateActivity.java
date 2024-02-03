package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NavigateActivity extends AppCompatActivity {
    public Button btn1;
    public Button btn_implicit;
    public EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);

        btn1= findViewById(R.id.btn1);

        btn_implicit= findViewById(R.id.btn_implicit);

        edittext=findViewById(R.id.edittext);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavigateActivity.this, ReceiverActivity.class);
                startActivity(i);
            }

        });
        btn_implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String store = edittext.getText().toString();
                Intent intent = new Intent(NavigateActivity.this, ReceiverActivity.class);
                intent.putExtra("Text",store);
                startActivity(intent);
            }
        });
    }


}