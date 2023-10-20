package com.spring.springV2cleanStructure.service.V4;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.V4.EmployeeReqV4DTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeServiceV4 {
     EmployeeRespDTO save(EmployeeReqV4DTO req);

}
