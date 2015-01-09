/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.coding;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Muzzammil Ayyubi
 */
public class TemperatureConverter {
    
    public double convert(Scales from, Scales to, double param) {
        
        double temperature = from.toCelsius(param);
        
        
        switch(to) {
            case CELSIUS :
                break;
            case FAHRENHEIT :
                temperature = (1.8 * temperature) + 32;
                break;
            case KELVIN :
                temperature = temperature + 273.15;
                break;
            default :
                System.out.println("Wrong Scale. Please check and provide correct one.");
        }
        
        
        return formatTemperature(temperature);
        
    }
    
    
    private double formatTemperature(double temperature) {
        return new BigDecimal(temperature).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
