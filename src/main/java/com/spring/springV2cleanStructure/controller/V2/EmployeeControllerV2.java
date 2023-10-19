package com.spring.springV2cleanStructure.controller.V2;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.utilities.EmployeeUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees/v2")
@RequiredArgsConstructor
public class EmployeeControllerV2 {
    private final EmployeeService employeeService;
    private final EmployeeUtility employeeUtility;

    @GetMapping(value = "")
    public EmployeeDTO get(@RequestParam("id") Long id){
        return this.employeeService.get(id);
    }
    @PostMapping(value = "")
    public EmployeeRespDTO save(@RequestBody EmployeeReqDTO req){
        return this.employeeService.save(req);
    }
    @PostMapping(value = "",params = "v=1.1.0")
    public EmployeeRespDTO saveV11(@RequestBody EmployeeReqDTO req){
        return this.employeeService.saveV11(req);
    }
    @PutMapping (value = "")
    public EmployeeRespDTO update(@RequestBody UpdateEmployeeReqDTO req){
        return (EmployeeRespDTO) this.employeeService.update(req);
    }
    @DeleteMapping (value = "")
    public void delete(@RequestHeader Long id){
        this.employeeService.softDelete(id);
    }
}
