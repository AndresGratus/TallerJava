package co.com.sofkaJava.EjercicioNueveDiez;

import java.util.Scanner;

public class Metodo {

    Scanner in = new Scanner(System.in);
    public void cambio(){
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String newfrase = frase.replace("a","e");
        System.out.println(newfrase);
        System.out.println("Ingresa la frase que desea concatenar: ");
        String fraseextra = in.nextLine();

        newfrase += " "+fraseextra;

        System.out.println(newfrase+"\n");
    }
//Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
    public void eliminarEspacios(){
        System.out.println("Ingresa");
        String frase = in.nextLine();

        String newfrase = frase.replace(" ", "-");

        System.out.println(newfrase);

    }
}
