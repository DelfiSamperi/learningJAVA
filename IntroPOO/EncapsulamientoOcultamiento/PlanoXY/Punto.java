package IntroPOO.EncapsulamientoOcultamiento.PlanoXY;
/*
 * Actividad: Plano X - Y
Considerando lo aprendido en la actividad realizada anteriormente, crea un nuevo proyecto para cumplir 
con los siguientes objetivos: 

Crea una clase llamada 'Punto' que representa un punto en un plano bidimensional.
Define 2 atributos para la clase del tipo private: x e y que representan las coordenadas del punto.
Crea los métodos getter y setter de todos los atributos de la clase. 

Crea un método de instancia llamado 'distanciaDesdeOrigen', que calcula y devuelve la distancia del punto desde el origen (0,0).
Crea un método para cálculos entre puntos, estático, llamado 'calcularDistancia' en la clase 'Punto'. Este método recibe dos objetos de la misma clase y calcula la distancia entre ellos.
Crea un método estático para cálculos entre puntos, llamado 'estanAlineados' en la clase 'Punto'. Este método recibe tres objetos de la clase 'Punto' y determina si los puntos dados están alineados en la misma recta

En la clase ejecutable, declara una variable global como un arreglo de objetos 'Punto' para almacenar las instancias creadas."
*/

public class Punto {
    //atributos
    private double x;
    private double y;
    public static int cantidadPuntos = 0;

    //Getters & Setters
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static int getCantidadPuntos() {
        return cantidadPuntos;
    };

    //Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        cantidadPuntos++;
        System.out.println("Punto creado en las coordenandas " + this.x + " - " + this.y);
    }

    public void distanciaDesdeOrigen() {
        System.out.println("El punto se encuentra a " + this.x + " en el eje X y " + this.y + " en el eje Y.");
    }

    public static void calcularDistancia() {

    }

    public static void estanAlineados() {

    }
    
}
