package Evaluacion1.Unidad_3;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {

      //  short num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el año de nacimiento de Juan:");
        short num1 = teclado.nextShort();
        System.out.println("Introducir el año en el que nos encontramos:");
        short num2 = teclado.nextShort();
        System.out.println("Juan nacio hace: " + (num2 - num1) );

    }
}
