package com.example.projektnizadatakfranzamaklar;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorUtilTest {

    //Test for general functionality of calculator
    //when both parameters are >0
    @Test
    public void calculateBMIWhenBothParametersAreValid() {
        float kilograms = 60;
        float meters = (float)2.89; //Equals to 170 centimeters
        float expected = (float)20.761234;
        double delta = 1;
        float actual;
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        actual = calculatorUtil.calculateBMI(kilograms, meters);
        assertEquals(expected, actual, delta);
    }

    //Test when one of the parameters is 0
    @Test
    public void calculateBMIWhenOneParamterIsInvalid() {
        float kilograms = 0;
        float meters = (float)2.89; //Equals to 170 centimeters
        float expected = 0;
        double delta = 1;
        float actual;
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        actual = calculatorUtil.calculateBMI(kilograms, meters);
        assertEquals(expected, actual, delta);
    }
}