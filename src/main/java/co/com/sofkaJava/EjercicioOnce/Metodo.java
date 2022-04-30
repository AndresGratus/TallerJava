package co.com.sofkaJava.EjercicioOnce;

import java.util.Scanner;

public class Metodo {
    private static String frase;

    Scanner in = new Scanner(System.in);
    public void pedirFrase(){
        System.out.println("Ingresa la frase: ");
        frase = in.nextLine();
    }

    public int longitud(String frase){
        return frase.length();
    }

    public void hallarVocales(){

    }

}
