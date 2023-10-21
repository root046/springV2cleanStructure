package com.spring.springV2cleanStructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user-config")
@Data
public class UserConfiguration {
    private String profile;
    private String edit;
    private String support;
}









