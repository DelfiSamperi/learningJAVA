package objetos;
// Actividad: Creando un objeto “Persona”
// Crea una clase llamada Persona.
// Define 2 atributos para la clase: nombre y edad.
// Crea una método llamado imprimirDatos para imprimir la presentación de una persona en consola mostrando sus atributos.
// Asegúrate de incluir dentro de tu proyecto una clase que 
// contenga un método main, el cual será el punto para ejecutar 
// tu proyecto.En ella, crea un objeto a partir de una instancia
// de la clase “Persona”.
// Ejecuta el método que imprime la presentación de dicha persona
// en consola.
// Crea un nuevo objeto del tipo Persona.
// Imprime por consola, invocando al método correspondiente, los
// datos de dicho objeto. 

public class Persona {
    // atributos
    private String nombre;
    private int edad;

    //constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo para imprimir datos de la persona
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main{
    // crea objeto de la clase Persona con datos especificados
    public static void main(String[] args) {
        Persona miPersona = new Persona("Ludito", 8);
        //llamo al metodo imprimirDatos para mostrar la persona
        System.out.println("Presentacion de la primer persona: ");
        persona1.imprimirDatos();
    }
}