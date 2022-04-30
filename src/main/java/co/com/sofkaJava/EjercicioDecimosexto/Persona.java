package co.com.sofkaJava.EjercicioDecimosexto;

public class Persona {
    private static String nombre = "";
    private static char sexo = ' ';
    private static int edad = 0,DNI ;
    private static double peso = 0, altura = 0;
    public int pesoIdeal;

    public Persona() {

    }

    public Persona(String nombre, char sexo, int edad,int DNI) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = DNI;
    }

    public Persona(String nombre, char sexo, int edad,int DNI, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = DNI;
        this.peso = peso;
        this.altura = altura;

    }

    //Metodo calcular peso ideal
    public int calcularIMC() {
        peso = peso / (Math.pow(altura, 2));
        if (peso < 20) {
            pesoIdeal = -1;
        }
        if (peso >= 20 && peso <= 25) {
            pesoIdeal = 0;
        }
        if (peso > 25) {
            pesoIdeal = 1;
        }
        return pesoIdeal;
    }

    //Metodo para saber si es mayor
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public void comprobarSexo(char sexo) {

        if (sexo == 'F' || sexo == 'f' || sexo == 'H' || sexo == 'h') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    public void generaDNI(){

    }




    //Metodos sett

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static void setSexo(char sexo) {
        Persona.sexo = sexo;
    }

    public static void setEdad(int edad) {
        Persona.edad = edad;
    }

    public static void setPeso(double peso) {
        Persona.peso = peso;
    }

    public static void setAltura(double altura) {
        Persona.altura = altura;
    }
}
