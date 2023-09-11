package com.mycompany.concesionaria;


public class BaseDeDatos {
    
    private RegistroVenta[] ventas;
    private Vehiculo[] vehiculos;

    public BaseDeDatos() {
    }

    public RegistroVenta[] getVentas() {
        return ventas;
    }

    public void setVentas(RegistroVenta[] ventas) {
        this.ventas = ventas;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }
    

    public void crearVehiculos(){
        
        Vehiculo[] vehiculosC = new Vehiculo[9];
        
        vehiculosC[0] = new Auto(100, "Maxus", "T20", 2021, 4500, "GG-99-33", 6990000);
        vehiculosC[1] = new Auto(111, " MG  ", "ZS ", 2020, 7600, "BB-D6-69", 5500000);
        vehiculosC[2] = new Auto(222, " KIA ", "Rio", 2022, 1200, "AA-11-09", 7900000);
        vehiculosC[3] = new Auto(333, "Suzuk", "L20", 2009, 9920, "JK-DF-33", 2600000);
        vehiculosC[4] = new Motocicleta(444, "Honda ", "FZ2", 2014, 85000, "PGL33", 2000000);
        vehiculosC[5] = new Motocicleta(555, "Bajaj ", "125", 2021, 11000, "SA899", 6000000);
        vehiculosC[6] = new Motocicleta(666, "Yamaha", "YBR", 2016, 15000, "GGD30", 3000000);
        vehiculosC[7] = new Camioneta(777, "Maxus", "T60", 2022, 1000, "LL-56-33", 9900000);
        vehiculosC[8] = new Camioneta(888, " JAC ", "T8 ", 2021, 5000, "IP-66-37", 7900000);
        
        setVehiculos(vehiculosC);

    }
    
    
    public void crearVentas(){
        
        RegistroVenta[] registroVenta = new RegistroVenta[2];
        
        Comprador comprador1 = new Comprador();
        comprador1.setNombre("Gabriela");
        comprador1.setApellido("Ramírez");
        comprador1.setRut(17309212);
        registroVenta[0] = new RegistroVenta (8999000, "25/10/22", 999, comprador1);
        
        Comprador comprador2 = new Comprador();
        comprador2.setNombre("Cristopher");
        comprador2.setApellido("González");
        comprador2.setRut(15309211);
        registroVenta[1] = new RegistroVenta (4500000, "25/10/22", 555, comprador2); 
        
        setVentas(registroVenta);
    }
    
    
    
    //saqué la idea desde aca https://linuxhint.com/add-elements-to-array-in-java/ u.u
    public void agregarVenta(RegistroVenta venta){
        RegistroVenta[] nuevaArrayVentas = new RegistroVenta[ventas.length + 1];                         
        
        for(int i = 0; i<ventas.length; i++) {  
            nuevaArrayVentas[i] = ventas[i];  
        }
              
        nuevaArrayVentas[ventas.length] = venta;
        setVentas(nuevaArrayVentas);
    }

}
