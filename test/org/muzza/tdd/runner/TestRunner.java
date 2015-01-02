/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.tdd.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.muzza.tdd.WyCashTest;

/**
 *
 * @author M Mozammil
 */
public class TestRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(WyCashTest.class);
        
        
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        
        System.out.println("Result - " +result.wasSuccessful());
        
        
    }

}
