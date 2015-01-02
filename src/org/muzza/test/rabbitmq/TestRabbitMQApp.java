/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.muzza.test.rabbitmq;

import java.io.IOException;
import java.util.Random;
import org.muzza.rabbit.MessageProducer;
import org.muzza.rabbit.MessageReceiver;
import org.muzza.rabbit.RabbitConfig;

/**
 *
 * @author M Mozammil
 */
public class TestRabbitMQApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MessageProducer producer = new MessageProducer();
        MessageReceiver receiver = new MessageReceiver();
        Random random = new Random(101);
        try {
            
            producer.configure();
            producer.sendMesssage("Message one");
            
            
            receiver.configure();
            receiver.receive();
            
            
            for(int i =  0; i<20; i++) {
                Thread.sleep(3000);
                producer.sendMesssage("Message # "+ random.nextInt(1000));
            }
            
        }catch(IOException exception) {
            exception.printStackTrace();
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
