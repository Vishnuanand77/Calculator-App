package com.vishnu.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.NaN;


public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button Add;
    private Button sub;
    private Button divide;
    private Button mul;
    private Button equal;
    private Button clear;
    private TextView result;

    String res, temp, operator;
    float op = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberBtnclicked("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberBtnclicked("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorbtnClicked("+");

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorbtnClicked("-");

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorbtnClicked("*");

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorbtnClicked("/");

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                result.setText(String.valueOf(res));


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClicked();
            }
        });
    }

    private void setupUIViews(){
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        zero = (Button) findViewById(R.id.btn0);
        Add = (Button) findViewById(R.id.Add);
        sub = (Button) findViewById(R.id.Subtract);
        mul = (Button) findViewById(R.id.Multiply);
        divide = (Button) findViewById(R.id.Divide);
        clear = (Button) findViewById(R.id.clear);
        result = (TextView) findViewById(R.id.result);
        equal = (Button) findViewById(R.id.equals);
    }

    private void calculate(){

                float num = Float.valueOf(temp);
                float num2 = Float.valueOf(result.getText().toString());

                if (operator == "+"){
                    op = num + num2;
                }
                else if(operator == "-"){
                    op = num - num2;
                }
                else if(operator == "*"){
                    op = num * num2;
                }
                else if(operator == "/"){
                    op = num/num2;
                }

                res = String.valueOf(op);

        }

        private void onNumberBtnclicked(String pos){
            res = result.getText().toString();
            res = res+pos;
            result.setText(res);
        }

        private void onOperatorbtnClicked(String operator){
            temp = result.getText().toString();
            onClearButtonClicked();
            this.operator = operator;
        }
        private void onClearButtonClicked() {
            res = "";
            result.setText("");
        }
    }

