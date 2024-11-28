package IntroPOO.Auto;
/*
 * Actividad: Usando los constructores
    El propósito de esta actividad es implementar el uso de constructores.
    Crea una clase llamada Auto

Define 3 atributos para la clase: marca, modelo y año. 
Crea los siguientes constructores:
Constructor que inicialice marca, modelo y año
Constructor que inicialice marca y modelo 
Constructor que inicialice solamente la marca
Constructor sin parámetros
Escribe el método “imprimirDatos” dentro de la clase “Auto”, que al ser invocado imprima en consola su marca, modelo y año. Teniendo en cuenta que algunos atributos pueden no ser inicializados, el método “print” debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar un mensaje en el caso de haber sido inicializado con el constructor sin parámetros. 
Crea al menos 4 objetos para poder probar todos los constructores de la clase, con diferentes valores y muestra sus atributos en la consola.
*/

public class Auto {
    //atributos
    private String marca;
    private String modelo;
    public int anio;

    //constructores
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {}

    //metodo
    public void imprimirDatos() {
        if(this.marca != null) {
            System.out.println("Marca: " + this.marca);
        }
        if(this.modelo != null) {
            System.out.println("Modelo: " + this.modelo);
        }
        if(this.anio >= 1900) {
            System.out.println("Año: " + this.anio);
        }
        if (this.marca == null && this.modelo == null && this.anio == 0) {
            System.out.println("Objeto inicializado con constructor sin parámetros");
        };
        
    };

    /*
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Ethios", 2019);
        System.out.println("*** AUTO 1 ***");
        auto1.imprimirDatos();
        Auto auto2 = new Auto("Toyota", "Ethios");
        System.out.println("*** AUTO 2 ***");
        auto2.imprimirDatos();
        Auto auto3 = new Auto("Toyota");
        System.out.println("*** AUTO 3 ***");
        auto3.imprimirDatos();
        Auto auto4 = new Auto();
        System.out.println("*** AUTO 4 ***");
        auto4.imprimirDatos();
    };
    */
};