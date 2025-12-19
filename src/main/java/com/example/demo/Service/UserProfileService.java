package com.example.demo.Service;

import com.example.demo.Entity.UserProfileEntity;

public interface UserProfileService {
    UserProfileEntity createUser(UserProfileEntity user);
    UserProfileEntity getUserById(Long id);
}
