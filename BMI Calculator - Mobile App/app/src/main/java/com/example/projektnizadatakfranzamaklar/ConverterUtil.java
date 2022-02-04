package com.example.projektnizadatakfranzamaklar;

import static java.lang.System.in;

import android.widget.EditText;

public class ConverterUtil {

    public float convertCentimetersToMetersSquared(float cm){
        if(cm == 0){
            return 0;
        }
        else {
            cm = (float)0.01*cm;
            return (cm * cm);
        }
    }

    public float convertIntoFloat(String input){
        char temporary;
        for(int i = 0; i < input.length(); i++){
            temporary = input.charAt(i);
            if(temporary >= '0' && temporary <= '9'){
                continue;
            }else
                return 0;
        }
        return (float) Integer.parseInt(input);
    }
}

