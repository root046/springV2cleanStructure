package com.spring.springV2cleanStructure.model.mapper;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface CleanMapper {
    Employee toEntity(EmployeeReqDTO dto);
    EmployeeRespDTO toRespDTO(Employee entity);
    Employee toEntity(UpdateEmployeeReqDTO req);
}
