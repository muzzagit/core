/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muzza.ds;

/**
 *
 * @author M Muzzammil
 */
public class Queue<E> {
    private Object[] queue;
    int front = -1, rear = -1;
    int size = -1;
    
    public Queue() {
        this(10);
    }
    
    
    public Queue(int size) {
        queue = new Object[size];
        this.size = size;
    }
    
    
    
    public boolean add(E item) {
        boolean success = false;
        ++rear;
        if(rear >= size ) {
            throw new IllegalStateException("Insertion fail. Queue is full. Please remove some item.");
        }
        
        if(front < 0) {
            ++front;
        }
        
        queue[rear] = item;
        success = true;
        
        return success;
    }
    
    public E remove() {
        if(front < 0 || front > rear) {
            throw new IllegalStateException("Queue is empty. Item can't be remove. Please add some item.");
        }
        
        E removedVal = (E) queue[front];
        ++front;
        return removedVal;
        
    }
    
    
    public void traverse() {
        for(int i = front; i <=  rear; i++) {
            System.out.print(queue[i] +"\t");
        }
    }
}
