package com.example.demo.Service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Service.UserService;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserEntity register(UserEntity user) {

        if (repo.findByEmail(user.getEmail()).isPresent()) {
            // 🔴 MUST MATCH QUESTION EXACTLY
            throw new RuntimeException("Email already exists");
        }

        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("UserProfile not found"));
    }
}
