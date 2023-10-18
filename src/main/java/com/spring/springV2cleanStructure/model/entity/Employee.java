package com.spring.springV2cleanStructure.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder // to convert Entity to DTO, we will use it in MapperImp
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees") //this is a table name in database,
@Where(clause = "deleted_at is null") //when every time call this class,should This condition is always met, we usit for (soft delete)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long id;
    //@Column(name = "username") if the name  match with database column, we dont need to use it.
    private String username;
    @Column(name = "full_name")
    private String fullName;
    private String password;
    private String email;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    // this is a way to Implement DTO using static, but we will nit use it, we will use better way ( Mapper ), or we also can use mapStruct.
//    public static Employee toEntity(EmployeeReqDTO dto){
//        Employee employee = new Employee();
//        employee.setEmail(dto.getEmail());
//        employee.setUsername(dto.getUsername());
//        employee.setFullName(dto.getFullName());
//        employee.setPassword(dto.getPassword());
//        return employee;
//    }
}