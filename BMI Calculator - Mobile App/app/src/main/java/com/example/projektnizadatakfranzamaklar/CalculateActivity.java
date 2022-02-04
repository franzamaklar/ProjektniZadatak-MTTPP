package com.example.projektnizadatakfranzamaklar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class CalculateActivity extends AppCompatActivity {

    private TextView weightTitle;
    private EditText inputWeight;
    private TextView heightTitle;
    private EditText inputHeight;
    private TextView results;
    private Button button;
    private Button calculateButton;
    private Dialog myDialog;

    private ConverterUtil converter;
    private CalculatorUtil calculator;

    private float height;
    private float kilograms;
    private float resultForDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        initialize();
    }

    private void initialize() {
        weightTitle = findViewById(R.id.titleIW);
        heightTitle = findViewById(R.id.titleIH);
        inputWeight = findViewById(R.id.weightInput);
        inputHeight = findViewById(R.id.heightInput);
        button = findViewById(R.id.button);
        calculateButton = findViewById(R.id.calculateButton);
        results = findViewById(R.id.results);
        converter = new ConverterUtil();
        calculator = new CalculatorUtil();
        myDialog = new Dialog(CalculateActivity.this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.setContentView(R.layout.results_window);
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
            }
        });
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(inputHeight.getText().toString().equals("") && inputWeight.getText().toString().equals("")) {
                     YoYo.with(Techniques.Shake).duration(700).repeat(2).playOn(findViewById(R.id.weightInput));
                     YoYo.with(Techniques.Shake).duration(700).repeat(2).playOn(findViewById(R.id.heightInput));
                 }
                 else if(inputWeight.getText().toString().equals("")){
                    YoYo.with(Techniques.Shake).duration(700).repeat(2).playOn(findViewById(R.id.weightInput));
                }else if(inputHeight.getText().toString().equals("")){
                    YoYo.with(Techniques.Shake).duration(700).repeat(2).playOn(findViewById(R.id.heightInput));
                }else {
                     kilograms = converter.convertIntoFloat(String.valueOf(inputWeight.getText()));
                     height = converter.convertIntoFloat(String.valueOf(inputHeight.getText()));
                     height = converter.convertCentimetersToMetersSquared(height);
                     resultForDisplay = calculator.calculateBMI(kilograms, height);
                     displayResult(resultForDisplay);
                }
            }
        });
    }

    public void displayResult(float resultForDisplay) {
        if(resultForDisplay == 0){
            if(kilograms == 0 && height == 0) {
                results.setText("Pogrešan unos kilograma i visine");
            }else if(kilograms == 0){
                results.setText("Pogrešan unos kilograma");
            }else if(height == 0){
                results.setText("Pogrešan unos visine");
            }
        }else if (resultForDisplay <= 18.5) {
            results.setText("You are underweight. Your BMI result is:" + String.valueOf(resultForDisplay));
        } else if (resultForDisplay >= 18.5 && resultForDisplay <= 24.9) {
            results.setText("Your body shape is normal. Your BMI result is:" + String.valueOf(resultForDisplay));
        } else if (resultForDisplay >= 25 && resultForDisplay <= 29.9) {
            results.setText("You are overweight. Your BMI result is:" + String.valueOf(resultForDisplay));
        } else if (resultForDisplay >= 30 && resultForDisplay <= 34.9) {
            results.setText("You are obese. Your BMI result is:" + String.valueOf(resultForDisplay));
        } else if (resultForDisplay >= 35) {
            results.setText("You are extremely obese. Your BMI result is:" + String.valueOf(resultForDisplay));
        }
    }

}