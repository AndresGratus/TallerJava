package co.com.sofkaJava.EjercicioDoce;

import java.util.Scanner;

public class Metodo {
    Scanner in = new Scanner(System.in);
    public String fraseUno="",fraseDos="";
    String dif = "";
    String selecion = "";
    int tamano = 0;
    int tamUno =0,tamDos =0;
    public void pedirDatos(){
        System.out.println("ingrese la primera frase:");
        fraseUno = in.nextLine();
        System.out.println("Ingrese la segunda frase:");
        fraseDos = in.nextLine();

    }

    public void convertir(){
         this.tamUno = fraseUno.length();
        this.tamDos = fraseDos.length();

    }

    public void compararFrases(){
        convertir();
        if (fraseDos.equalsIgnoreCase(fraseUno)) {
            System.out.println("Frase 1 ingresadas:" + fraseUno + " y la Frase 2 " + fraseDos + " son iguales");
        } else {
            if (tamUno> tamDos) {
                tamano = tamDos;
                selecion = fraseUno;
            } else if (tamUno == tamDos) {
                tamano = tamUno;
                selecion = fraseDos;
            } else {
                tamano = tamUno;
                selecion = fraseDos;
            }
            for (int x = 0; x <= tamano-1; x++) {
                System.out.println(fraseUno.charAt(x)+"-"+fraseDos.charAt(x));
                if ((fraseUno.charAt(x) != fraseDos.charAt(x))) {
                    System.out.println(selecion);
                    dif = selecion.substring(x);
                    break;
                }
            }
            System.out.println("las Frase 1" + fraseUno + " y la Frase 2" + fraseDos + " son diferentes en: " + dif);
        }
    }

}
