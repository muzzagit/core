/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.ds;

/**
 *
 * @author M Muzzammil
 * @param <E>
 */
public class LinkedList<E> {
    Node<E> head;
    int nodeCount;
    
    public <T> void add(T data) {
        
        final Node<E> oldNode = head;
        final Node<E> newNode = new Node(data, oldNode);
        head = newNode;
        
        nodeCount++;
    }
    
    public void traverse() {
        Node temp  =  head;
        do{
                System.out.print(temp.data+" -> ");
                temp = temp.next;
        }while(temp != null);
        System.out.println("");
    }
    
    public E remove(E value) {
        Node temp  =  head;
        E returnValue = null;
        Node prev = temp;
        
        while(temp != null) {
                
                returnValue = (E) temp.data;
                if(returnValue.equals(value)) {
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
        }
        
        return returnValue;
    }


    public boolean search(String searchVal) {
        boolean success = false;
        Node temp = head;
        
        while(temp != null) {
            if(searchVal.equals(temp.data)) {
                success = true;
                break;
            }
            
            temp = temp.next;
            
        }
        
        return success;
    }
}
/**
 * This is good.
 * @author mmozammil
 * @param <E> 
 */
class  Node<E> {
     E data;
     Node<E> next;
    
     Node(E data, Node<E> next) {
         this.data = data;
         this.next = next;
     }
}
