package com.janani.contentgenerator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponse {

    private Integer userId;
    private String name;
    private String email;
    private Boolean isCurator;
}
