package Integradores1;

import java.util.Scanner;

public class conversionTemp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese la temperatura");
            double temperatura = sc.nextDouble();

            System.out.println("Ingrese la unidad de medida (C/F)");
            char unidad = sc.next().charAt(0);

            sc.close();

            switch (unidad) {
                case 'C' -> System.out.println("su conversion queda: " + ((temperatura * 9 / 5) + 32));
                case 'F' -> System.out.println("su conversion queda: " + ((temperatura - 32) * 5 / 9));
                default -> System.out.println("ingreso una unidad invalida");
            }

        } catch (NumberFormatException e) {
            System.out.println(
                    "el tipo de dato ingresado para la temperatura no es valido, por favor ingrese un numero valido");
        }

    }
}
