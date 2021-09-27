package Evaluacion1.Unidad_1.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
         // byte num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el primer numero");
        byte num1 = teclado.nextByte();
        System.out.println("Introducir el segundo numero");
        byte num2 = teclado.nextByte();
        System.out.println("La suma de estos dos numeros es: " + (num1 + num2));


    }

}
