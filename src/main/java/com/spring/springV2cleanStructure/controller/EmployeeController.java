package com.spring.springV2cleanStructure.controller;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.utilities.EmployeeUtility;
import com.spring.springV2cleanStructure.utilities.PasswordGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Parser;

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

    @GetMapping("/test-get")
    public String getEmployee(){
        return "test..";
    }

    @GetMapping("/get-employee-name-requestParam")
    public String getEmployeeName(@RequestParam(name = "name") String name){

        return name;
    }
    @GetMapping("/get-employee-name-PathVariable/{PathVariable}")
    public String getEmployeeId(@PathVariable(name = "PathVariable") String PathVariable){
        return PathVariable;
    }

    @PostMapping("/save-employee")
    public EmployeeRespDTO save(@RequestBody EmployeeReqDTO req){
    return this.employeeService.save(req);
    }

    @GetMapping("/get-password")
    public String getRandomPassword(){
        return PasswordGenerator.generate();
    }

    @GetMapping("/get-employee-details/{id}")
    public String getEmployeeDetails(@PathVariable("id") Long id){
        return this.employeeUtility.getEmployeeDetails(id);
    }

    @PostMapping("/update-employee")
    public EmployeeRespDTO update(@RequestBody UpdateEmployeeReqDTO req){
        return this.employeeService.update(req);
    }
    @PostMapping("/delete-employee")
    public String deleteEmployee(@RequestHeader Long id){
        return this.employeeService.delete(id);
    }
}
