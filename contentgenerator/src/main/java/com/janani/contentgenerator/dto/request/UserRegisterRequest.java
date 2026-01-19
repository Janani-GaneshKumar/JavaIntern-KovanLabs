package com.janani.contentgenerator.dto.request;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String name;
    private String email;
    private String password;
}
