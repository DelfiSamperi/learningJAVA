package objetos;

//Les comparto mi solución para la actividad Usando Constructores:
public class Auto {
    private String brand;
    private String model;
    private int year;

    public Auto(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Auto(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Auto(String brand) {
        this.brand = brand;
    }

    public Auto() {}

    public void imprimirDatos() {
        if (this.brand != null) {
            System.out.println("Marca: " + this.brand);
        }
        if (this.model != null) {
            System.out.println("Modelo: " + this.model);
        }
        if (this.year != 0) {
            System.out.println("Año: " + this.year);
        }
        if (this.brand == null && this.model == null && this.year == 0) {
            System.out.println("Objeto inicializado con constructor sin parámetros");
        }
    }
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "RAV4", 2000);
        auto1.imprimirDatos();
        Auto auto2 = new Auto("Toyota", "RAV4");
        auto2.imprimirDatos();
        Auto auto3 = new Auto("Toyota");
        auto3.imprimirDatos();
        Auto auto4 = new Auto();
        auto4.imprimirDatos();
    }
}