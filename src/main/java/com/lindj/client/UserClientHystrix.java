package com.lindj.client;

import org.springframework.stereotype.Component;

/**
 * Created by lindongjie on 17/12/2.
 */
@Component
public class UserClientHystrix implements UserClient {
    @Override
    public String sayHello() {
        return "require hello world is failed";
    }
}
