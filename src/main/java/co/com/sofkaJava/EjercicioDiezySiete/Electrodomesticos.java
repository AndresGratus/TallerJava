package co.com.sofkaJava.EjercicioDiezySiete;

public class Electrodomesticos {
    Float precioBase = 100F;
    String color = String.valueOf(Color.BLANCO);
    String consumoEnergetico = String.valueOf(Consumo.F);
    Integer peso = 5;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Float precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomesticos(Float precioBase, String color, String consumoEnergetico, Integer peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = consumoEner(consumoEnergetico);
        this.peso = peso;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    private String consumoEner(String letra) {
        if (letra.equals(String.valueOf(Consumo.A)) ||
                letra.equals(String.valueOf(Consumo.B)) ||
                letra.equals(String.valueOf(Consumo.C)) ||
                letra.equals(String.valueOf(Consumo.D)) ||
                letra.equals(String.valueOf(Consumo.E)) ||
                letra.equals(String.valueOf(Consumo.F))) {
            return letra;
        } else {
            return String.valueOf(Consumo.F);
        }
    }

    private Float precioConsumo() {
        switch (consumoEnergetico) {
            case "A":
                return 100F;
            case "B":
                return 80F;
            case "C":
                return 60F;
            case "D":
                return 50F;
            case "E":
                return 30F;
            case "F":
                return 10F;
            default:
                return 0F;
        }
    }


    private String comprobarColor(String color) {
        if (color.equals(String.valueOf(Color.AZUL)) ||
                color.equals(String.valueOf(Color.BLANCO)) ||
                color.equals(String.valueOf(Color.GRIS)) ||
                color.equals(String.valueOf(Color.NEGRO)) ||
                color.equals(String.valueOf(Color.ROJO))) {
            return color;
        } else {
            return String.valueOf(Color.BLANCO);
        }
    }

    private Float precioPeso() {
        if (peso >= 0 && peso <= 19)
            return 10F;
        else if (peso >= 20 && peso <= 49) {
            return 50F;
        } else if (peso > 50 && peso <= 79) {
            return 80F;
        } else
            return 100F;
    }



    public Float precioFinal() {

        precioBase += precioConsumo()+precioPeso();
        return precioBase;
    }
}
