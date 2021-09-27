package Evaluacion1.Unidad_1.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args) {
       // int grado
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Dime una temperatura en grados centigrados: ");
        int grado = teclado.nextInt();
        System.out.println("Este es el resultado en Fahrenheit = " + 9 * grado / 5 + 32);

    }
}
