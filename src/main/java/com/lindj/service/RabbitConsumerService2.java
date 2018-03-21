package com.lindj.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by lindongjie on 18/3/9.
 */
@Service
@RabbitListener(queues = "topic.messages")
public class RabbitConsumerService2 {

    @RabbitHandler
    public void getMessage(Object object){
        System.out.println(JSONObject.toJSONString(object));
    }
}
