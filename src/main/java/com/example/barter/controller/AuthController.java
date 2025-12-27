package com.example.barter.controller;

import com.example.barter.model.User;
import com.example.barter.security.JwtUtil;
import com.example.barter.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    public AuthController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        User dbUser = userService.getUserByEmail(user.getEmail());

        String token = jwtUtil.generateToken(
                dbUser.getEmail(),
                dbUser.getRole(),
                dbUser.getId()
        );

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
