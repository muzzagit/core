/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.tdd;

import org.junit.After;
import static org.junit.Assert.assertEquals;
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
        Dollar product = five.times(2);
        
        assertEquals(10, product.amount);
        
        product = five.times(3);
        assertEquals(15, product.amount);
    }
    
    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), "dfdf");
    }
}
