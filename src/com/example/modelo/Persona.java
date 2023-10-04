package com.example.modelo;

public class Persona {
    private String nombre;
    private String email;
    private String movil;

    public Persona(String nombre, String email, String movil) {
        this.nombre = nombre;
        this.email = email;
        this.movil = movil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return   nombre;
    }
}
