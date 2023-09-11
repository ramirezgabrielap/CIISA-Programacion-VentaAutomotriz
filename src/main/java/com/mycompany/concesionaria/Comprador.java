package com.mycompany.concesionaria;


public class Comprador {
    
    private String nombre;
    private String apellido;
    private int rut;

    // CONSTRUCTORES
    public Comprador() {
    }

    public Comprador(String nombre, String apellido, int rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }


    // SETTER AND GETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    
    
    
    @Override
    public String toString() {
        return "Comprador{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + '}';
    }   
}
