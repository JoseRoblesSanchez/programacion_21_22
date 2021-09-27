package Evaluacion1.Unidad_3;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
       // double num1, num2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el primer numero:");
        double num1 = teclado.nextDouble();
        System.out.println("Introducir el segundo numero:");
        double num2 = teclado.nextDouble();
        System.out.println("La division de estos dos numero es: " + (num1 / num2) );

    }
}
