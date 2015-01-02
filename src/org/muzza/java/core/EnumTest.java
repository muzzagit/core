/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.java.core;

import org.muzza.coding.Person;

/**
 *
 * @author M Mozammil
 */
public class EnumTest {
   
           
           
    public static void main(String[] s) {
    
        Unit unit = Unit.M2CM;
    
        switch(unit) {
            case M2CM   :
                System.out.println("Meter to CentiMeter : " + unit.getUnitCode());
                break;
            case L2ML   :
                System.out.println("Litre to MiliLitre : " + unit.getUnitCode());
                break;
            case KM2M   :
                System.out.println("Kilometer to Meter : " + unit.getUnitCode());
                break;
            default     :
                System.out.println("No conversion...");
        }
        
        
        
        Company company = Company.AMDOCS;
    
        switch(company) {
            case AMDOCS   :
                System.out.println(company.getDetails());
                break;
            case EBAY   :
                System.out.println(company.getDetails());
                break;
            case TECHNOTREE   :
                System.out.println(company.getDetails());
                break;
            case GOOGLE   :
                System.out.println(company.getDetails());
                break;
            default     :
                System.out.println("No company details...");
        }
    
    
    
        Person person = Person.ENGINEER;


        switch(person) {
            case ENGINEER   :
                System.out.println(person.getDetails());
                System.out.println(person.getInfo());
                break;
            case TEACHER   :
                System.out.println(person.getDetails());
                System.out.println(person.getInfo());
                break;
            case BUILDER   :
                System.out.println(person.getDetails());
                System.out.println(person.getInfo());
                break;
            case WRITER   :
                System.out.println(person.getDetails());
                System.out.println(person.getInfo());
                break;
            default     :
                System.out.println("No person details...");
        }
    
    }
}


enum Unit {
   M2CM(1),
   L2ML(2),
   KM2M(3);
   
   private final int unitCode;
   
   Unit(int unitCode) {
       this.unitCode = unitCode;
   }
   
   
   public int getUnitCode() {
       return this.unitCode;
   }
   
}