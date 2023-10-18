
package com.spring.springV2cleanStructure.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@ToString
//@Data  summarized all previous annotations
// and here we just return what we need to return in the Response, and ofcourse we wiil not return any secret data ,
// like ID Or Passwors or Token.
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRespDTO {
    private String username;
    private String fullName;
//    private String password; we will never return secret data.
    private String email;
}
