package whileDoWhile;

import java.util.Scanner;

public class menuOpciones {

    public static void main(String[] args) {
        
do {
System.out.println(
"Menu\n1. Comprar producto\n2. Realizar devolucion\n3. Ver mis pedidos\n4. Preguntas frecuentes\n5. Salir");
System.out.print("Ingresar opcion: ");
opcion = scanner.nextInt();

switch (opcion) {
case 1:
System.out.println("Opcion 1");
break;
case 2:
System.out.println("Opcion 2");
break;
case 3:
System.out.println("Opcion 3");
break;
case 4:
System.out.println("Opcion 4");
break;
case 5:
System.out.println("Saliendo del menu...");
break;

default:
System.out.println("Opcion no valida.");
break;
}


}
