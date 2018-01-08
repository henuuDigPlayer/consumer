package com.lindj.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lindongjie on 17/12/1.
 */
@FeignClient(name = "provider-lindj", fallback = UserClientHystrix.class)
public interface UserClient {
    @RequestMapping(value = "/user/say",method= RequestMethod.GET)
    public String sayHello();
}
