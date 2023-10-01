package com.example.multiscreenapk;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME="package com.example.multiScreen.extra.name";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }



    public void openActivity(View v){//new fn made by me
    Toast.makeText(this, "opening", Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(this, MainActivity2.class);//to connect it to 2nd activity
         name =findViewById(R.id.name);
        String nameText = name.getText().toString();
        intent.putExtra(EXTRA_NAME,nameText);//extra name mai name text ka data ja-ega

      startActivity(intent);//to open 2nd activity whenever it is used
}
}