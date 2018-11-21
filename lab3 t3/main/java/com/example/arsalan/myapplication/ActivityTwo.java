package com.example.arsalan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.P;
import static com.example.arsalan.myapplication.MainActivity.REQUEST_CODE;

public class ActivityTwo extends AppCompatActivity {

    EditText et;
TextView tv;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        et=findViewById(R.id.et);
        tv=findViewById(R.id.textView);
        bt=findViewById(R.id.bt);
        Intent in=getIntent();
    }
   public void lgclick(View v){
        Intent in=new Intent("get message",Uri.parse(tv.getText().toString()));
        setResult(Activity.RESULT_OK,in);
        finish();
   }


}

