package co.com.sofkaJava.EjercicioCuatro;

import java.util.Scanner;

public class Metodo {
    private static Double precio;
    private static final double iva = 1.21;

    Scanner in = new Scanner(System.in);
    public Metodo(){

    }

    public void pedirDatos(){
        System.out.println("Ingresa el precio del producto: ");
        precio = in.nextDouble();
    }

    public void hallarIva(){
        precio = precio *(iva);
        System.out.println("El Precio con Iva incluido es de: "  + precio);
    }
}
