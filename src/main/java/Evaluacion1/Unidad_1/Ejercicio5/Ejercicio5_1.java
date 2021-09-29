package Evaluacion1.Unidad_1.Ejercicio5;
import java.util.Scanner;
public class Ejercicio5_1 {

    int num;
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = teclado.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo.");
        } else {
            System.out.println("El numero es negativo.");
        }
    }
}