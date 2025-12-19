package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.Service.UserProfileService;
import com.example.demo.Repository.UserProfileRepo;
import com.example.demo.Entity.UserProfileEntity;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepo repo;

    public UserProfileServiceImpl(UserProfileRepo repo) {
        this.repo = repo;
    }

    public UserProfileEntity createUser(UserProfileEntity user) {
        return repo.save(user);
    }

    public UserProfileEntity getUserById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("UserProfile not found"));
    }
}
