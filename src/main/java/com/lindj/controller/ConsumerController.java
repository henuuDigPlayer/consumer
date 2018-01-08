package com.lindj.controller;

import com.lindj.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lindongjie on 17/12/1.
 */

@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @Autowired
    private UserClient userClient;
    @RequestMapping(value = "/get")
    public Object getConsumer(){
        return this.userClient.sayHello();
    }
}
