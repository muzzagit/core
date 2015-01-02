/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.coding;

/**
 *
 * @author mmozammil
 */
public enum Person {
    ENGINEER("ENGINEER CALLED") {

        @Override
        public String getInfo() {
            return "Software Engineer";
        }
        
        public void getAge() {
            System.out.println("Age is 30");
        }
    },
    TEACHER("TECHER CALLED") {

        @Override
        public String getInfo() {
            return "Maths Teacher";
        }
    },
    BUILDER("BUILDER CALLED") {

        @Override
        public String getInfo() {
            return "Home Builder";
        }
    },
    WRITER("WRITER CALLED") {

        @Override
        public String getInfo() {
            return "Novel Writer";
        }
    };
    
    private String details;
    
    Person(String details) {
        this.details = details;
    }
    
    public String getDetails() {
        return details;
    }
    
    public abstract String getInfo();
}
