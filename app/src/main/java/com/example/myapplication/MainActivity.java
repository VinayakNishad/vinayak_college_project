package com.example.myapplication;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText et_name, et_marks;
    public Button bt_add, bt_view_all;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DatabaseHelper(this);
        et_name = (EditText) findViewById(R.id.et_name);
        et_marks = (EditText) findViewById(R.id.et_marks);
        bt_add = (Button) findViewById(R.id.bt_add);
        bt_view_all = (Button) findViewById(R.id.bt_view_all);
        addData();
        viewData();
    }

    private void viewData() {
        bt_view_all.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Cursor result = dbHelper.getAllData();
                        if (result.getCount() == 0) {
//show message
                            showMessage("Error", "Nothing Found");
                            return;
                        }
                        StringBuffer sb = new StringBuffer();

                        while (result.moveToNext()) {
                            sb.append("ID: " + result.getInt(0) + "\n");
                            sb.append("NAME: " + result.getString(1) + "\n");
                            sb.append("MARKS: " + result.getString(2) + "\n\n\n");
                        }
//Show all data
                        showMessage("Success", sb.toString());
// showMessage(&quot;Success&quot;, &quot;Hllo&quot;);
                    }
                }
        );

    }

    private void showMessage(String title, String message) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.show();
    }

    private void addData() {
        bt_add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Boolean in_result =
                                dbHelper.insertData(et_name.getText().toString(),
                                        Integer.parseInt(et_marks.getText().toString()));
                        et_name.setText("");
                        et_marks.setText("");
                        if (in_result)
                            Toast.makeText(MainActivity.this, "Data inserted",
                                    Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MainActivity.this, "Error",
                                    Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}