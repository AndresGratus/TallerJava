package co.com.sofkaJava.EjercicioDiezySiete;

public class Metodo {
      
    public void arr(){
        int index = 10;
        int index1 = index;
        Electrodomesticos[] electrodomesticos = new Electrodomesticos[index1];
        electrodomesticos[0] = new Lavadora(400F, "AZUL", "F", 60, 35);
        electrodomesticos[1] = new Lavadora();
        electrodomesticos[2] = new Lavadora(400F, "AZUL", "F", 60, 35);
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(400F, "AZUL", "F", 60, 35);
        electrodomesticos[5] = new Television(800F, "ROJO", "A", 35, 50F, true);
        electrodomesticos[6] = new Television(800F, "NEGRO", "A", 40, 60F, true);
        electrodomesticos[7] = new Television(800F, "AZUL", "A", 35, 50F, true);
        electrodomesticos[8] = new Television();
        electrodomesticos[9] = new Television();

        Float totalElectrodomesticos = 0F;
        for (int i=0; i< electrodomesticos.length; i++) {
            if (electrodomesticos[i] instanceof Lavadora) {
                Lavadora lavadora = (Lavadora)electrodomesticos[i];
                Float totalLavadora = lavadora.precioFinal();
                System.out.println("Lavadora, "+totalLavadora);
                totalElectrodomesticos += totalLavadora;
            } else if (electrodomesticos[i] instanceof Television) {
                Television television = (Television) electrodomesticos[i];
                Float totalTelevision = television.precioFinal();
                System.out.println("Television "+totalTelevision);
                totalElectrodomesticos += totalTelevision;
            }
            //System.out.println((Lavadora));
        }
        System.out.println("totalElectrodomesticos = " + totalElectrodomesticos);
    }


}

