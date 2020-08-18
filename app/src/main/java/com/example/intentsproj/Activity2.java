package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button add = findViewById(R.id.Add);
        Button sub = findViewById(R.id.sub);
        Button multi =findViewById(R.id.multi);
        Button div = findViewById(R.id.div);
        final TextView ans = (TextView)findViewById(R.id.answer);



        Intent intent = getIntent();
        final int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER1,0);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER2,0);

        final TextView num1 = (TextView) findViewById(R.id.displayNum1);
        final TextView num2 = (TextView) findViewById(R.id.displayNum2);
        num1.setText(""+number1);
        num2.setText(""+number2);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.getText().toString();
                num2.getText().toString();
                double n1 = Double.valueOf(num1.getText().toString());
                double n2 = Double.valueOf(num2.getText().toString());
                double answer ;
                answer = n1+n2;
                ans.setText(String.valueOf(answer));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.getText().toString();
                num2.getText().toString();
                double n1 = Double.valueOf(num1.getText().toString());
                double n2 = Double.valueOf(num2.getText().toString());
                double answer ;
                answer = n1-n2;
                ans.setText(String.valueOf(answer));

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.getText().toString();
                num2.getText().toString();
                double n1 = Double.valueOf(num1.getText().toString());
                double n2 = Double.valueOf(num2.getText().toString());
                double answer ;
                answer = n1 * n2;
                ans.setText(String.valueOf(answer));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.getText().toString();
                num2.getText().toString();
                double n1 = Double.valueOf(num1.getText().toString());
                double n2 = Double.valueOf(num2.getText().toString());
                double answer ;
                answer = n1 / n2;
                ans.setText(String.valueOf(answer));

            }
        });

    }





}