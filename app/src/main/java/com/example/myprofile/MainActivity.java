package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button nameCh;
    public Button phoneCh;
    public Button emailCh;
    public Button infoCh;
    public Button upload;

    TextView tv13;
    TextView tv15;
    TextView tv17;
    TextView tv11;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameCh = (Button) findViewById(R.id.nameCh);
        phoneCh = (Button) findViewById(R.id.phoneCh);
        emailCh = (Button) findViewById(R.id.emailCh);
        infoCh = (Button) findViewById(R.id.infoCh);
        upload = (Button) findViewById(R.id.upload);

        tv11 = findViewById(R.id.textView11);
        tv13 = findViewById(R.id.textView13);
        tv15 = findViewById(R.id.textView15);
        tv17 = findViewById(R.id.textView17);
        iv1 = findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            //Intent intent = getIntent();
            String st = bundle.getString("key");
            if(st != null) {
                tv13.setText(st);
            }
            String st1 = bundle.getString("key1");
            if(st1 != null) {
                tv15.setText(st1);
            }
            String st2 = bundle.getString("key2");
            if(st2 != null) {
                tv17.setText(st2);
            }
            String st3 = bundle.getString("fname");
            String st4 = bundle.getString("lname");

            if(st3 != null && st4 != null) {
                tv11.setText(st3+" "+st4);
            }
            int i = bundle.getInt("img1");
            if(i == 1) {
                iv1.setImageResource(R.drawable.upload1);
            }

        }
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSixthActivity();
            }
        });
        nameCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });
        phoneCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThirdActivity();
            }
        });
        emailCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFourthActivity();
            }
        });
        infoCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFifthActivity();
            }
        });
    }
    public void openSecondActivity(){
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }
    public void openThirdActivity(){
        Intent intent = new Intent(this, thirdActivity.class);
        startActivity(intent);
    }
    public void openFourthActivity(){
        Intent intent = new Intent(this, fourthActivity.class);
        startActivity(intent);
    }
    public void openFifthActivity() {
        Intent intent = new Intent(this, fifthActivity.class);
        startActivity(intent);
    }
    public void openSixthActivity() {
        Intent intent = new Intent(this, sixthActivity.class);
        startActivity(intent);
    }
}