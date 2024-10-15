package strings;
import java.util.Scanner;

public class toCase {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        String texto = myScanner.nextLine();
        System.out.println("Quiere convertirlo a mayuscula(1) o minuscula(2)?");
        int opcion = myScanner.nextInt();
        if (opcion == 1) {
            System.out.println("El texto en mayusculas es: " + texto.toUpperCase());
        } if (opcion == 2) {
            System.out.println("El texto en minusculas es: " + texto.toLowerCase());
        } else System.out.println("La opcion no es valida");
        myScanner.close();
    };
};
