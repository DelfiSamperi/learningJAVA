package IntroPOO.Auto;
/*
  ✏️  Actividad: Ejercicio Complementario
    ✨ Este ejercicio es de tipo complementario. Esto quiere decir que te ayudará a avanzar en profundidad en el tema 
    visto, pero no es obligatorio. 

    Crea un menú de opciones en consola donde el usuario pueda crear un objeto “Auto”.  
    ¡Atención! El usuario puede dejar algunos atributos sin completar y tendrá una opción para poder imprimir los 
    atributos del objeto en consola.
*/

public class App {
    public static void main(String[] args) {
        //instancias de la clase Auto
        Auto auto1 = new Auto("Toyota", "Ethios", 2019);
        Auto auto2 = new Auto("Toyota", "Ethios");
        Auto auto3 = new Auto("Toyota");
        Auto auto4 = new Auto();

        //llamando al metodo para imprimir datos
        System.out.println("*** AUTO 1 ***");
        auto1.imprimirDatos();
        System.out.println("*** AUTO 2 ***");
        auto2.imprimirDatos();
        System.out.println("*** AUTO 3 ***");
        auto3.imprimirDatos();
        System.out.println("*** AUTO 4 ***");
        auto4.imprimirDatos();
    };
};
