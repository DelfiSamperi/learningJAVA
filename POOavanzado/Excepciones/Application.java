package POOavanzado.Excepciones;

import java.util.Scanner;
/*
 * Actividad: Division Segura
Escribe un programa que pida al usuario que ingrese dos números 
enteros y realice la división del primer número entre el segundo
número.

Invocar un método llamado “obtenerNumerador()” que solicite el 
número por el cual se desea dividir.

Este método, "obtenerNumerador()", verificará que ingreses un 
número distinto de 0. Si ingresas 0, el método lanzará una 
excepción que será controlada por el método que lo invocó.
*/

import java.util.Scanner;

public class Application {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("Ingrese el numerador:");
            int numerador = sc.nextInt();

            int denominador = obtenerDenominador();

            int resultado = numerador / denominador;
            System.out.println("el resultado de la division es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ups ocurrio un error inesperado: " + e.getMessage());
        }
    }

    public static int obtenerDenominador() {
        System.out.println("ingrese el denominador:");
        int denominador = sc.nextInt();

        if (denominador == 0) {
            throw new ArithmeticException("El denominador no puede ser 0");
        }
        return denominador;
    }
}