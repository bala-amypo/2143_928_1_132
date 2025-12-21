package com.example.demo.Service;

import com.example.demo.Entity.UserEntity;

public interface UserService {
    UserEntity register(UserEntity user);
    UserEntity findByEmail(String email);
}
