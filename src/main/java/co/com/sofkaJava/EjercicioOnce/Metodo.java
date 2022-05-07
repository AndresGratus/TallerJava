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

    String vocal = " ";
    int aux = 0;
    public void hallarVocales(){
        System.out.println("El tamaño es de:" + longitud(frase));

        for (int x= 0; x < frase.length() ; x++) {

            if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o')|| (frase.charAt(x)=='u')) {
                aux++;
                vocal = vocal + frase.charAt(x);
            }

        }
        System.out.println("La frase " + frase + " Contiene " + aux + " " + vocal);
    }

}
