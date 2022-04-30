package co.com.sofkaJava.EjercicioCatorce;

import java.util.Scanner;

public class Metodo {
    private static int numero;
    Scanner in = new Scanner(System.in);

    public void pedirNumero() {
        System.out.println("Ingresa un numero: ");
        numero = in.nextInt();
    }

    public void imprimir() {
        for (int index = numero; numero <= 1000; index++) {
            System.out.println(numero);
            numero+=2;
        }
    }
}
