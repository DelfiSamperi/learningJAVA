package tryCatch;
import java.util.Scanner;

public class divisionSegura {
    public static void main(String[] args) {

        Scanner numerosDivision = new Scanner(System.in);
        System.out.println("Ingresa dos numeros para dividir");
        int num1 = numerosDivision.nextInt();
        int num2 = numerosDivision.nextInt();
        numerosDivision.close();

        int resultado = num1 / num2; 
        System.out.println("El resultado de " + num1 + " dividido " + num2 + " es: " + resultado);
    };
};
