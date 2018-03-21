package com.lindj.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by lindongjie on 18/3/9.
 */

@Service
@RabbitListener(queues = "topic.message")
public class RabbitConsumerService1 {
}
