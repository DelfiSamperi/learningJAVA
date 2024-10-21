package bucleFor;

public class inverso {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] auxArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            auxArr[i] = arr[arr.length - i - 1];
        }

        for (int num : auxArr) {
            System.out.println(num);
        }
    }
};

/*
 
public class inverso {
    public static void main(String[] args) {
        int[] lista = { 10, 12, 45, 4, 8, 21, 11, 2, 17, 33 };

        System.out.println("Array Original es: " + Arrays.toString(lista));

        int aux;

        for (int i = 0; i < lista.length / 2; i++) {
            aux = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = aux;
        }

        System.out.println("Array invertido es: " + Arrays.toString(lista));

    }
}
    */