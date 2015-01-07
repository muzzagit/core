/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muzza.test.ds;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muzza.ds.Queue;
import static org.junit.Assert.*;
import org.muzza.ds.LinkedList;

/**
 *
 * @author Muzzammil Ayyubi
 */
public class TestBasicDS {
    Queue queue;
    LinkedList<String> list;
    
    @Before
    public void setUp() {
        queue = new Queue();
        list = new LinkedList();
    }
    
    
    @After
    public void tearDown() {}
    
    @Test(expected = IllegalStateException.class)
    public void testEmptyQueueDeletion() {
        assertEquals(queue.remove(), null);
    }
    
    @Test
    public void testQueueInsertion() {
        assertEquals(queue.add(10), true);
        assertEquals(queue.add(20), true);
        assertEquals(queue.add(30), true);
        assertEquals(queue.add(40), true);
        assertEquals(queue.add(50), true);
        assertEquals(queue.remove(), 10);
        assertEquals(queue.add(60), true);
        assertEquals(queue.add(70), true);
        assertEquals(queue.add(80), true);
        assertEquals(queue.remove(), 20);
        assertEquals(queue.add(90), true);
        queue.traverse();
    }
    
    
    @Test(expected = IllegalStateException.class)
    public void testFullQueueInsertion() {
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(200);
        queue.add(100);
    }
    
    
    @Test
    public void testList() {
        assertEquals(list.search("Muzzammil"), false);
        list.add("Muzzammil");
        list.add("John");
        list.add("Gyaan");
        list.traverse();
        list.remove("John");
        list.traverse();
        assertEquals(list.search("Muzzammil"), true);
    }
}
