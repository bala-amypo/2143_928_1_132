package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Service.UserProfileService;
import com.example.demo.Entity.UserProfileEntity;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/user-profiles")
public class UserProfileController {

    private final UserProfileService service;

    public UserProfileController(UserProfileService service) {
        this.service = service;
    }

    @PostMapping
    public UserProfileEntity create(@Valid @RequestBody UserProfileEntity user) {
        return service.createUser(user);
    }

    @GetMapping("/{id}")
    public UserProfileEntity getById(@PathVariable Long id) {
        return service.getUserById(id);
    }
}
