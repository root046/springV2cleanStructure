package com.spring.springV2cleanStructure.service.impl;

import com.spring.springV2cleanStructure.model.dto.EmployeeDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.dto.UpdateEmployeeReqDTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import com.spring.springV2cleanStructure.model.mapper.CleanMapper;
import com.spring.springV2cleanStructure.model.mapper.EmployeeMapperUsingMapSrtuct;
import com.spring.springV2cleanStructure.repository.EmployeeRepo;
import com.spring.springV2cleanStructure.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    //    we have more one way to use Dependency Injection, by use @Autowirde and that the easy way,
    //    or we can use @REquiredArgsConstructor in the top of class, and put (final) when call classes, and this is more clean than @Annotation.
    //    @Autowired
//    private EmployeeReqDTO employeeReqDTO;
    private final EmployeeRepo employeeRepo;
    private final EmployeeMapperUsingMapSrtuct employeeMapper;
    private final CleanMapper cleanMapper;
    @Override
    public EmployeeRespDTO save(EmployeeReqDTO req) {
            Employee employee = this.employeeMapper.toEntity(req);
            employee.setCreatedAt(LocalDateTime.now());
            Employee savedEmployee = this.employeeRepo.save(employee);
            System.out.println((req));
            return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public EmployeeRespDTO saveV11(EmployeeReqDTO req) {
        Employee employee = this.employeeMapper.toEntity(req);
        employee.setToken(UUID.randomUUID().toString());
        employee.setCreatedAt(LocalDateTime.now());
        Employee savedEmployee = this.employeeRepo.save(employee);
        System.out.println((req));
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public EmployeeDTO get(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        return this.employeeMapper.toDTO(byId.get());
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
        Optional<Employee> byId = this.employeeRepo.findById(req.getId());
        Employee savedEntity= null;
        if (byId.isPresent()) {
            System.out.println(byId);
            entity.setUpdatedAt(LocalDateTime.now());
            savedEntity = this.employeeRepo.save(entity);
            System.out.println(savedEntity);
            return this.employeeMapper.toRespDTO(savedEntity);
        } else {
            System.out.println(savedEntity);
            return this.employeeMapper.toRespDTO(savedEntity);
        }
    }

    @Override
    public String delete(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        if (byId.isPresent()) {
            this.employeeRepo.deleteById(id);
            return "the employee : "+byId.get().getFullName()+" was successfully deleted ..";
        }else {
            return "the user not found";
        }
    }

    @Override
    public void softDelete(Long id) {
        Optional<Employee> byId = this.employeeRepo.findById(id);
        byId.get().setDeletedAt(LocalDateTime.now());
        this.employeeRepo.save(byId.get());
    }

}
