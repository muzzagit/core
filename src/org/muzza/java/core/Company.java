/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.java.core;

/**
 *
 * @author mmozammil
 */
public enum Company {
    EBAY("E-Commerce"), AMDOCS("MyLast Company"), TECHNOTREE("MyFirst Company"), GOOGLE("MyDream Company");
    
    
    
    private final String details;
    
    Company(String details) {
        this.details = details;
    }
    
    public String getDetails() {
        return this.details;
    
    }
}
