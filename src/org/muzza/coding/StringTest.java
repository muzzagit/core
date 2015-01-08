/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.coding;

/**
 *
 * @author M Muzzammil
 */
public class StringTest {
    
    static String parentS = "";
    static String sub1 = "";
    static String sub2 = "";
    
    
  public static void main(String[] args) {
//     calculateSum();
      createMemoryLeak();
  }
  
  
  private static void createMemoryLeak() {
      int size = 1000000000;
      char[] str = new char[size];
  }
  public static void calculateSum() {
      long sum = 0;
      long start = System.currentTimeMillis();
      for(long i = 3; i < 2000000000; i++) {
          if((i%3 == 0) || (i%5 == 0)) {
              sum = sum + i;
          }
      }
      
      System.out.println("Time taken : " + (System.currentTimeMillis() - start));
      System.out.println("Sum :) " +sum);
  }
  
  public void h() {
  
       boolean find = true;
      while(find) {
          int count = 0;
          if(parentS.contains(sub1)) {
              parentS = parentS.substring(0, parentS.indexOf(sub1)+1) + parentS.substring(parentS.indexOf(sub1), parentS.length());
          }
          find = false;
      }
      
      System.out.println("String : " + parentS);
  }
  
  
}


class StringC {
    
  String id = "";
  String name = "";
 
 
    
}