/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.rabbit;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;

/**
 *
 * @author M Mozammil
 */
public class RabbitConfig {
    
    private final static ConnectionFactory factory;
    
        static {
            
            factory = new ConnectionFactory();
            factory.setHost(Constants.HOSTNAME);
            System.out.println("Factory configured...");
        }
    
    public static Connection getConnection() throws IOException{
        return factory.newConnection();
    }
    
    public static Channel getChannel(Connection connection) throws IOException {
        Channel channel = connection.createChannel();
        
        channel.queueDeclare(Constants.QUEUE, false, false, false, null);       
       
        return channel;
    }
}
