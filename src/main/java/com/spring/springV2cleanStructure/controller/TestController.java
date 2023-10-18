package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.utilities.EmployeeUtility;
import com.spring.springV2cleanStructure.utilities.PasswordGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    //    we have more one way to use Dependency Injection, by use @Autowirde and that the easy way,
    //    or we can use @REquiredArgsConstructor in the top of class, and put (final) when call classes, and this is more clean than @Annotation.
//    @Autowirde
//    private  EmployeeService employeeService;

    private final EmployeeService employeeService;
    private final EmployeeUtility employeeUtility;

    @GetMapping("/test-get")
    public String getEmployee(){
        return "test..";
    }

    @GetMapping("/get-password")
    public String getRandomPassword(){
        return PasswordGenerator.generate();
    }

    @GetMapping("/employee")//return string
    public String getEmployeeDetails(@RequestParam("id") Long id){
        return this.employeeUtility.getEmployeeDetails(id);
    }
}
