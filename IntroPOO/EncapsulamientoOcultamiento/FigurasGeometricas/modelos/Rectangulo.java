package IntroPOO.EncapsulamientoOcultamiento.FigurasGeometricas.modelos;

public class Rectangulo {
    //atributos
    private double alto;
    private double ancho;

    //constructores
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;

        System.out.println("Rectangulo creado de altura " + this.alto + " y base " + this.ancho);
    }

    public Rectangulo() {
        System.out.println("Rectangulo creado sin parametros");
    }

    //Getters & Setters
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //Calculo de medidas
    public double area() {
        return ancho * alto;
    };

    public double perimetro() {
        return (ancho * alto)/2;
    };

    //impresion de datos
    public void mostrarDatos() {
        System.out.println("El rectangulo creado tiene las siguientes características: \n" +
        "Ancho: " + this.ancho + "\n" +
        "Alto: " + this.alto + "\n" +
        "Perimetro: " + perimetro() + "\n" +
        "Área: " + area());
    };
}
