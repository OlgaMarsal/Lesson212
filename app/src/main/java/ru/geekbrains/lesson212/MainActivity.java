package ru.geekbrains.lesson212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String number;
    private final String point = ".";
    private TextView numbersText;
    private Operations operations;
    private final static String keyOperations = "Operations";
    private Object saveInstanceState;
    private Bundle savedInstanceState;
    private static final String appTheme = "APP_THEME";
    private static final int myCoolCodeStyle = 0;
    private static final int appThemeLightCodeStyle = 1;
    private static final int appThemeCodeStyle = 2;
    private static final int appThemeDarkCodeStyle =3;
    private Object NameSharedPreference;


    private void showDisplay() {
        operations.getOperationDisplay(numbersText, getText().toString());
        numbersText.setText(operations.getOperationDisplay());
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

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            
            setTheme(getAppTheme(R.style.MyCoolStyle));
            setContentView(R.layout.activity_main);
            initThemeChooser();

            operations = new Operations();
            initViews();
            showDisplay();
        }
    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMyCoolStyle),
                myCoolCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark),
                appThemeDarkCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLight),
                appThemeLightCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialLightDarkAction),
                appThemeCodeStyle);
        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton)rg.getChildAt(getCodeStyle(myCoolCodeStyle))).setChecked(true);
    }

    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });
    }

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle){
            case appThemeCodeStyle:
                return R.style.Theme_Lesson212;
            case appThemeLightCodeStyle:
                return R.style.AppThemeLight;
            case appThemeDarkCodeStyle:
                return R.style.AppThemeDark;
            default:
                return R.style.MyCoolStyle;
        }
    }

    private int getCodeStyle(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences((String) NameSharedPreference, MODE_PRIVATE);
        return sharedPref.getInt(appTheme, codeStyle);
    }

    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(String.valueOf(NameSharedPreference), MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(appTheme, codeStyle);
        editor.apply();
    }

    private void getText() {
    }
    
}

    //private final static String TAG = "[lifeActivity"];