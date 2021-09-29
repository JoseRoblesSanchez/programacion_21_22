package Evaluacion1.Unidad_1.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota:");
        double notaD = teclado.nextDouble();
        int notaFinal = (int) notaD;

        System.out.println("La nota final es: " + notaFinal);

    }
}