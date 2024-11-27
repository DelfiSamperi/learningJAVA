package modelos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        int base;
        int alto;
        int ancho;
        double radio;
        
        Scanner prompt = new Scanner(System.in);
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        option = prompt.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ingresa el Ancho: ");
                ancho = prompt.nextInt();
                System.out.println("Ingrese el alto: ");
                alto = prompt.nextInt();
                Rectangulo rectangulo = new Rectangulo(ancho, alto);
                rectangulo.mostrarDatos();
                break;
        
            default:
                break;
        }
    }
}

/*
 import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int option;
int base;
int alto;
int ancho;
double radio;
Scanner prompt = new Scanner(System.in);
System.out.println("Selecciona una opción");
System.out.println("1. Crear rectángulo");
System.out.println("2. Crear triángulo");
System.out.println("3. Crear cículo");
option = prompt.nextInt();

switch (option) {
case 1:
System.out.println("Ingresa el Ancho:");
ancho = prompt.nextInt();
System.out.println("Ingresa el Alto:");
alto = prompt.nextInt();
Rectangulo rectangulo = new Rectangulo(ancho,alto);
rectangulo.mostrarDatos();
break;
case 2:
System.out.println("Ingresa la base:");
base = prompt.nextInt();
System.out.println("Ingresa el Alto:");
alto = prompt.nextInt();
Triangulo triangulo = new Triangulo(base,alto);
triangulo.mostrarDatos();
break;
case 3:
System.out.println("Ingresa el radio:");
radio = prompt.nextDouble();
Circulo circulo = new Circulo(radio);
circulo.mostrarDatos();
break;
default:
}
}
}

Rectangulo:

public class Rectangulo {
// Attributos
private int ancho;
private int alto;

// Constructors
public Rectangulo() {
}

public Rectangulo(int ancho, int alto) {
this.ancho = ancho;
this.alto = alto;
}

// Getters and Setters
public int getAncho() {
return ancho;
}

public void setAncho(int ancho) {
this.ancho = ancho;
}

public int getAlto() {
return alto;
}

public void setAlto(int alto) {
this.alto = alto;
}

public int area() {
return ancho * alto;
}

public int perimetro() {
return (ancho*2) + (alto*2);
}

public void mostrarDatos() {
System.out.println("El área es: " + this.area());
System.out.println("El perímetro es: " + this.perimetro());
}
}

public class Triangulo {
// Atributos
private int base;
private int altura;

public Triangulo(int base, int altura) {
this.base = base;
this.altura = altura;
}

public int getBase() {
return base;
}

public void setBase(int base) {
this.base = base;
}

public int getAltura() {
return altura;
}

public void setAltura(int altura) {
this.altura = altura;
}

public int area() {
return (altura*base)/2;
}

public int perimetro() {
// return (altura*base)/2;
return 0;
}

public void mostrarDatos() {
System.out.println("El área es: "+ this.area());
// System.out.println("El perímetro es: "+ this.perimetro());
}
}

Yeison Rodriguez
a

Everyone

20:49 hs
public class Circulo {
private double radio;

public Circulo(double radio) {
this.radio = radio;
}

public double getRadio() {
return radio;
}

public void setRadio(double radio) {
this.radio = radio;
}

public double area() {
return Math.PI*Math.pow(radio, 2);
}

public double perimetro() {
return 2*Math.PI*radio;
}

public void mostrarDatos() {
System.out.println("El área es: "+ this.area());
System.out.println("El perímetro es: "+ this.perimetro());
}
}
 */
