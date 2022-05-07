package co.com.sofkaJava.EjercicioDiezySiete;

public class Lavadora extends Electrodomesticos{

    private final int cargainicial = 5;

    private int carga = cargainicial;

    public Lavadora() {
        super();
    }
    public Lavadora(Float precioBase, Integer peso) {
        super(precioBase, peso);
    }
    public Lavadora(Float precioBase, String color, String consumoEnergetico, Integer peso, Integer carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    public Integer getCarga() {
        return carga;
    }

    public Float precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            return this.precioBase + 50;
        } else {
            return this.precioBase;
        }

    }
}
