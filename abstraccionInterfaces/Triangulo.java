package abstraccionInterfaces;

public class Triangulo extends Figura {
    double lado;
    
    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        double area = (lado * lado);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
