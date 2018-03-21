package com.lindj.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by lindongjie on 18/3/9.
 */

@Service
@RabbitListener(queues = "hello")
public class RabbitConsumerService {


    @RabbitHandler
    public void getMessage(String message){
        System.out.println(message);
    }



}
