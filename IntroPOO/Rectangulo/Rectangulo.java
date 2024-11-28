package IntroPOO.Rectangulo;

/*
 * Actividad: Trabajando con una figura geométrica
 * Crea una clase llamada Rectangulo
 * 
 * Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.
 * 
 * Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y que lleve un registro del número 
 * total de instancias de 'Rectangulo' creadas.
 * 
 * Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y que incremente en 
 * uno el valor de 'contadorRectangulos'.
 * 
 * Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables de calcular el área 
 * y el perímetro del rectángulo, respectivamente.
 * 
 * Implementa un método llamado imprimirArea para mostrar el resultado por consola;
 * 
 * Implementa un método llamado imprimirPerimetro para mostrar el resultado por consola;
 * 
 * Implementa un método estático que permita obtener el número total de rectángulos creados hasta el momento.
 * 
 * Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' y acceder a sus métodos
 * para obtener información relevante.
 * 
 * 📌 Sugerencia: Utiliza un arreglo de rectángulos para guardar las instancias de la clase “Rectángulo” creadas.
*/

public class Rectangulo {
    //atributos
    private double alto;
    private double ancho;
    //atributo static no se puede acceder ni modificar desde una instancia de la clase.
    public static int contadorRectangulos = 0;

    //constructor
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
        contadorRectangulos++;
        System.out.println(" --- ");
        System.out.println("*** Rectángulo N° " + contadorRectangulos + " ***");
        System.out.println("Altura -> " + this.alto);
        System.out.println("Base -> " + this.ancho);
    };

    public double area() {
        return ancho * alto;
    };

    public double perimetro() {
        return (ancho * alto)/2;
    };

    public static int getContadorRectangulos() {
        return contadorRectangulos;
    }

    public void imprimirArea() {
        System.out.println("El area del rectangulo es: " + area());
    };

    public void imprimirPerimetro() {
        System.out.println("Perimetro del rectangulo es: " + perimetro());
    };

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5,8);
        rectangulo1.imprimirArea();
        rectangulo1.imprimirPerimetro();

        Rectangulo rectangulo2 = new Rectangulo(4.25,12.50);
        rectangulo2.imprimirArea();
        rectangulo2.imprimirPerimetro();

        Rectangulo rectangulo3 = new Rectangulo(7.50,3.75);
        rectangulo3.imprimirArea();
        rectangulo3.imprimirPerimetro();
    }
    
};