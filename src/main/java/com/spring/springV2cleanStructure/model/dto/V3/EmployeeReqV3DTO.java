
package com.spring.springV2cleanStructure.model.dto.V3;

import lombok.Data;

//@Getter
//@Setter
//@ToString
//@Data  summarized all previous annotations
@Data
public class EmployeeReqV3DTO {
    private String username;
    private String fullName;
    private String password;
    private String email;

}
