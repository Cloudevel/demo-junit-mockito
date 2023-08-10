package com.cloudevel.demo;

import com.cloudevel.demo.controller.UserController;
import com.cloudevel.demo.service.UserService;
import com.cloudevel.demo.service.UserServiceImpl;

public class App {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserController userController = new UserController(userService);
        userController.init();
    }
}