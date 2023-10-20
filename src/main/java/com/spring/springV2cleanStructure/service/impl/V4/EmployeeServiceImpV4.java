package com.spring.springV2cleanStructure.service.impl.V4;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.V4.EmployeeReqV4DTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import com.spring.springV2cleanStructure.model.mapper.CleanMapper;
import com.spring.springV2cleanStructure.model.mapper.EmployeeMapperUsingMapSrtuct;
import com.spring.springV2cleanStructure.repository.EmployeeRepo;
import com.spring.springV2cleanStructure.service.V4.EmployeeServiceV4;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpV4 implements EmployeeServiceV4 {
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapperUsingMapSrtuct employeeMapper;
    private final CleanMapper cleanMapper;
    @Override
    public EmployeeRespDTO save(EmployeeReqV4DTO req) {
            Employee employee = this.employeeMapper.toEntity(req);
            employee.setCreatedAt(LocalDateTime.now());
            Employee savedEmployee = this.employeeRepo.save(employee);
            System.out.println((req));
            return this.employeeMapper.toRespDTO(savedEmployee);
    }
}
