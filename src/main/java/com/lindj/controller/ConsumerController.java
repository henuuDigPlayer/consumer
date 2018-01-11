package com.lindj.controller;

import com.lindj.client.UserClient;
import com.lindj.config.ConfigParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lindongjie on 17/12/1.
 */

@RestController
@RequestMapping(value = "/consumer")
@RefreshScope
public class ConsumerController {

    @Autowired
    private ConfigParams configParams;

    @Autowired
    private UserClient userClient;
    @RequestMapping(value = "/get")
    public Object getConsumer(){
        return this.userClient.sayHello();
    }
    @RequestMapping(value = "/get/length")
    public Object getUrlLength(){
        return this.userClient.getLength();
    }

    @RequestMapping(value = "/get/value")
    public Object getValue(){
        return this.configParams.getUrl();
    }
}
