package com.spring.springV2cleanStructure.model.mapper;

import com.spring.springV2cleanStructure.model.dto.EmployeeReqDTO;
import com.spring.springV2cleanStructure.model.dto.EmployeeRespDTO;
import com.spring.springV2cleanStructure.model.entity.Employee;
import org.mapstruct.Mapper;

// the MapStruct (@Mapper Annotation) will auto implement,if we use it we need to ** re-build project ** .
@Mapper(componentModel = "spring")
public interface EmployeeMapperUsingMapSrtuct {
    // ReqDTO => Entity
    Employee toEntity(EmployeeReqDTO req);

    // Entity => RespDTO
    EmployeeRespDTO toRespDTO(Employee savedEmployee);
}
