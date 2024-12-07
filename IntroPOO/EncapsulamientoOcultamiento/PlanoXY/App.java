package IntroPOO.EncapsulamientoOcultamiento.PlanoXY;
import java.util.Scanner;
/*
 * En la clase ejecutable, declara una variable global
 * como un arreglo de objetos 'Punto' 
 * para almacenar las instancias creadas."
*/

public class App {
    //arreglo global para almacenar puntos
    private static Punto[] puntos;

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        //inicializo el arreglo
        puntos = new Punto[3];
        // Crear y almacenar puntos
        /* DE PRUEBA
        puntos[0] = new Punto(3, 4);  
        puntos[1] = new Punto(6, 8); 
        puntos[2] = new Punto(9, 12); 
        */
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
                        //System.out.println("entro al if pero no anda");
                        System.out.println("Distancia: " + (puntos[index].distanciaDesdeOrigen()) );
                    } else {
                        System.out.println("Ingrese un índice válido.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el indice del primer punto a calcular: ");
                    int index1 = miScanner.nextInt();
                    System.out.println("Ingrese el indice del segundo punto a calcular: ");
                    int index2 = miScanner.nextInt();
                    if(index1 >= 0 && index1 < Punto.getCantidadPuntos() && index2 >= 0 && index2 < Punto.getCantidadPuntos() && index1 != index2) {
                        double distancia = Punto.calcularDistancia(puntos[index1], puntos[index2]);
                        System.out.println("Distancia entre los dos puntos: " + distancia);
                    } else {
                        System.out.println("Ingrese indices validos.");
                    }
                    break;
                case 4:
                boolean alineados = Punto.estanAlineados(puntos[0], puntos[1], puntos[2]);
                    System.out.println("Puntos alineados: " + alineados);
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
