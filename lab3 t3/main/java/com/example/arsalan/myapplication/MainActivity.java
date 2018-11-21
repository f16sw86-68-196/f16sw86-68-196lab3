package com.example.arsalan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        bt=findViewById(R.id.bn);
    }
    static final int REQUEST_CODE = 1; // The request code
    public void getResultBtn(View v) {
        Intent in = new Intent(MainActivity.this,ActivityTwo.class);
        startActivityForResult(in, REQUEST_CODE);

    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CODE:
                if (requestCode == REQUEST_CODE) {
                    if (resultCode == RESULT_OK) {
                        String reply = data.getStringExtra("get Message");
                    }
                }
        }

    }
    }

