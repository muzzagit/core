/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muzza.tdd;

/**
 *
 * @author mmozammil
 */
public class Franc {

 private int amount = 10;
    
    Franc(int amount) {
        this.amount = amount;
    }

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
    
    Franc times(int multilpier) {
        return new Franc(amount * multilpier);
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Dollar)) {
            return false;
        }
        
        final Franc other = (Franc) obj;
        
        return this.amount == other.amount;
    }
    
}
