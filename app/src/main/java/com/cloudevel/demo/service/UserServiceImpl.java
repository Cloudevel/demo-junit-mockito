package com.cloudevel.demo.service;

import com.cloudevel.demo.model.User;

public class UserServiceImpl implements UserService {
    @Override
    public boolean validateEmail(User user) {
        // Implement your email validation logic here
        return user.getEmail().contains("@");
    }
}
