package Evaluacion1.Unidad_1.Ejercicio4;


public class Ejercicio4_5 {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        int hours   = (int) ((millis / (1000*60*60)) % 24);
        int minutes = (int) ((millis / (1000*60)) % 60);
        int seconds = (int) (millis / 1000) % 60 ;

        System.out.println("Hora actual : " + hours + ":"+ minutes +":"+seconds);

    }
}


