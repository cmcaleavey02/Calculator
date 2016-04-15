package com.sierrascope.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Main activity class
 */
public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAdd;
    private Button btnSubtract;
    private Button btnDivide;
    private Button btnMultiply;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.etNumber1);
        operand2 = (EditText) findViewById(R.id.etNumber2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 + oper2;
                    tvResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 - oper2;
                    tvResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 / oper2;
                    tvResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());

                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double result = oper1 * oper2;
                    tvResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
