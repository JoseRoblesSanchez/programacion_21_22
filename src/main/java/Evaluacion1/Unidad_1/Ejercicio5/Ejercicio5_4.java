package Evaluacion1.Unidad_1.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5_4 {

    int num1;
    int num2;

    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el primer numero:");
            int num1 = teclado.nextInt();
            System.out.println("Introduce el segundo numero:");
            int num2 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println( "Este numero es par." );
        }
        else {
            System.out.println( "Este numero es impar." );
        }

        if (num2 % 2 == 0) {
            System.out.println( "Este numero es par." );
        }
        else {
            System.out.println( "Este numero es impar." );
        }



        }
}
