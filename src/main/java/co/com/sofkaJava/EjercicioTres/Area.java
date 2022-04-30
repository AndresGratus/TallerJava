package co.com.sofkaJava.EjercicioTres;

import java.util.Scanner;

public class Area {
    String radio;
    double area;

    Scanner in = new Scanner(System.in);

    public void pedirDatos(){
        System.out.println("Ingresa el Radio del circulo:");
        radio = in.next();
    }

    public void calcularArea(){
        area = (Math.PI)*(Math.pow(Double.parseDouble(radio),2));
        System.out.println("El area de la circuferencia es: " + area);
    }


}

