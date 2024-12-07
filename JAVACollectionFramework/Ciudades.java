package JAVACollectionFramework;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Actividad: Lista de ciudades
    Desarrolla un programa en Java que haga uso de una lista de tipo ArrayList para almacenar un conjunto 
    de nombres de ciudades. El objetivo es permitir al usuario ingresar nombres de ciudades y luego mostrar 
    la lista completa de ciudades ingresadas.

    Pasos a seguir:
    Inicializa un ArrayList de tipo String para almacenar los nombres de las ciudades.
    Implementa un bucle que solicite al usuario ingresar nombres de ciudades uno por uno. Puedes usar un bucle 
    while o un bucle for que pregunte al usuario si desea agregar una ciudad en cada iteración.
    En cada iteración del bucle, solicita al usuario que ingrese el nombre de una ciudad y agrega ese nombre    
    al ArrayList utilizando el método add.
    Continúa solicitando al usuario que ingrese nombres de ciudades hasta que decida no agregar más.
    Finalmente, muestra por consola la lista completa de ciudades almacenadas en el ArrayList.
    
 */
public class Ciudades {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>(10);
        String option;
        String ciudad;
        do {

            System.out.println("Ingrese nombre de una ciudad: ");
            ciudad = sc.nextLine();
            ciudades.add(ciudad);

            System.out.println("Desea ingresar otra ciudad? si/no");
            option = sc.nextLine();

        } while (option.equalsIgnoreCase("si"));
        sc.close();

        System.out.println("Lista de ciudades: ");
        for (String cdad : ciudades) {
            System.out.println(cdad);
        }
    }
}
