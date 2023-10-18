package com.spring.springV2cleanStructure.repository;

import com.spring.springV2cleanStructure.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
//    Optional<Employee> findByIdAndDeletedAtNull(Long id);
}