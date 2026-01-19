package com.janani.contentgenerator.service.impl;

import com.janani.contentgenerator.dto.request.LoginRequest;
import com.janani.contentgenerator.dto.request.UserRegisterRequest;
import com.janani.contentgenerator.dto.response.JwtResponse;
import com.janani.contentgenerator.entity.User;
import com.janani.contentgenerator.repository.UserRepository;
import com.janani.contentgenerator.security.JwtUtil;
import com.janani.contentgenerator.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Override
    public void register(UserRegisterRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setCurator(false);

        userRepository.save(user);
    }

    @Override
    public JwtResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid email"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = jwtUtil.generateToken(user.getEmail());
        return new JwtResponse(token);
    }

    @Override
    public void becomeCurator(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setCurator(true);
        userRepository.save(user);
    }
}
