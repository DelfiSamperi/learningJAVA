package IntroPOO.EncapsulamientoOcultamiento.FigurasGeometricas.modelos;
/*
 * Define los atributos necesarios para calcular el área y el perímetro de la figura geométrica. Implementa 
 * los modificadores de acceso adecuados para estos atributos y crea getters y setters según sea necesario. Además, 
desarrolla métodos para calcular el área y el perímetro del círculo.
Asegúrate de especificar los parámetros necesarios y el tipo de retorno de estos métodos.
 */

 public class Circulo {
    private double radio;

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //getters & setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }    

    //Calculo de medidas
    public double area() {
        return Math.PI * radio * radio;
        
    };

    public double perimetro() {
        return 2 * Math.PI * radio;
    };

    public void mostrarDatos() {
        System.out.println("El circulo creado tiene las siguientes características: \n" +
        "Radio: " + this.radio + "\n" +
        "Perimetro: " + perimetro() + "\n" +
        "Área: " + area());
    }
}
