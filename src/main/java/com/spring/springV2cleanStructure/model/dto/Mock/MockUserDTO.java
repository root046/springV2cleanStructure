package com.spring.springV2cleanStructure.model.dto.Mock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MockUserDTO {
        private Integer userId;
        private Integer id;
        private Boolean completed;
        private String title;
}
