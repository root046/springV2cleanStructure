package com.spring.springV2cleanStructure.service.impl;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import com.spring.springV2cleanStructure.model.mapper.EmployeeMapperUsingMapSrtuct;
import com.spring.springV2cleanStructure.repository.EmployeeRepo;
import com.spring.springV2cleanStructure.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    //    we have more one way to use Dependency Injection, by use @Autowirde and that the easy way,
    //    or we can use @REquiredArgsConstructor in the top of class, and put (final) when call classes, and this is more clean than @Annotation.
    //    @Autowired
//    private EmployeeReqDTO employeeReqDTO;
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapperUsingMapSrtuct employeeMapper;
    @Override
    public EmployeeRespDTO save(EmployeeReqDTO req) {
            Employee employee = this.employeeMapper.toEntity(req);
            Employee savedEmployee = this.employeeRepo.save(employee);
            System.out.println((req));
            return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public String getEmployeeDetailsAsStr(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        if (byId.isPresent()) {
            return byId.get().getFullName() + " | " + byId.get().getEmail();
        } else {
            return " the user not found";
        }
    }

    @Override
    public EmployeeRespDTO update(UpdateEmployeeReqDTO req) {
        Employee entity = this.employeeMapper.toEntity(req);
        Employee savedEntity = this.employeeRepo.save(entity); // in spring when we want to update, we will use (save) becuse spring will know the spicifc user by the id, and save method use for both save & update operation.
        return this.employeeMapper.toRespDTO(savedEntity);
    }

}
