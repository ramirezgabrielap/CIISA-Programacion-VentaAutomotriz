
package com.mycompany.concesionaria;


public class Vehiculo {
    private int codigo;
    private String marca;
    private String tipo;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String patente;
    private int monto;

    
    // CONSTRUCTORES
    public Vehiculo() {
    }
    
    
    public Vehiculo(int codigo, String marca, String tipo, String modelo, int anio, int kilometraje, String patente, int monto) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.patente = patente;
        this.monto = monto;
    }

    
    // GETTER AND SETTER
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    
    // IMPRIMIR
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", anio=" + anio + ", kilometraje=" + kilometraje + ", patente=" + patente + ", monto=" + monto + '}';
    }

    
    

        
    
    
    
    
    
    
}
