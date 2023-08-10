package com.cloudevel.demo.controller;

import static spark.Spark.*;

import com.cloudevel.demo.model.User;
import com.cloudevel.demo.service.UserService;

import spark.Request;
import spark.Response;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void init() {
        get("/validate-email", (req, res) -> validateEmail(req, res));
    }

    public String validateEmail(Request req, Response res) {
        String email = req.queryParams("email");
        User user = new User(email);
        boolean isValid = userService.validateEmail(user);
        return "Email validation result: " + isValid;
    }
}
