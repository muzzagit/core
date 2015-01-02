/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.java.core;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author M Muzzammil
 */
public class Test {
    static String n;
    public static void main(String[] a) {

        String t = "username_projectid";
        String username = t.split("_")[0];
//        System.out.println("val : " + username);
        
//        getFromMap();
//        String local = "";
//        check(local);
//   String str = "27.678677";
   
//   System.out.print(str.substring(0, str.lastIndexOf("."))+ "."+str.substring(str.lastIndexOf(".")+1, str.lastIndexOf(".")+3));
   
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(7);
    list.add(4);
    list.add(3);
    list.add(2);
    
    for(Integer in : list) {
        System.out.println(in);
    }
    
    }
     private static void roundOff(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        
        BigDecimal bd = new BigDecimal(value);
        value = bd.setScale(places, RoundingMode.HALF_UP).doubleValue();
        System.out.println( value);
    }
     
     public static void simpleRoundOfff(double value) {
         
         value = Math.floor(value);
         System.out.println(value);
         
     }
     
     
     static String formatConfigurationId(String selectedConfigs) {
        StringBuilder val = new StringBuilder() ;
        selectedConfigs = (selectedConfigs.substring(0, selectedConfigs.length() - 1));
        String[] configs = selectedConfigs.split(",");
        //expecting value : 0,1,0.1,1.1 etc
        for(String str : configs) {
            if(str.contains(".")){
                double local = Double.valueOf(str);
                local = local - 0.1;
                val.append(String.valueOf(local));
                val.append(",");
            } else {
                val.append(str);
                val.append(",");
            }
        }
         
        if(val.lastIndexOf(",") + 1 == val.length()) {
            val = val.deleteCharAt(val.length()-1);
        }
        
        return val.toString();
    }
     
    private static void getEmployee() {
        List<Employee> list = new ArrayList<>();
        
        list.add(new Employee(101, "Muzza", "Pune"));
        list.add(new Employee(102, "Muzza", "Pune"));
        list.add(new Employee(103, "Muzza", "Pune"));
        list.add(new Employee(104, "Muzza", "Pune"));
        list.add(new Employee(105, "Muzza", "Pune"));
        
        System.out.println(list.get(list.size()).id);
    }
    
    
    private static void getFromMap() {
    
        Map<String, String> map = new HashMap();
        map.put("A", "A1");
        map.put("B", "B1");
        map.put("C", "C1");
        map.put("D", "D1");
        
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));
        System.out.println("Value :" + map.get("KEY"));
    }
    
    
    public static void check(String name) {
    
        System.out.println("Value : " + name);
    }
}


class Employee {
    
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}