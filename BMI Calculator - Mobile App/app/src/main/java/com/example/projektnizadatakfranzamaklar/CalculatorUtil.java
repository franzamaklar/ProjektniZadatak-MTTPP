package com.example.projektnizadatakfranzamaklar;

public class CalculatorUtil {

    public float calculateBMI(float kg, float m){
        if(kg == 0 || m == 0){
            return 0;
        }
        else {
            return kg/m;
        }
    }

}
