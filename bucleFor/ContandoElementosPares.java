package bucleFor;

public class ContandoElementosPares {
    public static void main(String[] args) {
        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100);
        }

        System.out.print("Array: ");
        for (int numero : lista) {
            System.out.print(numero + " ");
        }

        int cantidadPares = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) {
                cantidadPares++;
            }
        }

        System.out.println();
        System.out.println("Cantidad de elementos pares: " + cantidadPares);
    }
}
