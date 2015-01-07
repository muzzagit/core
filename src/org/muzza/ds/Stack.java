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
public class Stack<E> {
    private Object[] stack;
    private int tos = -1;
    int size;
    
    public Stack() {
        this(10);
    }
    
    public Stack(int size) {
        stack = new Object[size];
        this.size = size; 
    }
    
//    public static void main(String[] args) {
//        
//        Stack stack = new Stack(1000001);
//        for(int i = 0; i < 1000000; i++){
//        }
//        
//        System.out.println("Element Pulled : " + stack.pop());
//    }
    
    public void push(int num){
        tos++;
        
        if(tos <= size -1){
            stack[tos] = num;
        } else {
            throw new ArrayIndexOutOfBoundsException("Error : Stack Overflow");
        }
    }
    
    public E pop(){
        E val = null;
        if(tos >= 0) {
          val  = (E) stack[tos];
          tos--;
        } else {
            throw new IllegalStateException("Error : Stack Empty");
        }
        
        return val;
    }
    
    
    public E peek() {
        if(tos >= 0)
            return (E) stack[tos];
        else
            throw new IllegalStateException("Error : Stack Empty");
    }
    
    public void traverse(){
        for(Object element: stack) {
            System.out.println(element);
        }
    }
    
    
}
