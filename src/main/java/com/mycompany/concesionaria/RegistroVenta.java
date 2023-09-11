package com.mycompany.concesionaria;


public class RegistroVenta {
    
    private int monto;
    private String fecha;
    private int codigo;
    private Comprador comprador;

    
    // CONSTRUCTORES
    public RegistroVenta() {
    }

    public RegistroVenta(int monto, String fecha, int codigo, Comprador comprador) {
        this.monto = monto;
        this.fecha = fecha;
        this.codigo = codigo;
        this.comprador = comprador;
    }


    // SETTER AND GETTER
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    
    
    @Override
    public String toString() {
        return "RegistroVenta{" + "monto=" + monto + ", fecha=" + fecha + ", codigo=" + codigo + ", comprador=" + comprador + '}';
    }  
    
}
