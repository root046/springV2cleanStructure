package com.spring.springV2cleanStructure.model.mapper.impl;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import com.spring.springV2cleanStructure.model.mapper.CleanMapper;
import org.springframework.stereotype.Service;

@Service
public class CleanMapperImp implements CleanMapper {
//    @Override
//    public Employee toEntity(EmployeeReqDTO dto) {
////        Employee employee = new Employee();
////        employee.setEmail(dto.getEmail());
////        employee.setUsername(dto.getUsername());
////        employee.setFullName(dto.getFullName());
////        employee.setPassword(dto.getPassword());
////        return employee;
//
//        // to Enhance DTO we will use @Builder Annotation in Entity Class
//        return Employee.builder()
//                .username(dto.getUsername())
//                .email(dto.getEmail())
//                .fullName(dto.getFullName())
//                .password(dto.getPassword())
//                .build();
//
//    }
//
//    @Override
//    public EmployeeRespDTO toRespDTO(Employee entity) {
//        return EmployeeRespDTO.builder()
//                .username(entity.getUsername())
//                .fullName(entity.getFullName())
//                .email(entity.getEmail())
//                .build();
//    }
}
