package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.model.dto.Mock.MockUserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
@Slf4j // to show log
public class RealUserController {
    @Value("${users.get-user-info.url}")// take the value from application-dev.yaml OR application-prod.yaml
    private String getUserInfo;
    @GetMapping("/user")
    public MockUserDTO user(@RequestParam Integer id){
        RestTemplate restTemplate = new RestTemplate();
        log.info("getting user details from url :"+getUserInfo);
        MockUserDTO forObject = restTemplate.getForObject(getUserInfo + id, MockUserDTO.class);
        return forObject;
    }
}
