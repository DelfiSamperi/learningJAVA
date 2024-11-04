//Imprimir nombre:  Crea un método llamado imprimeNombre() 
//que reciba por parámetro un nombre y luego imprima el mensaje 
//"Mi nombre es [nombre]". Invocar dicho método desde el método
// main para ver el mensaje por consola

package metodos;
import java.util.Scanner;

public class imprimirNombre {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.println("Por favor ingrese un nombre:");
        String nombre = pepe.nextLine();
        System.out.println("Por favor ingrese una edad:");
        int edad = pepe.nextInt();
        imprimirNombreYEdad(nombre, edad);
        pepe.close();        
    }

    private static void imprimirNombreYEdad(String nom, Integer edad) {
        System.out.println("Mi nombre es" + nom + "y mi edad " + edad);
    }
};