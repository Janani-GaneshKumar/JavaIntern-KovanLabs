package com.janani.contentgenerator.controller;

import com.janani.contentgenerator.dto.request.LoginRequest;
import com.janani.contentgenerator.dto.request.UserRegisterRequest;
import com.janani.contentgenerator.dto.response.JwtResponse;
import com.janani.contentgenerator.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
/*
Marks this class as a REST controller.
It combines @Controller and @ResponseBody,meaning all methods return JSON or plain text directly in the HTTP response
*/
@RequestMapping("/api/users")
/*
Sets the base URL path for all endpoints in this controller.
 */
@RequiredArgsConstructor
/*
From Lombok Library.
Creates a constructor automatically for final fields.
Here, it injects UserService into the controller without needing @Autowired.
*/
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody UserRegisterRequest request) {
        userService.register(request);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }

    @PutMapping("/{id}/become-curator")
    public String becomeCurator(@PathVariable Long id) {
        userService.becomeCurator(id);
        return "User is now a curator";
    }
}
