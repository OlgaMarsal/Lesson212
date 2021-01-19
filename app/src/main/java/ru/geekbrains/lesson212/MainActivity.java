package ru.geekbrains.lesson212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number;
    private String point = ".";
    private TextView numbersText;
    private Operations operations;
  
    private final static String keyOperations = "Operations";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operations = new Operations();
        initViews();
        showDisplay();
    }

    private void showDisplay() {
        operations.getOperationDisplay(numbersText, getText().toString());
        numbersText.setText(operations.getOperationDislay());
    }

    public void initViews() {
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button button0 = findViewById(R.id.button_0);
        Button buttonPoint = findViewById(R.id.button_point);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonIncrease = findViewById(R.id.button_increase);
        Button buttonDivision = findViewById(R.id.button_division);
        numbersText = findViewById(R.id.forNumbers);
        

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonPoint.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonIncrease.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                number = "1";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_2:
                number = "2";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_3:
                number = "3";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_4:
                number = "4";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_5:
                number = "5";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_6:
                number = "6";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_7:
                number = "7";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_8:
                number = "8";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_9:
                number = "9";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_0:
                number = "0";
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_point:
                operations.point(point);
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                operations.display(number, numbersText.getText().toString());
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                break;

            case R.id.button_plus:
                operations.math("+");
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                operations.getOperationDisplay(numbersText, getText().toString());
                break;

            case R.id.button_minus:
                operations.math("-");
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                operations.getOperationDisplay(numbersText, getText().toString());
                break;

            case R.id.button_increase:
                operations.math("*");
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                operations.getOperationDisplay(numbersText, getText().toString());
                break;

            case R.id.button_division:
                operations.math("/");
                numbersText.setText(operations.getOperationDisplay(numbersText, getText().toString()));
                operations.getOperationDisplay(numbersText, getText().toString());
                break;
        }

        @Override
        protected void onStart() {
            super.onStart();
        }

        @Override
        protected void onResume() {
            super.onStart();
        }

    }

    private void getText() {
    }
    
}

    //private final static String TAG = "[lifeActivity"];