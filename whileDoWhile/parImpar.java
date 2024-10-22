package whileDoWhile;
import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par = 0;
        int inpar = 0;
        char opcion = 'S';
        while (opcion != 'N') {
            System.out.println("Ingrese un numero entero: ");
            int n = sc.nextInt();
            System.out.println("Quiere seguir ? S/N");
            opcion = sc.next().charAt(0);
            if (n % 2 == 0) {
                par++;
            } else {
                inpar++;
            }

        }
        System.out.println("La cantidad de numeros inpares es: " + inpar);
        System.out.println("La cantidad de numeros pares es: " + par);
        sc.close();
    }
}
