package com.example.barter.service;

import com.example.barter.model.User;

public interface UserService {

    User register(User user);

    User getUserByEmail(String email);
}
