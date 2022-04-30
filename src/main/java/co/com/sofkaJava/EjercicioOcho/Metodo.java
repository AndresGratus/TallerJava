package co.com.sofkaJava.EjercicioOcho;

import java.util.Scanner;

public class Metodo {
    Scanner in = new Scanner(System.in);
    public void PorNumero(){

        System.out.println("**Ingresa el numero del dia que sea consultar**\n" +
                "1. Lunes\n" +
                "2. Martes\n" +
                "3. Miercoles\n" +
                "4. Jueves\n" +
                "5. Viernes\n" +
                "6. Sabado\n" +
                "7. Domingo");
        int dia = in.nextInt();
        switch (dia){
            case 1 : System.out.println("Lunes dia laboral.");
            case 2 :
                System.out.println("Martes Dia Laboral");
            case 3 :
                System.out.println("Miercoles Dia Laboral");
            case 4 :
                System.out.println("Jueves Dia Laboral");
            case 5 :
                System.out.println("Viernes Dia Laboral");
            case 6 :
                System.out.println("Sabado No Es Dia Laboral");
            case 7 :
                System.out.println("Domingo No Es Dia Laboral");

            default : System.out.println("El numero no corescponde a un dia de la semana");
        }
    }

    public void porDia(){
        String dia="";
        System.out.println("**Ingresa el numero del dia que sea consultar**");
        dia = in.next();

        switch (dia){
            case "Lunes":
            case "lunes":
                System.out.println("Lunes dia laboral.");
                break;

            case "Martes":
            case "martes":
                System.out.println("Martes Dia Laboral");
                break;

            case "Miercoles" :
            case "miercoles" :
                System.out.println("Miercoles Dia Laboral");
                break;

            case "Jueves" :
            case "jueves" :
                System.out.println("Jueves Dia Laboral");
                break;

            case "Viernes" :
            case "viernes" :
                System.out.println("Viernes Dia Laboral");
                break;

            case "Sabado" :
            case "sabado" :
                System.out.println("Sabado No Es Dia Laboral");
                break;

            case "Domingo" :
            case "domingo" :
                System.out.println("Domingo No Es Dia Laboral");
                break;

            default : System.out.println("Error, No corresponde al dia de la semana.");
            break;
        }
    }
}
