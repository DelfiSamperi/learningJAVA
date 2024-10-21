package bucleFor;

import java.util.Arrays;

public class imprimiendoElementos {
    public static void main(String[] args) {
        int[] lista = { 10, 12, 45, 4, 8, 21, 11, 2, 17, 33 };

        System.out.println("La lista original es: " + Arrays.toString(lista));

        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.println("El número en la posición " + i + " es: " + lista[i]);
        }
    }
}