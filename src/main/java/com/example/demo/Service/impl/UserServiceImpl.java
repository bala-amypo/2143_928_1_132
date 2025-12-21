package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.Service.UserService;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    public UserEntity register(UserEntity user) {
        if (repo.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }
        return repo.save(user);
    }

    public UserEntity findByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }
}
