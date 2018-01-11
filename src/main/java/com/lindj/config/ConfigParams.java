package com.lindj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by lindongjie on 18/1/11.
 */
@Component
@RefreshScope
@ConfigurationProperties(prefix = "url")
public class ConfigParams {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
