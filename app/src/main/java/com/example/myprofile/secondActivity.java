package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {
    Button button;;
    EditText et;
    EditText et1;
    String st;
    String st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        et = findViewById(R.id.edittext);
        et1 = findViewById(R.id.edittext2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st =et.getText().toString();
                st1 =et1.getText().toString();

                Intent intent = new Intent(secondActivity.this,MainActivity.class);
                intent.putExtra("fname", st);
                intent.putExtra("lname", st1);

                startActivity(intent);
                finish();
            }
        });
    }
}