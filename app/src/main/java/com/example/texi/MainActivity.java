package com.example.texi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int x=0;
    }

    public void runLogin(View view) {
        double x;
        EditText temp =(EditText) findViewById(R.id.value);
        double money = Double.parseDouble(temp.getText().toString());

        TextView moneyy = (TextView)findViewById(R.id.textView4);

        x= 75 + ((Math.floor(money/ 250)) * 5);

        moneyy.setText(""+x+"元");



    }
}