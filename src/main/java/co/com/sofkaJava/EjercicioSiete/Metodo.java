package co.com.sofkaJava.EjercicioSiete;

import java.util.Scanner;

public class Metodo {
    private int X;
    private boolean aux = false;

    Scanner in = new Scanner(System.in);
    public void pedirDato(){
        System.out.println("Ingrese el dato: ");
        X = in.nextInt();
    }

    public void validar(){
        pedirDato();
        do {
            if (X >= 0 ){
                System.out.println("El numero " + X + " es mayor que 0");
                aux = true;
            } else{
                System.out.println("El dato debe ser mayor a 0");
                pedirDato();
            }
        }while(!aux);
    }

}
