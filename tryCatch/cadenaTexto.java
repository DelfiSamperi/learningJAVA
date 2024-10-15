package tryCatch;

import java.util.Scanner;

public class cadenaTexto {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese seis digitos");
        String num1 = miScanner.next();
        int numTexto = Integer.parseInt(num1);

        System.out.println("El numero ingresado como string ahora es el entero " + numTexto);
        miScanner.close();
    }
};
