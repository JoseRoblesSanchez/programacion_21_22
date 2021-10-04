package Evaluacion1.Unidad_1.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5_6 {
    public static void main(String[] args) {

        float constante = (float) 9.8;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tiempo:");
        int tiempo = teclado.nextInt();
        System.out.println("Calculamos la velicidad = (Gravedad X Tiempo) = " + (constante * tiempo));
    }
}
