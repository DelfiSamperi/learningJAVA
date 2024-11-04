package metodos;

import java.util.Scanner;

// public class impNombreMejorafo {
//    public static void main(String[] args) {
//         Scanner pepe = new Scanner(System.in);
//         String nombre = pedirNombre(pepe);
//         int edad = pedirEdad(pepe);
//         imprimirNombreYEdad(nombre, edad);
//         pepe.close();        
//     }

//     public static String pedirNombre(Scanner pepe) {
//         System.out.println("Por favor ingrese un nombre:");
//         return pepe.nextLine();
//     }

//     public static int pedirEdad(Scanner pepe) {
//         System.out.println("Por favor ingrese una edad:");
//         return pepe.nextInt();
//     }

//     private static void imprimirNombreYEdad(String nombre, Integer edad) {
//         System.out.println("Mi nombre es " + nombre + " y mi edad " + edad);
//     } 
// }

//variable global, evita recibir scanner por parametro

public class impNombreMejorafo {

    public static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = pedirNombre();
        int edad = pedirEdad();

        imprimirNombreYEdad(nombre, edad);
        pepe.close();
    }

    public static String pedirNombre() {
        System.out.println("Por favor ingrese un nombre:");
        return pepe.nextLine();
    }

    public static int pedirEdad() {
        System.out.println("Por favor ingrese una edad:");
        return pepe.nextInt();
    }

    private static void imprimirNombreYEdad(String nombre, Integer edad) {
        System.out.println("Mi nombre es " + nombre + " y mi edad " + edad);
    }

};