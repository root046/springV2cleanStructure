
package com.spring.springV2cleanStructure.model.dto;

import lombok.Data;

//@Getter
//@Setter
//@ToString
//@Data  summarized all previous annotations
@Data
public class EmployeeReqDTO {
    private String username;
    private String fullName;
    private String password;
    private String email;

}
