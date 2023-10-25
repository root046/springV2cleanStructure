package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.utilities.EmployeeUtility;
import com.spring.springV2cleanStructure.utilities.PasswordGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
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
        //        log.info("Employee ID : " + id); //we will not use +
        log.info("Employee ID : {} ", id); // {} mean parameter
        return this.employeeUtility.getEmployeeDetails(id);
    }

    @PostMapping("/employee")
    public EmployeeRespDTO save(@RequestBody EmployeeReqDTO req, HttpServletRequest httpServletRequest){// <= @RequestHeader("correlationId") String correlationId || we use correlationId to trace logs,and put id for every id, and we sendit in header if front-end sendet
        String correlationId = UUID.randomUUID().toString();
        //        log.info("save employee request"); //we will not use +
        log.info("user ip : {} ",httpServletRequest.getRemoteAddr());
        log.info("coming request : {} ",httpServletRequest);
        log.info("save employee request : {} the user fullName : {} " , req , req.getFullName()); // {} mean parameter
        log.info("New request coming with request details : {} correlationId : {} ", req ,correlationId);
//        log.debug("save employee request : {} the user password : {} " , req , req.getPassword()); // {} mean parameter , log.debug will run if we put logging:level.root=debug in the configuration in application.yaml or application-{env).yaml
        return this.employeeService.save(req,correlationId);
    }
}
