/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.coding;

/**
 *
 * @author Muzzammil Ayyubi
 */
public enum Scales {
    CELSIUS {

        @Override
        public double toCelsius(double temperature) {
            return temperature;
        }
    },
    FAHRENHEIT {

        @Override
        public double toCelsius(double temperature) {
            return (.55) * (temperature - 32);
        }
    },
    KELVIN {

        @Override
        public double toCelsius(double temperature) {
            return (temperature - 273.15);
        }
    };
    
    
    public abstract double toCelsius(double temperature);
}
