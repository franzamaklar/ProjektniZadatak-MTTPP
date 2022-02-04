package com.example.projektnizadatakfranzamaklar;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterUtilTest {

    //Test for when argument of function is >0
    @Test
    public void convertCentimetersToMetersSquaredWhenParameterIsNotZero() {
        float centimeters = 170;
        float expected = (float)2.89;
        double delta = 0.1;
        float actual;
        ConverterUtil converter = new ConverterUtil();
        actual = converter.convertCentimetersToMetersSquared(centimeters);
        assertEquals(expected, actual, delta);
    }

    //Test for when argument of function is 0
    @Test
    public void convertCentimetersToMetersSquaredWhenParameterIsZero() {
        float centimeters = 0;
        float expected = 0;
        double delta = 0.1;
        float actual;
        ConverterUtil converter = new ConverterUtil();
        actual = converter.convertCentimetersToMetersSquared(centimeters);
        assertEquals(expected, actual, delta);
    }

    //Test for when argument is valid input (digit)
    @Test
    public void convertIntoFloatWhenInputIsDigit() {
        String input = "60";
        float expected = 60;
        double delta = 0.01;
        float actual;
        ConverterUtil converter = new ConverterUtil();
        actual = converter.convertIntoFloat(input);
        assertEquals(expected, actual, delta);
    }

    //Test for when argument is invalid input (not digit)
    @Test
    public void convertIntoFloatWhenInputIsNotDigit() {
        String input = " ";
        float expected = 0;
        double delta = 0.01;
        float actual;
        ConverterUtil converter = new ConverterUtil();
        actual = converter.convertIntoFloat(input);
        assertEquals(expected, actual, delta);
    }

    //Test for when argument is invalid input (string with both digits and signs)
    @Test
    public void convertIntoFloatWhenInputIsDigitsWithSigns() {
        String input = "40!";
        float expected = 0;
        double delta = 0.01;
        float actual;
        ConverterUtil converter = new ConverterUtil();
        actual = converter.convertIntoFloat(input);
        assertEquals(expected, actual, delta);
    }
}