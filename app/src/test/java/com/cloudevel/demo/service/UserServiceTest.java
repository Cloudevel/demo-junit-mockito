package com.cloudevel.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cloudevel.demo.model.User;

class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl();
    }

    @Test
    void testValidEmail() {
        User user = new User("test@example.com");
        assertTrue(userService.validateEmail(user));
    }

    @Test
    void testInvalidEmail() {
        User user = new User("invalid-email");
        assertFalse(userService.validateEmail(user));
    }
}
