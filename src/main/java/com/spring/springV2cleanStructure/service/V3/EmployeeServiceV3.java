package com.spring.springV2cleanStructure.service.V3;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.V3.EmployeeReqV3DTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeServiceV3 {
     EmployeeRespDTO save(EmployeeReqV3DTO req) throws Exception;

     EmployeeRespDTO saveV301(EmployeeReqV3DTO req) throws Exception;
}
