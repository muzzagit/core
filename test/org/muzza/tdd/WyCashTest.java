/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.tdd;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author M Mozammil
 */
public class WyCashTest {
    
    
    
    @Before
    public void setUp() {}
    
    @After
    public void tearDown() {}
    
    
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
    
    public void testFrancMultiplicatio() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
