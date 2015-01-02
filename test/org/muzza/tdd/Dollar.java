/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.tdd;

/**
 *
 * @author M Mozammil
 */
class Dollar {
    
    int amount = 10;
    
    Dollar(int amount) {
        this.amount = amount;
    }

//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
    
    Dollar times(int multilpier) {
        return new Dollar(amount * multilpier);
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Dollar)) {
            return false;
        }
        
        final Dollar other = (Dollar) obj;
        
        return this.amount == other.amount;
    }
    
    

}
