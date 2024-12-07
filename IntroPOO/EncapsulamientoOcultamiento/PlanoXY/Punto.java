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
    // atributos
    private double x;
    private double y;
    public static int cantidadPuntos = 0;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        cantidadPuntos++;
        System.out.println("Punto creado en las coordenandas " + this.x + " - " + this.y);
    }

    // Getters & Setters
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

    // Metodo de instancia para calcular distancia desde origen
    public double distanciaDesdeOrigen() {
        // System.out.println("El punto se encuentra a " + this.x + " en el eje X y " +
        // this.y + " en el eje Y.");
        // distancia desde origen usando teorema de pitagoras
        return Math.sqrt(x * x + y * y);
    }

    // metodo estatico para calcular distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        double deltaX = p2.getX() - p1.getX();
        double deltaY = p2.getY() - p1.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // metodo estatico para verificar si tres puntos estan alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        // Fórmula: (y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)
        // Para evitar divisiones (x2-x1)*(y3-y2) == (y2-y1)*(x3-x2)
        double diferencia = (p2.getX() - p1.getX()) * (p3.getY() - p2.getY()) -
                (p2.getY() - p1.getY()) * (p3.getX() - p2.getX());
        return Math.abs(diferencia) < 1e-9; // Usamos tolerancia para evitar errores de punto flotante
    }

}
