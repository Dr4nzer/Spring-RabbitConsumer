package com.scrap.consumer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);

    }

}
