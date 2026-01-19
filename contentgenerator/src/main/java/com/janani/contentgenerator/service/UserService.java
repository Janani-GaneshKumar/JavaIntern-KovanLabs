package com.janani.contentgenerator.service;


import com.janani.contentgenerator.dto.request.LoginRequest;
import com.janani.contentgenerator.dto.request.UserRegisterRequest;
import com.janani.contentgenerator.dto.response.JwtResponse;

public interface UserService {

    void register(UserRegisterRequest request);

    JwtResponse login(LoginRequest request);

    void becomeCurator(Long userId);
}
