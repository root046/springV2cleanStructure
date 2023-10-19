package com.spring.springV2cleanStructure.service.impl.V3;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.V3.EmployeeReqV3DTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import com.spring.springV2cleanStructure.model.mapper.CleanMapper;
import com.spring.springV2cleanStructure.model.mapper.EmployeeMapperUsingMapSrtuct;
import com.spring.springV2cleanStructure.repository.EmployeeRepo;
import com.spring.springV2cleanStructure.service.EmployeeService;
import com.spring.springV2cleanStructure.service.V3.EmployeeServiceV3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpV3 implements EmployeeServiceV3 {
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapperUsingMapSrtuct employeeMapper;
    private final CleanMapper cleanMapper;
    @Override
    public EmployeeRespDTO save(EmployeeReqV3DTO req) throws Exception {
        if(req.getEmail() == null){
            throw new Exception("email cannot be null");
        }
        Employee employee = this.employeeMapper.toEntity(req);
        employee.setCreatedAt(LocalDateTime.now());
        Employee savedEmployee = this.employeeRepo.save(employee);
        System.out.println((req));
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public EmployeeRespDTO saveV301(EmployeeReqV3DTO req) throws Exception {
        if(req.getEmail() == null){
            throw new Exception("email not correct !!");
        }
        Employee employee = this.employeeMapper.toEntity(req);
        employee.setCreatedAt(LocalDateTime.now());
        Employee savedEmployee = this.employeeRepo.save(employee);
        System.out.println((req));
        return this.employeeMapper.toRespDTO(savedEmployee);
    }
}
