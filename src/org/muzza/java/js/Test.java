/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.java.js;

/**
 *
 * @author M Muzzammil
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printValue(10, "", "", 10, "", new B(89) );
    }
    
    
    public static void printValue(int a, Object... params) {
        System.out.println("Params");
    }
}


class B {
    int val;
    String name;
    public B(int val) {
        this.val = val;
        this.name = "person";
    }
}