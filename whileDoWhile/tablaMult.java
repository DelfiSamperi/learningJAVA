package whileDoWhile;

import java.util.Scanner;

// Escribe un programa que solicite al usuario un número entero y muestre 
// la tabla de multiplicar de ese número utilizando un bucle while. El programa 
// debe seguir solicitando números hasta que el usuario ingrese un valor igual a cero, 
// en cuyo caso debería salir del bucle.

public class tablaMult {
    public static void main(String[] args) {
        int number = 1;
        int counter = 11;

        System.out.println("Tipo 1 del ejercicio");
        while (number != 0) {
            if (counter == 11) {
                System.out.print("Ingresar numero: ");
                number = scanner.nextInt();
                counter = 1;
            } else {
                System.out.printf("%d x %d = %d\n", number, counter, (number * counter));
                counter++;
            }
        }

        // System.out.println("\nTipo 2 del ejercicio");
        // while (number != 0) {
        //     System.out.print("Ingresar numero: ");
        //     number = scanner.nextInt();
        //     for (int i = 1; i <= 10; i++) {
        //         System.out.printf("%d x %d = %d\n", number, i, (number * i));
        //     }
        // }
    }
}