package JAVACollectionFramework.HashSets;
/*
 * Actividad: Lista de invitados
    Te asignaron desarrollar una aplicación para gestionar el registro de invitados a una fiesta, asegurando que 
    no haya duplicados en la lista y permitiendo agregar o eliminar invitados de forma eficiente.

    Para cumplir con este objetivo, utilizarás un HashSet en Java. Los pasos a seguir son los siguientes:
    Crea una clase llamada RegistroDeInvitados que contenga un HashSet para almacenar los nombres de los invitados.
    Implementa un método llamado agregarInvitado que reciba como parámetro el nombre de un invitado y lo agregue 
    al HashSet.
    Implementa un método llamado eliminarInvitado que reciba como parámetro el nombre de un invitado y lo elimine 
    del HashSet, en caso de que exista.
    Implementa un método llamado mostrarInvitados que imprima por pantalla la lista de invitados.
    Además, crea en el programa principal un menú de opciones que permita al usuario llevar a cabo las siguientes acciones, invocando a sus métodos correspondientes:
    Agregar invitados ingresando su nombre.
    Eliminar invitados ingresando  su nombre.
    Mostrar la lista actual de invitados.
    
    Es importante asegurarse de que el programa no permita duplicados en la lista, ya que el HashSet se 
    encargará de mantenerla única.
    💡Para garantizar que tu programa no permite duplicados, considera implementar un método que asegure que los 
    nombres ingresados se guarden siempre con el mismo formato.🪄
 */

import java.util.HashSet;

public class RegistroDeInvitados {
   HashSet <String> invitados = new HashSet<>();

   public void agregarInvitado (String nombre) {
      invitados.add(nombre);
   }

   public void eliminarInvitado(String nombre) {
      if(invitados.contains(nombre))
      invitados.remove(nombre);
   }
    
      public void mostrarInvitado() {
         if (!invitados.isEmpty()){
            System.out.println(invitados);
         }else {
            System.out.println("No hay invitados");
         }
      }
}
