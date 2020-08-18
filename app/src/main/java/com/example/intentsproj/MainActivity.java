package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER1 = "com.example.appication.example.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.appication.example.EXTRA_NUMBER2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 300);
        toast.setView(layout);
        toast.show();


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText( getApplicationContext(),"You just clicked the OK button",  Toast.LENGTH_SHORT);
                toast.show();


                openActivity2();
            }
        });

    }

    public void openActivity2(){
        EditText editText1 = (EditText) findViewById(R.id.textField1);
        int number1 = Integer.parseInt(editText1.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.textField2);
        int number2 = Integer.parseInt(editText2.getText().toString());

        Intent intent  = new Intent(this,Activity2.class);
        intent.putExtra(EXTRA_NUMBER1,number1);
        intent.putExtra(EXTRA_NUMBER2,number2);
        startActivity(intent);
    }


}
