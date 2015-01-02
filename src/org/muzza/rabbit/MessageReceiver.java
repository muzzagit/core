/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.rabbit;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M Mozammil
 */
public class MessageReceiver implements Runnable{
    
    Connection connection;
    Channel channel;
    
    public void receive() throws IOException, InterruptedException {
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
        
        Runnable task = this;
        new Thread(task).start();
    }
    
    
    public void configure() throws IOException {
        connection = RabbitConfig.getConnection();
        channel  = RabbitConfig.getChannel(connection);
        channel.queueDeclare(Constants.QUEUE, false, false, false, null);
    }
    
    
    public void closeResource() throws IOException {
        connection.close();
        channel.close();
    }

    @Override
    public void run(){
        System.out.println("task executed");
        try {
            QueueingConsumer consumer = new QueueingConsumer(channel);
            channel.basicConsume(Constants.QUEUE, true, consumer);
            
            while (true) {
                QueueingConsumer.Delivery delivery = consumer.nextDelivery();
                String message = new String(delivery.getBody());
                System.out.println(" [x] Received '" + message + "'");
            }
        } catch (IOException ex) {
            Logger.getLogger(MessageReceiver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(MessageReceiver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ShutdownSignalException ex) {
            Logger.getLogger(MessageReceiver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConsumerCancelledException ex) {
            Logger.getLogger(MessageReceiver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
