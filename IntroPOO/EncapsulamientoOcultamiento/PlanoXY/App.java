package IntroPOO.EncapsulamientoOcultamiento.PlanoXY;
import java.util.Scanner;
/*
 * En la clase ejecutable, declara una variable global
 * como un arreglo de objetos 'Punto' 
 * para almacenar las instancias creadas."
*/

public class App {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        Punto[] puntos = new Punto[5];
        int option;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear nuevo punto.");
            System.out.println("2. Calcular distancia de un punto desde el punto de origen.");
            System.out.println("3. Calcular distancia entre dos puntos.");
            System.out.println("4. Saber si tres puntos estan alineados.");
            System.out.println("5. Salir.");
            System.out.println("Ingresa tu opción: ");
            option = miScanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingresa coordenadas del punto");
                    double x = miScanner.nextDouble();
                    double y = miScanner.nextDouble();

                    Punto newPunto = new Punto(x, y);
                    puntos[Punto.getCantidadPuntos() - 1] = newPunto;
                    System.out.println("Almacenado en el indice " + (Punto.getCantidadPuntos() - 1));
                    break;
                case 2:
                    System.out.println("Ingrese el indice del punto que quiere medir: ");
                    int index = miScanner.nextInt();

                    if (index >= 0 && index < Punto.getCantidadPuntos()) {
                        System.out.println("entro al if pero no anda");
                        //System.out.println("Distancia: " + (puntos[index].distanciaDesdeOrigen()) );
                    } else {
                        System.out.println("Ingrese un índice válido.");
                    }
                    break;
                case 3:
                    System.out.println("calcula la distancia entre dos puntos");
                    break;
                case 4:
                    System.out.println("muestra si los tres puntos seleccionados estan alineados");
                    break;
                case 5:
                    miScanner.close();
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Ingrese una opcion válida");
                    break;
            }
        } while (option != 5);
    }
}
