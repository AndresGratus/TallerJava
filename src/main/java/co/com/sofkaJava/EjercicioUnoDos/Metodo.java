package co.com.sofkaJava.EjercicioUnoDos;

import javax.swing.*;

public class Metodo {

    int x, y;

//

    public void pedriDatos() {
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer dato: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo dato: "));
    }

    //Metodo Saber cual es el numero mayor

    public void numerMAyor() {
        if (x > y) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + x);
            JOptionPane.showMessageDialog(null, "El numero menor es " + y);


        }
        if (y > x) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + y);
            JOptionPane.showMessageDialog(null, "El numero menor es " + x);


        }
        if (x == y ){
            JOptionPane.showMessageDialog(null, "Los numeros "+ x + " y " + y + " son iguales");
        }
    }

}
