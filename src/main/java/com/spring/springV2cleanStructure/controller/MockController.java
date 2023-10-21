package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.model.dto.Mock.MockUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mock-data")
public class MockController {
    @GetMapping("/user")
    public MockUserDTO user(@RequestParam Integer id){
        return MockUserDTO.builder()
                .userId(id)
                .id(100)
                .completed(false)
                .title("just for testing..")
                .build();
    }
}
