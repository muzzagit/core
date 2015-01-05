/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.ds;

/**
 *
 * @author M Mozammil
 */
public class Stack {
    int[] values;
    int tos = -1;
    
    public Stack(int length) {
        values = new int[length];
    }
    
    public static void main(String[] args) {
        
        Stack stack = new Stack(1000001);
        for(int i = 0; i < 1000000; i++){
//            stack.push(i);
        }
        
//        stack.push(22);
        
        System.out.println("Element Pulled : " + stack.pop());
    }
    
    public void push(int num){
        tos++;
        
        if(tos <= values.length){
            values[tos] = num;
        } else {
            throw new ArrayIndexOutOfBoundsException("Error : tos pointer maximized");
        }
    }
    
    public int pop(){
        int val = 0;
        if(tos >= 0) {
          val  = values[tos];
            tos--;
        } else {
            throw new IllegalStateException("Error : no element");
        }
        
        return val;
    }
    
    public void traverse(){
        for(int i = 0; i<=tos; i++) {
            System.out.println(values[i]);
        }
    }
    
    
}
