\\ Aplicación principal de la aplicación
\\ Esta clase es la que se ejecuta al iniciar la aplicación
\\ Aquí se crea una instancia de UserServiceImpl y se pasa como parámetro a UserController
\\ UserController es el controlador de la aplicación, es el encargado de recibir las peticiones del usuario
\\ y delegarlas a UserServiceImpl para que se realicen las operaciones necesarias
package com.cloudevel.demo;

import com.cloudevel.demo.controller.UserController;
import com.cloudevel.demo.service.UserService;
import com.cloudevel.demo.service.UserServiceImpl;

public class App {
    \\ Método principal de la aplicación
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserController userController = new UserController(userService);
        userController.init();
    }
}