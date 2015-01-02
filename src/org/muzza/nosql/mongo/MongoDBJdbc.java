/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.nosql.mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 *
 * @author M Muzzammil
 */
public class MongoDBJdbc {
    public static void main(String[] args) {
        try {
            MongoClient client = new MongoClient("localhost", 27017);
            
            DB db = client.getDB("test");
            System.out.println("COnnection to Mongo DB success...");
            boolean auth = db.authenticate("test", "test".toCharArray());
            
            System.out.println("Authentication : " + auth);
        } catch (Exception e) {
        }
    }
 
}
