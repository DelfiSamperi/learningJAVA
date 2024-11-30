package IntroPOO.EncapsulamientoOcultamiento.FigurasGeometricas.modelos;
/*
 * Define los atributos necesarios para calcular el área de la figura geométrica. Implementa los modificadores de 
 * acceso adecuados para estos atributos y crea getters y setters según sea necesario. Además, desarrolla el método 
 * para calcular el área del triángulo. Implementa un método para imprimir los datos de dicha figura. Asegúrate de 
 * especificar los parámetros necesarios y el tipo de retorno de estos métodos.
 */

public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getbase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //calculo medidas
    public double area() {
        return (base * altura) / 2;
    };

    public void mostrarDatos() {
        System.out.println("El triangulo creado tiene las siguientes características: \n" +
        "Base: " + this.base + "\n" +
        "Altura: " + this.altura + "\n" +
        "Área: " + area());    
    };
    
}
