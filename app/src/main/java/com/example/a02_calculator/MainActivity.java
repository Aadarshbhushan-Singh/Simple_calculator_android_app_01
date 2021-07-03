package com.example.a02_calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Creating EditTexts
    public EditText number_01;
    public EditText number_02;
    public TextView result;

    //Creating buttons
    public Button add;
    public Button subtract;
    public Button multiply;
    public Button divide;
    public Button square;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        number_01=findViewById(R.id.number_01);
        number_02=findViewById(R.id.number_02);

        result=findViewById(R.id.result);



        //Make button for add
        add=findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=(int)Integer.parseInt(number_01.getText().toString());
                int num2=(int)Integer.parseInt(number_02.getText().toString());
                if(num1==0 & num2==0){
                    int sum=num1+num2;
                    result.setText("Sum: "+sum);
                    Toast.makeText(MainActivity.this, "Both numbers are zero..Lol!", Toast.LENGTH_SHORT).show();
                }else{
                    int sum=num1+num2;
                    result.setText("Sum: "+sum);
                    Toast.makeText(MainActivity.this, "Addition Completed", Toast.LENGTH_SHORT).show();
                }

            }
        });
        
        subtract=findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(number_01.getText().toString());
                int num2=Integer.parseInt(number_02.getText().toString());
                if(num1==0 & num2==0){
                    int difference=num1-num2;
                    result.setText("Diff: "+difference);
                    Toast.makeText(MainActivity.this, "Both numbers are zero...Lol!", Toast.LENGTH_SHORT).show();
                }else{
                    int difference=num1-num2;
                    result.setText("Diff: "+difference);
                    Toast.makeText(MainActivity.this, "Substraction Completed!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        multiply=findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(number_01.getText().toString());
                int num2=Integer.parseInt(number_02.getText().toString());
                if(num1==0 & num2==0){
                    int product=num1*num2;
                    result.setText("Product: "+product);
                    Toast.makeText(MainActivity.this, "Both numbers are zero...Lol!", Toast.LENGTH_SHORT).show();
                }else{
                    int product=num1*num2;
                    result.setText("Product: "+product);
                    Toast.makeText(MainActivity.this, "Multiplication Completed!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        divide=findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(number_01.getText().toString());
                int num2=Integer.parseInt(number_02.getText().toString());
                if(num2!=0) {
                    int quotient = (int) (num1 / num2);
                    result.setText("Quotient: " + quotient);
                    Toast.makeText(MainActivity.this, "Divide Completed!", Toast.LENGTH_SHORT).show();
                }else{
                    result.setText("Lol!");
                    Toast.makeText(MainActivity.this, "Cannot Divide by Zero!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        square=findViewById(R.id.square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(number_01.getText().toString());
                int num2=Integer.parseInt(number_02.getText().toString());
                int square1=num1*num1;
                int square2=num2*num2;
                if(num1==0 & num2==0) {
                    result.setText("A: " + square1 + " B: " + square2);
                    Toast.makeText(MainActivity.this, "Both numbers are zero...Lol!", Toast.LENGTH_SHORT).show();
                }else{
                    result.setText("A: " + square1 + " B: " + square2);
                    Toast.makeText(MainActivity.this, "Square Completed!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}