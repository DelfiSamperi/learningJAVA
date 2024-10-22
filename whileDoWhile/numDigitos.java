package whileDoWhile;
import java.util.Scanner;

public class numDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        int numUsuario = Math.abs(sc.nextInt());
        int contador = 0;

        while(numUsuario > 0) {
            numUsuario = numUsuario / 10;
            contador++;
        }
        System.out.println("El numero ingresado tiene " + contador + " digitos.");
        sc.close();
    }
}
