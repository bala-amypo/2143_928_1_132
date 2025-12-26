package com.example.barter.controller;

import com.example.barter.model.User;
import com.example.barter.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{email}")
    public User getUser(@PathVariable String email) {
        return service.getUserByEmail(email);
    }
}
