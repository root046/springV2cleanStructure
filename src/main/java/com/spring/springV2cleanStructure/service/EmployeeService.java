package com.spring.springV2cleanStructure.service;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
//     EmployeeRespDTO save(EmployeeReqDTO req,String correlationId);
     EmployeeRespDTO save(EmployeeReqDTO req);
     EmployeeRespDTO saveV11(EmployeeReqDTO req);
     EmployeeDTO get(Long id);
     String getEmployeeDetailsAsStr(Long id);
     Object update(UpdateEmployeeReqDTO req);
     String delete(Long id);
     void softDelete(Long id);

}
