package claseScannerDos;
import java.util.Scanner;

public class datosUsuario {
    public static void main(String[] args) {
        
        Scanner nombreUsuario = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String name = nombreUsuario.nextLine();
        

        Scanner edadUsuario = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = edadUsuario.nextInt();
        
        nombreUsuario.close();
        edadUsuario.close();

        System.out.println("El usuario " + name + " tiene " + edad + " años.");
    };
};
