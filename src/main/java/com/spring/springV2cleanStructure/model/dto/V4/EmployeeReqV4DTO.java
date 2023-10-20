
package com.spring.springV2cleanStructure.model.dto.V4;

import lombok.Data;

import javax.validation.constraints.*;

// using Java Bean Validation
@Data
public class EmployeeReqV4DTO {
    @NotNull(message = "Please enter username")
    @Size(min = 5,max = 10,message = "username should be between 5 to 10 characters")
    private String username;

    @NotNull(message = "Please enter fullName")
    @Size(min = 5,message = "fullName should be minimum 5 characters")
    @Pattern(regexp = "^[A-Z]+$", message = "enter fullName in CAPITAL characters")
    private String fullName;

    @NotNull(message = "enter strong password from 7 to 20 characters")
    @Size(min = 7,max = 20,message = "password should be between 7 to 20 characters")
    private String password;

    @Email(message = "Please enter valid Email")
    @NotNull(message = "Please enter Email")
    private String email;

}
