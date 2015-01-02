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
        
        final Node<E> temp = head;
        final Node<E> node = new Node(data, temp);
        if(temp == null) {
            head = node;
        } else {
            temp.next = node;
        }
        
        nodeCount++;
    }
    
    public void traverse() {
        Node temp  =  null;
        temp = head;
        do{
                System.out.println(temp.data);
                temp = temp.next;
        }while(temp != null);
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
