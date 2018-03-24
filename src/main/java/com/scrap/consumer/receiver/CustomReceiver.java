package com.scrap.consumer.receiver;

import com.scrap.consumer.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomReceiver {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues="cola_correo")
    public void recievedMessage(String msg) {
        System.out.println("Recibi el mensaje: " + msg);
        emailService.sendSimpleMessage("rauccapuclla@gmail.com@gmail.com",msg,msg);
    }
}

