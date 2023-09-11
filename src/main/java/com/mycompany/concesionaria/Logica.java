package com.mycompany.concesionaria;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Logica {
    private BaseDeDatos basedatos;

    public Logica() {
        basedatos = new BaseDeDatos();
        basedatos.crearVehiculos();
        basedatos.crearVentas();
                
    }
    
   
    public void welcome() {
        System.out.println("---------------------------------------------");
        System.out.println("Bienvenido a CONCESIONARIA DE VEHÍCULOS CIISA");

    }
    
    
    public void menuPrincipal() {
        System.out.println("---------------------------------------------");
        System.out.println("Escoja opción a utilizar: ");
        System.out.println("1.- VER LISTADO DE VEHICULOS");
        System.out.println("2.- COMPRAR VEHICULO");
        System.out.println("3.- VER REPORTE DE VENTAS");
        System.out.println("4.- SALIR");
        System.out.println("---------------------------------------------");
        
    }
    
    
    public void opciones() {
        Vehiculo[] vehiculos = basedatos.getVehiculos();
        RegistroVenta[] ventas = basedatos.getVentas();
        
        Logica logica = new Logica();
        int opcion = 0;

        do {    
            try {
                Scanner scr = new Scanner(System.in);
                System.out.print("OPCION: ");
                opcion = scr.nextInt();
                System.out.println("(" + "Indicaste: " + opcion + ")");   
            }catch (Exception err){
                System.out.println("INGRESE UNA OPCION ENTRE EL 1 Y EL 4!");
                opcion=0;
            }       
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4); 

        switch (opcion){
            case 1: // VER
                logica.opcion1(vehiculos);
                break;
            case 2: // COMPRAR
                logica.opcion2(vehiculos);
                break;
            case 3: // REPORTE
                logica.opcion3(ventas);
                break;
            case 4: // SALIR
                despedida();
        }
    }
    
    
    public void opcion1 (Vehiculo[] vehiculos){
        System.out.println("Estos son los vehículos: ");
        for (Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo);
        }
        volver(); 
    }
    
    
    public void opcion2 (Vehiculo[] vehiculos){     
        Scanner sc = new Scanner(System.in);
        System.out.println("Estas son las opciones disponibles");
        int i=1;
        for (Vehiculo vehiculo: vehiculos){
            System.out.println(i + " " + vehiculo);
            i++;                
        }
        int opcion;
        do {
            try {
                Scanner scr = new Scanner(System.in);
                System.out.println("Indique una opción de las disponibles:");
                opcion = scr.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("opción NUMERICA");
                opcion=100;
            }
        } while (opcion > vehiculos.length);
        System.out.println("Has elegido el vehiculo " + opcion);
        Vehiculo vehiculoComprado = vehiculos[opcion -1];
        System.out.println(vehiculoComprado);

        do {
            try{
                confirma();
                Scanner sc2 = new Scanner(System.in);
                opcion = sc2.nextInt();
                System.out.println("opcion ="+ opcion);
                if (opcion == 2){
                    menuPrincipal();
                    opciones();
                }
            }catch (Exception err){
                System.out.println("CONFIRME SU COMPRA CON 1. De lo contrario, vuelva con el 2!");
                opcion=0;
            }
        } while (opcion != 1 && opcion != 2);    

        //CONFIRMA LA COMPRA = PIDE DATOS DEL COMPRADOR 
        Comprador comprador = new Comprador();
        System.out.println("Ingrese su NOMBRE: ");
        String nombre = sc.next();
        comprador.setNombre(nombre);
        System.out.println("Ingrese su APELLIDO: ");
        String apellido = sc.next();
        comprador.setApellido(apellido);
        int rut;
        do {
            try {
                Scanner scr = new Scanner(System.in);
                System.out.println("Ingrese su RUT SIN dígito verificador, guiones ni puntos: ");
                rut = scr.nextInt();
            }catch (InputMismatchException nm) {
                System.out.println("Ingrese SOLO NUMEROS!: ");
                rut = 1;
            }
        } while (rut < 1000000 || rut > 28000000);       
        comprador.setRut(rut);

        System.out.println("Ud ha adquirido el vehículo de sus sueños");

        // SE REGISTRA LA VENTA
        RegistroVenta venta = new RegistroVenta();
        basedatos.agregarVenta(venta);
                
        venta.setMonto(vehiculoComprado.getMonto());
        venta.setFecha("25/10/22");
        venta.setCodigo(vehiculoComprado.getCodigo());
        venta.setComprador(comprador);

        System.out.println(venta);
        System.out.println("Felicidades!");
        volver();                          
    }
    
    
    public void opcion3 (RegistroVenta[] registros){
        System.out.println("Estas son las ventas hasta ahora: ");
        for (RegistroVenta registro: registros){
            System.out.println(registro);
        }
        volver();      
    } 
    
    
    public void confirma() {
        System.out.println("-----------------------------------------");
        System.out.println("Confirme su compra con: 1 = SI, 2 = VOLVER AL MENÚ");    
    }
    
    
    public void volver() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------");
            System.out.println("¿Desea volver al menú principal?");
            System.out.println("Indique: 1 = SI, 2 = SALIR");
            System.out.print("OPCION: ");
            int resp = sc.nextInt();
            if (resp == 2){
                System.out.println("Hasta pronto");
                System.exit(0);
            }
            if (resp == 1){
                menuPrincipal();
                opciones();
            }
            if (resp <1 || resp >2) {
                System.out.println("Ingrese una opción VALIDA entre 1 y 2 !");
                volver();
            }
        }catch (InputMismatchException err){
            System.out.println("Ingrese una opción VALIDA entre 1 y 2");
            int resp = 0;
            volver();
        }

    }
    
    
    public void despedida() {
        System.out.println("-----------------------------------------");
        System.out.println("Gracias por visitarnos");
        System.out.println("Hasta pronto ;" + ")");
        System.exit(0);

    }  
    
}
