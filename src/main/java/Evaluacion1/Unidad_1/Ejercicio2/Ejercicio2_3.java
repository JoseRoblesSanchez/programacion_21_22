package Evaluacion1.Unidad_1.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
      //  int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el primer numero");
        int num1 = teclado.nextInt();

        System.out.println("Introducir el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("La division de los dos numeros es: " + num1 / num2);


    }

}
