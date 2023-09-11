package com.mycompany.concesionaria;


public class Concesionaria {
    
    public static void main(String[] args) {
        Logica logica = new Logica();

        // SALUDO
        logica.welcome();
        
        // MENÚ
        logica.menuPrincipal();
        logica.opciones();
    }   
}