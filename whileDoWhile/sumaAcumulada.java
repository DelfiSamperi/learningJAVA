package whileDoWhile;

import java.util.Scanner;

public class sumaAcumulada {
    /*
     * Crea un programa que solicite al usuario ingresar una serie de números
     * enteros positivos.
     * Utiliza un bucle do-while para ir acumulando la suma de los números
     * ingresados.
     * Después de cada entrada de número, pregunta al usuario si desea ingresar otro
     * número.
     * Si el usuario responde afirmativamente, continúa solicitando números;
     * de lo contrario, muestra la suma acumulada de todos los números ingresados y
     * termina el programa.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion = 'S';
        int suma = 0;

        do {
            System.out.println("Ingrese un numero entero positivo: ");
            int n = sc.nextInt();
            if (n >= 0) {
                suma += n;
            }

            System.out.println("Quiere seguir ? S/N");
            opcion = sc.next().charAt(0);

        } while (opcion != 'N');

        System.out.println("La suma total es: " + suma);
        sc.close();

    }
}
