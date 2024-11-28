package IntroPOO.Rectangulo;

import java.util.Scanner;
/*
 * Desarrolla un menú interactivo que permita al usuario crear instancias de
 * 'Rectangulo' y acceder a sus métodos para obtener información relevante.
 * 
 * 📌 Sugerencia: Utiliza un arreglo de rectángulos para guardar las instancias
 * de la clase “Rectángulo” creadas.
 */

public class App {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        // array para guardar rectangulos (hasta 10)
        // Rectangulo -> tipo de dato de los elementos del arreglo seguido de [] para
        // indicar que es un arreglo
        // rectangulos es el nombre del arreglo
        // operador "new" indica el nombre de la clase (en este caso Rectangulo)
        // entre [] se deben indicar la cantidad de elementos que tendra.
        Rectangulo[] rectangulos = new Rectangulo[10];
        int option;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear nuevo rectángulo.");
            System.out.println("2. Calcular area y perimetro del rectangulo.");
            System.out.println("3. Ver cantidad de rectangulos creados.");
            System.out.println("4. Salir.");
            System.out.println("Ingresa tu opción: ");
            option = miScanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingresa altura del rectangulo: ");
                    double alto = miScanner.nextDouble();
                    System.out.println("Ingresa ancho del rectangulo: ");
                    double ancho = miScanner.nextDouble();

                    Rectangulo nuevoRectangulo = new Rectangulo(alto, ancho);
                    // entre [] indico el indice donde se almacena rectangulo1
                    rectangulos[Rectangulo.getContadorRectangulos() - 1] = nuevoRectangulo;

                    System.out
                            .println("Almacenado en el indice " + rectangulos[Rectangulo.getContadorRectangulos() - 1]);
                    break;

                case 2:
                    System.out.println("Ingrese el indice del rectangulo que quiere medir: ");
                    int index = miScanner.nextInt();

                    if (index >= 0 && index < Rectangulo.getContadorRectangulos()) {
                        System.out.println("Area del rectangulo: " + rectangulos[index].area());
                        System.out.println("Perímetro del rectangulo: " + rectangulos[index].perimetro());
                    } else {
                        System.out.println("Ingrese un índice válido.");
                    }
                    break;
                case 3:
                    System.out.println("Cantidad de rectangulos creados: " + Rectangulo.getContadorRectangulos());
                    break;
                case 4:
                    System.out.println("Muchas gracias. Vuelva pronto!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        } while (option != 4);
        miScanner.close();
    }
}
