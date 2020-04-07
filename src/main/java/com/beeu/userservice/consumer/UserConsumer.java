package com.beeu.userservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @RabbitListener(queues="create-user")
    public void createUser(byte[] message) {
        String msg = new String(message);
        System.out.println("Received a new message...");
        System.out.println(msg);
    }

    @RabbitListener(queues="update-user")
    public void updateUser(byte[] message) {
        String msg = new String(message);
        System.out.println("Received a new message...");
        System.out.println(msg);
    }

    @RabbitListener(queues="delete-user")
    public void deleteUser(byte[] message) {
        String msg = new String(message);
        System.out.println("Received a new message...");
        System.out.println(msg);
    }

    @RabbitListener(queues="activate-user")
    public void activateUser(byte[] message) {
        String msg = new String(message);
        System.out.println("Received a new message...");
        System.out.println(msg);
    }

    @RabbitListener(queues="deactivate-user")
    public void deactivateUser(byte[] message) {
        String msg = new String(message);
        System.out.println("Received a new message...");
        System.out.println(msg);
    }
}
