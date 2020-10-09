package com.example.android.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buclick(View view) {
        EditText name=(EditText)findViewById(R.id.eText);
        String textToPass = name.getText().toString();




        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("TEXT", textToPass);

        startActivity(i);
    }
}
