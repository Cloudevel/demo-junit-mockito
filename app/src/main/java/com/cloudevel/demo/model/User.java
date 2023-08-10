package com.cloudevel.demo.model;

\\ Clase que representa a un usuario

public class User {
    private String email;
    \\ Constructor vacío

    public User() {
    }

    public User(String email) {
        \\ Constructor que recibe el correo electrónico del usuario
        this.email = email;
    }

    public String getEmail() {
        \\ Método que devuelve el correo electrónico del usuario
        return email;
    }

    public void setEmail(String email) {
        \\ Método que establece el correo electrónico del usuario
        this.email = email;
    }
}
