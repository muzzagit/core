package org.muzza.coding;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Muzzammil Ayyubi
 */
public class TemperatureConverterTest {
    
    TemperatureConverter converter;
    private static final double DELTA = 1e-15;
    
    @Before
    public void setUp() {
        converter = new TemperatureConverter();
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testCelsiusToFahrenheit() {
         assertEquals(50.0, converter.convert(Scales.CELSIUS, Scales.FAHRENHEIT, 10), DELTA);
     }
     
     
     @Test
     public void testCelsiusToKelvin() {
         assertEquals(303.15, converter.convert(Scales.CELSIUS, Scales.KELVIN, 30), DELTA);
     }
     
     @Test
     public void testFahrenhietToKelvin() {
         assertEquals(272.05, converter.convert(Scales.FAHRENHEIT, Scales.KELVIN, 30), DELTA);
     }
     
     @Test
     public void testFahrenhietToCelsius() {
         assertEquals(-1.1, converter.convert(Scales.FAHRENHEIT, Scales.CELSIUS, 30), DELTA);
     }
     
     @Test
     public void testKelvinToCelsius() {
         assertEquals(-253.15, converter.convert(Scales.KELVIN, Scales.CELSIUS, 20), DELTA);
     }
     
     @Test
     public void testKelvinToFahrenheit() {
         assertEquals(-279.67, converter.convert(Scales.KELVIN, Scales.FAHRENHEIT, 100), DELTA);
     }
}
