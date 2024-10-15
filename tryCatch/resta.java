package tryCatch;
//import java.util.*; recurso innecesario
import java.util.Scanner;
import java.util.InputMismatchException;

public class resta {
    
    public static void main(String[] args) {
        
        int resultado = 0;
        Scanner miScanner = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese un numero");
            int num1 = miScanner.nextInt();
            System.out.println("Ingrese otro numero");
            int num2 = miScanner.nextInt();
        
            resultado = num1 - num2;
            System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es: " + resultado);
            miScanner.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Ha ingresado un valor inválido");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        };
    };
};