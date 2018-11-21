package com.example.arsalan.lab3t2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button b1,b2,b3,b4,b5,b6,b7;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        editText=(EditText) findViewById(R.id.et);
    }
   public void btclick(View s){
        Intent in= new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel"+editText.getText().toString()));
        startActivity(in);
   }
    public void lgclick(View s){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
    public void ctclick(View s){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://contacts/people/"));
        startActivity(i);
    }
    public void bsclick(View s){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.google.com/"));
        startActivity(i);
    }
    public void clclick(View s){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://call_log/calls/1"));
        startActivity(i);
    }
    public void gaclick(View s){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("content://media/external/images/media/"));
        startActivity(i);
    }
    public void dpclick(View s){
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+editText.getText().toString()));
        startActivity(i);
    }

}
