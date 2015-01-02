/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.threads;

/**
 *
 * @author M Mozammil
 */
public class Deadlock {
    static class Friends {
        private final String name;

        public Friends(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        
        public synchronized void bow(Friends bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }
        
        public synchronized void bowBack(Friends bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Friends muzza = new Friends("Muzza");
        final Friends john = new Friends("John");
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                muzza.bow(john);
            }
        }).start();
        
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                john.bow(muzza);
            }
        }).start();
        
    }

}
