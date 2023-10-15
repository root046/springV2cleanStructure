package com.spring.springV2cleanStructure.utilities;

import com.spring.springV2cleanStructure.model.entity.Employee;
import com.spring.springV2cleanStructure.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeUtility {
    private final EmployeeService employeeService;

    public String getEmployeeDetails(Long id){
        return this.employeeService.getEmployeeDetailsAsStr(id);
    }
}
