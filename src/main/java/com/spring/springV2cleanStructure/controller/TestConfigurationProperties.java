package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.config.UserConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@Slf4j
public class TestConfigurationProperties {
    @Autowired
    UserConfiguration userConfiguration;
    @GetMapping("user-config")
    public void userConfig(){
        log.info("user profile url : {} ",this.userConfiguration.getProfile());
        log.info("user edit url : {} ",this.userConfiguration.getEdit());
        log.info("user supoort url : {} ",this.userConfiguration.getSupport());
    }
}
