package Integradores1;

import java.util.Scanner;

public class contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mayus = false;
        boolean min = false;
        boolean especial = false;
        boolean num = false;

        System.out.println("Ingrese una contraseña segura");
        String contraseña = sc.nextLine();

        if (contraseña.length() < 8) {
            System.out.println("La contraseña debe tener mas de 8 caracteres");
        } else {

            for (int i = 0; i < contraseña.length(); i++) {
                char caracter = contraseña.charAt(i);
                if (Character.isUpperCase(caracter)) {
                    mayus = true;
                    continue;
                }
                ;
                if (Character.isLowerCase(caracter)) {
                    min = true;
                    continue;
                }
                ;
                if (Character.isDigit(caracter)) {
                    num = true;
                    continue;
                }
                ;
                if (!Character.isLetterOrDigit(caracter)) {
                    especial = true;
                }

            }
            if (mayus && min && especial && num) {
                System.out.println("La contraseña es valida");
            } else {
                System.out.println("La contraseña no es valida");
            }
            sc.close();

        }
    }
}

/*
System.out.println("Contraseña no segura. Debe cumplir con los siguientes criterios:");
System.out.println("- Al menos 8 caracteres.");
System.out.println("- Al menos una letra mayúscula y una letra minúscula.");
System.out.println("- Al menos un número.");
System.out.println("- Al menos un carácter especial (por ejemplo, !, @, #, $).");
}
}
 */