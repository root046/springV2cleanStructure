package com.spring.springV2cleanStructure.controller.V4;

import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.V4.EmployeeReqV4DTO;
import com.spring.springV2cleanStructure.service.V4.EmployeeServiceV4;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees/v4")
@RequiredArgsConstructor
public class EmployeeControllerV4 {
    private final EmployeeServiceV4 employeeServiceV4;
//    Java Bean Validation
    @PostMapping(value = "")
    public EmployeeRespDTO save(@RequestBody @Valid EmployeeReqV4DTO req){
    return this.employeeServiceV4.save(req);
    }
}
