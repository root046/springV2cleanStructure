package com.spring.springV2cleanStructure.controller.V4;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.V4.EmployeeReqV4DTO;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.service.V4.EmployeeServiceV4;
import com.spring.springV2cleanStructure.utilities.EmployeeUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
