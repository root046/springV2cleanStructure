package com.spring.springV2cleanStructure.service;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface EmployeeService {
     EmployeeRespDTO save(EmployeeReqDTO req);
     String getEmployeeDetailsAsStr(Long id);
     EmployeeRespDTO update(UpdateEmployeeReqDTO req);
}
