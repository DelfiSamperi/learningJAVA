package POOavanzado.biblioteca;
/*
 * Diseña una clase abstracta "ItemBiblioteca" que contenga 
 * métodos abstractos como "prestar()", "devolver()" y "calcularMultas()".

Crea las clases concretas “Libro”, “Revista” y “Película”, 
las cuales deben extender la clase "ItemBiblioteca" y 
proporcionar implementaciones concretas de los métodos. 

Desarrolla una interfaz llamada "Catalogable" con métodos 
para obtener información sobre el elemento bibliotecario 
llamado obtenerInformacion. Luego, asegúrate de que todas las
 clases implementen esta interfaz.
 */

public abstract class itemBiblioteca {
    public abstract int prestar();
    public abstract int devolver();
    public abstract double camcularMulta();
};
