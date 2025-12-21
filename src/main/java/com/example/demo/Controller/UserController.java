package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.UserService;
import com.example.demo.Entity.UserEntity;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity user) {
        return service.register(user);
    }

    @GetMapping("/email/{email}")
    public UserEntity findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
}
