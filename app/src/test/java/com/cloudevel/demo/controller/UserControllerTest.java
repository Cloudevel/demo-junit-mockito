package com.cloudevel.demo.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cloudevel.demo.model.User;
import com.cloudevel.demo.service.UserService;

import spark.Request;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    UserService userService;

    @Test
    void testValidateEmail_Valid() {
        when(userService.validateEmail(any(User.class))).thenReturn(true);

        UserController controller = new UserController(userService);

        String result = controller.validateEmail(createRequestWithQueryParam("test@example.com"), null);

        assertTrue(result.contains("true"));
    }

    @Test
    void testValidateEmail_Invalid() {
        when(userService.validateEmail(any(User.class))).thenReturn(false);

        UserController controller = new UserController(userService);

        String result = controller.validateEmail(createRequestWithQueryParam("invalid-email"), null);

        assertTrue(result.contains("false"));
    }

    private Request createRequestWithQueryParam(String email) {
        Request request = mock(Request.class);
        when(request.queryParams("email")).thenReturn(email);
        return request;
    }
}
