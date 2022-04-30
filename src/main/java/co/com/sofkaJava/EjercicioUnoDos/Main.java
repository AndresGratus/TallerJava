package co.com.sofkaJava.EjercicioUnoDos;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int index =0;
        Scanner in = new Scanner(System.in);
        Metodo obj = new Metodo();

        do {
            obj.pedriDatos();
            obj.numerMAyor();

            index = Integer.parseInt(JOptionPane.showInputDialog("Desea comprobar otros Datos\n" +
                    "1. Sí\n" +
                    "2. No\n"));

        } while (index == 1);

        JOptionPane.showMessageDialog(null, "El sistema finalizo con exito");
    }
}
