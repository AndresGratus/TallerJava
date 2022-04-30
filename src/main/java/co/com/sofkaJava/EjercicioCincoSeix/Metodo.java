package co.com.sofkaJava.EjercicioCincoSeix;

public class Metodo {

    int index = 1;
    public static boolean par(int numero){
        return numero % 2 ==0;
    }
    public void paresImparesWhile(){

        while (index <= 100){
            if (par(index)){
                System.out.println(" - Es par:" + index);
            }else {
                System.out.print("No es par: " + index);
            }
            index++;
        }
    }

    public void paresImparesFor(){
        for (index = 1; index <= 100; index++){
            if (par(index)){
                System.out.println(" - Es par: " + index);
            } else{
                System.out.print("No es par: " + index);
            }
        }
    }
}
