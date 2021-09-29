package Evaluacion1.Unidad_1.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5_5 {

    long num1;
    long num2;
    long num3;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        long num1 = teclado.nextLong();
        System.out.println("Introduce el segundo numero:");
        long num2 = teclado.nextLong();
        System.out.println("Introduce el tercer numero:");
        long num3 = teclado.nextLong();


        if (num1 > num2) {
            System.out.println("El numero mayor de los tres es " + num1);
        }
        else if (num1 > num3){
            System.out.println("El numero mayor de los tres es " + num1);
        }



        }
    }




