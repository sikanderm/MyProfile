package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class fourthActivity extends AppCompatActivity {
    Button button;;
    EditText et;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        et = findViewById(R.id.edittext);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st =et.getText().toString();
                Intent intent = new Intent(fourthActivity.this,MainActivity.class);
                intent.putExtra("key1", st);
                startActivity(intent);
                finish();
            }
        });
    }
}