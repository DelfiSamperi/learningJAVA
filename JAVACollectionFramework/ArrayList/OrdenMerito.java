package JAVACollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Actividad: Orden de mérito
    Desarrolla un programa en Java que emplee un ArrayList para almacenar una serie de notas enteras en 
    el rango del 1 al 10.
    El programa debe permitir al usuario ingresar varios números a la lista, asegurándose de que cada número 
    esté dentro del rango especificado. Luego, ordenará estos números de manera descendente y los imprimirá 
    por pantalla en ambas direcciones.

    Pasos a seguir:
    Inicializa un ArrayList de tipo Integer para almacenar los números enteros.
    Implementa un bucle que solicite al usuario ingresar números enteros uno por uno. Puedes usar un bucle while 
    o for que pregunte al usuario si desea agregar un número en cada iteración.
    En cada iteración del bucle, verifica que el número ingresado esté dentro del rango del 1 al 10 y agrégalo 
    al ArrayList utilizando el método add. Continúa solicitando al usuario que ingrese números hasta que decida 
    no agregar más.
    Después de que el usuario haya ingresado todos los números, utiliza el método sort para ordenar la lista 
    de números de forma descendente.
    Imprime por pantalla la lista ordenada tanto en orden ascendente como descendente.
*/
public class OrdenMerito {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String option;
        Integer nota;
        do {
            System.out.println("Ingrese una nota valida (entre 1 y 10)");
            nota = sc.nextInt();
            if(nota >= 1 && nota <= 10) {
                notas.add(nota);
            } else {
                System.out.println("La nota ingresada no es valida.");
            }
            System.out.println("Desea agregar otra nota? si/no");
            option = sc.nextLine();

        } while (option.equalsIgnoreCase("si"));
        sc.close();

        //ArrayList.sort();

    }
    
}


/* HECHO POR UN COMPAÑERO
 * public class Main {
public static void main(String[] args) {

ArrayList<Integer> notas = new ArrayList<>();
Scanner sc = new Scanner(System.in);
String opcion;

do{
System.out.println("Ingrese una nota entre 1 y 10:");
int nota = sc.nextInt();

if(nota >= 1 && nota <= 10) {
notas.add(nota);
}else{
System.out.println("Ingrese una nota válida");
}

System.out.println("Desea continuar: si/no");
sc.nextLine();
opcion = sc.nextLine();

}while(opcion.equalsIgnoreCase("si"));

Collections.sort(notas);
System.out.println("Ascendente:");
for(int nota: notas) {
System.out.println(nota);
}

Collections.sort(notas, Collections.reverseOrder());
System.out.println("Descendente:");
for(int nota: notas) {
System.out.println(nota);
}

sc.close();
 */