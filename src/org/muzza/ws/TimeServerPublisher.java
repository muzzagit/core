/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.ws;

import javax.xml.ws.Endpoint;

/**
 *
 * @author M Mozammil
 */
public class TimeServerPublisher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Publishing webservices...");
            Endpoint.publish("http://localhost:9776/ts", new TimeServerImpl());
            System.out.println("Webservice published successfully...");
    }

}
