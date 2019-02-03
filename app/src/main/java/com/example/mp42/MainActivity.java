package com.example.mp42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/*
 CSCE 489: Machine Problem#2
 Srishti Kumar
 Description: Android Calculator App
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize textview field
        final TextView textView = findViewById(R.id.text_id);
        textView.setHint("\n\t\tEnter Calculation: ");

        // Initialize Calculator
        final Calculator calculator = new Calculator();

        // Initialize buttons
        final Button button0 = findViewById(R.id.button0);
        final Button button1 = findViewById(R.id.button1);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button4 = findViewById(R.id.button4);
        final Button button5 = findViewById(R.id.button5);
        final Button button6 = findViewById(R.id.button6);
        final Button button7 = findViewById(R.id.button7);
        final Button button8 = findViewById(R.id.button8);
        final Button button9 = findViewById(R.id.button9);
        final Button buttonAdd = findViewById(R.id.buttonAdd);
        final Button buttonSub = findViewById(R.id.buttonSub);
        final Button buttonMul = findViewById(R.id.buttonMul);
        final Button buttonDiv = findViewById(R.id.buttonDiv);
        final Button buttonClear = findViewById(R.id.buttonClear);
        final Button buttonDot = findViewById(R.id.buttonDot);
        final Button buttonEqual = findViewById(R.id.buttonEquals);

        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "0"); // Button 0
        }});

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "1"); // Button 1
            }});

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "2"); // Button 2
            }});

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "3"); // Button 3
            }});

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "4"); // Button 4
            }});

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "5"); // Button 5
            }});

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "6"); // Button 6
            }});

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "7"); // Button 7
            }});

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "8"); // Button 8
            }});

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "9"); // Button 9
            }});

        buttonDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "."); // Button .
            }});

//        Button Clear
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(null);
                textView.setHint("\n\t\tEnter Calculation: ");
            }});

//        Button Add
        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if(textView.getText().equals("")) textView.setText("Invalid input");
                else {
                    try {
                        calculator.setArg1(Float.parseFloat(textView.getText().toString())); // Set argument#1
                        calculator.setOperator("+"); // Set operator
                        textView.setText(null);
                        textView.setHint(calculator.getArg1() + calculator.getOperator()); // Display previous operands as hint
                    }
                    catch (NumberFormatException e) {
                        textView.setText("Invalid input");
                    }
                }
        }});

        //        Button Subtraction
        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if(textView.getText().equals("")) textView.setText("Invalid input");
                else {
                    try {
                        calculator.setArg1(Float.parseFloat(textView.getText().toString()));
                        calculator.setOperator("-");
                        textView.setText(null);
                        textView.setHint(calculator.getArg1() + calculator.getOperator());
                    }
                    catch (NumberFormatException e) {
                        textView.setText("Invalid input");
                    }
                }

            }});

//        Button Multiplication
        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if(textView.getText().equals("")) textView.setText("Invalid input");
                else {
                    try {
                        calculator.setArg1(Float.parseFloat(textView.getText().toString()));
                        calculator.setOperator("*");
                        textView.setText(null);
                        textView.setHint(calculator.getArg1() + calculator.getOperator());
                    }
                    catch (NumberFormatException e) {
                        textView.setText("Invalid input");
                    }
                }

            }});

        //        Button Division
        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if(textView.getText().equals("")) textView.setText("Invalid input");
                else {
                    try {
                        calculator.setArg1(Float.parseFloat(textView.getText().toString()));
                        calculator.setOperator("/");
                        textView.setText(null);
                        textView.setHint(calculator.getArg1() + calculator.getOperator());
                    }
                    catch (NumberFormatException e) {
                        textView.setText("Invalid input");
                    }
                }

            }});

        // Button Equal
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(textView.getText().equals("") || calculator.getArg1() == (float)Double.POSITIVE_INFINITY) textView.setText("Invalid input");
                else {
                    try {
                        calculator.setArg2(Float.parseFloat(textView.getText().toString())); // Get argument#2
                        textView.setText(calculator.getArg2() + "");

                        if(calculator.getOperator().equals("+")) // Addition
                        {
                            calculator.addition(calculator.getArg1(), calculator.getArg2());
                            String s;

                        }
                        else if(calculator.getOperator().equals("-")) // Subtraction
                        {
                            calculator.subtraction(calculator.getArg1(), calculator.getArg2());
                        }
                        else if(calculator.getOperator().equals("*")) // Multiplication
                        {
                            calculator.multiplication(calculator.getArg1(), calculator.getArg2());
                        }
                        else if(calculator.getOperator().equals("/")) // Division
                        {
                            calculator.division(calculator.getArg1(), calculator.getArg2());
                        }

                        textView.setText(String.valueOf(calculator.getAnswer())); // Display answer
                        calculator.clear(); // clear
                        textView.setHint("");
                    }
                    catch (NumberFormatException e) {
                        textView.setText("Invalid input");
                    }
                }
            }});
    }
}
