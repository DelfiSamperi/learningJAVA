package claseScannerDos;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa dos numeros");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        num.close();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int resto = num1 % num2;
        
        // System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        // System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        // System.out.printf("%d x %d = %d\n", num1, num2, (num1 * num2));
        // System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        
        System.out.println("La suma de " +num1 + " y " +num2 + " da " + suma);
        System.out.println("La resta de " +num1 + " y " +num2 + " da " + resta);
        System.out.println("La multiplicacion de " +num1 + " y " +num2 + " da " + multi);
        System.out.println("La division de " +num1 + " y " +num2 + " da " + div + " con resto " + resto);
   
    };
};