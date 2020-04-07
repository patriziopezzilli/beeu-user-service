package com.beeu.userservice.consumer;


import com.beeu.userservice.dto.User;
import com.beeu.userservice.service.UserLogicService;
import com.beeu.userservice.utils.InternalKeyValidator;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @Autowired
    private UserLogicService userLogicService;

    @RabbitListener(queues = "create-user")
    public void createUser(User message, @Header("bee-internal-key") String beekey) {
        InternalKeyValidator.validate(beekey);
        System.out.println("Received a new user...");
        userLogicService.saveUser(message);
    }

    @RabbitListener(queues = "update-user")
    public void updateUser(User message, @Header("bee-internal-key") String beekey) {
        InternalKeyValidator.validate(beekey);
        System.out.println("Received a new user update...");
        userLogicService.updateUser(message);
    }

    @RabbitListener(queues = "activate-user")
    public void activateUser(User message, @Header("bee-internal-key") String beekey) {
        InternalKeyValidator.validate(beekey);
        System.out.println("Received a user activate...");
        userLogicService.activateUser(message.getId());
    }

    @RabbitListener(queues = "deactivate-user")
    public void deactivateUser(User message, @Header("bee-internal-key") String beekey) {
        InternalKeyValidator.validate(beekey);
        System.out.println("Received a user deactivate...");
        userLogicService.deactivateUser(message.getId());
    }
}
