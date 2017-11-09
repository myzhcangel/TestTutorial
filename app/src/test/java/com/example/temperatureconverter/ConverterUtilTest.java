package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmk on 2017/11/8.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float boilingPointFActual = ConverterUtil.convertCelsiusToFahrenheit(100);
        assertEquals("Conversion from celsius to fahrenheit failed",
                212, boilingPointFActual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float boilingPointCActual = ConverterUtil.convertFahrenheitToCelsius(212);
        assertEquals("Conversion from fahrenheit to celsius failed",
                100, boilingPointCActual, 0.001);
    }
}
