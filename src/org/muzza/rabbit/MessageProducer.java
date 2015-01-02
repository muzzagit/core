/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.rabbit;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import java.io.IOException;

/**
 *
 * @author M Mozammil
 */
public class MessageProducer {
    
    Connection connection;
    Channel channel;
    
    
    public void sendMesssage(String message) throws IOException {
        channel.basicPublish("", Constants.QUEUE, null, message.getBytes());
    }
    
    
    public void configure() throws IOException {
        connection = RabbitConfig.getConnection();
        channel  = RabbitConfig.getChannel(connection);
    }
    
    
    public void closeResource() throws IOException {
        connection.close();
        channel.close();
    }
    
}
