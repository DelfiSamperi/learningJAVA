package JAVACollectionFramework.HashSets;
/*
 * Además, crea en el programa principal un menú de opciones que permita al usuario llevar a cabo las siguientes acciones, invocando a sus métodos correspondientes:
    Agregar invitados ingresando su nombre.
    Eliminar invitados ingresando  su nombre.
    Mostrar la lista actual de invitados.
 */
public class App {
    public static void main(String[] args) {

    }
}

/* LO HIZO UNA COMPAÑERA
 * public class App {
static boolean flag = true;
static Scanner sc = new Scanner(System.in);
static RegistroDeInvitados registroDeInvitados = new RegistroDeInvitados();
public static void main(String[] args) {
int opcion;
do{
System.out.println("""
Bienvenido a Lista de Invitados
1. Agrega un invitado
2. Elimina un invitado
3. Muestra la lista de invitados
4. Salir
Escoge una opción:
""");
opcion = Integer.parseInt(sc.nextLine()); //limpia el búffer

switch (opcion) {
case 1 -> {
System.out.println("Ingrese el nombre del invitado: ");
String nombre = sc.nextLine();
registroDeInvitado...


registroDeInvitados.agregarInvitado(nombre);
}
case 2 -> {
System.out.println("Ingrese el nombre del invitado a eliminar: ");
String nombre = sc.nextLine();
registroDeInvitados.eliminarInvitado(nombre);
}
case 3 -> registroDeInvitados.mostrarInvitado();
case 4 -> {
System.out.println("Gracias por usar el programa.");
flag = false;
}
default -> System.out.println("Opción no válida.");
}
}while (flag);
}
}
 */
