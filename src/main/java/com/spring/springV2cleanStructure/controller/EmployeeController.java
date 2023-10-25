package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.utilities.EmployeeUtility;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
    //    we have more one way to use Dependency Injection, by use @Autowirde and that the easy way,
    //    or we can use @REquiredArgsConstructor in the top of class, and put (final) when call classes, and this is more clean than @Annotation.
//    @Autowirde
//    private  EmployeeService employeeService;

    private final EmployeeService employeeService;
    private final EmployeeUtility employeeUtility;

    @GetMapping("/employee")
    public EmployeeDTO get(@RequestParam("id") Long id){
        return this.employeeService.get(id);
    }
    @PostMapping("/employee")
    public EmployeeRespDTO save(@RequestBody EmployeeReqDTO req){
    return this.employeeService.save(req);
    }
    @PutMapping ("/employee")
    public EmployeeRespDTO update(@RequestBody UpdateEmployeeReqDTO req){
        return (EmployeeRespDTO) this.employeeService.update(req);
    }
    @DeleteMapping ("/employee")
    public void delete(@RequestHeader Long id){
         this.employeeService.softDelete(id);
    }
}
