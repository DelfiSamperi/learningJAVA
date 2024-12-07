package IntroPOO.GestionEmpleados;

import java.util.ArrayList;

public class Empleado {
    //atributos
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;
    public static int cantEmpleados = 0;


    //constructor
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
        cantEmpleados++;
        
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static int getCantEmpleados() {
        return cantEmpleados;
    };

    public void imprimirEmpleado() {
        System.out.println("Datos del empleado: \n " +
                            "Nombre: " + getNombre() + "\n" +
                            "Edad: " + getEdad() + "\n" +
                            "Salario: " + getSalario() + "\n" +
                            "Departamento: " + getDepartamento()
        );  
    }
    /*
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Elsa Quito", 34, 850.60, "Administracion");
        Empleado empleado2 = new Empleado("Juan Perez", 58, 800.40, "Logistica");
        Empleado empleado3 = new Empleado("Esteban Quito", 42, 950.60, "Logistica");
        Empleado empleado4 = new Empleado("Otro Juan", 27, 790.60, "Logistica");
        Empleado empleado5 = new Empleado("Susana Oria", 48, 940.30, "Administracion");
        Empleado empleado6 = new Empleado("Roberto Carlos", 25, 830.60, "Mantenimiento");
        Empleado empleado7 = new Empleado("Elena Nito", 37, 890.60, "Mantenimiento");
    };
    */

    /*
     * Mostrar todos los empleados: Este método se encarga de recibir un arreglo de objetos empleados e imprimir en 
     * consola la lista de empleados creados. La información se presentará en formato de tabla, donde la primera columna 
     * mostrará el número de fila y la primera fila contendrá los encabezados de cada columna.
    */
    public static void mostrarEmpleados(Empleado[] empleados) {
        // Encabezado de la tabla
        System.out.printf("%-10s %-20s %-10s %-10s %-15s%n", "Fila", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("--------------------------------------------------------------------");

        // Recorrer el arreglo y mostrar los datos
        for (int i = 0; i < empleados.length; i++) {
            Empleado empleado = empleados[i];
            if(empleado != null) {
                System.out.printf("%-10d %-20s %-10d %-10.2f %-15s%n", i + 1, empleado.getNombre(), empleado.getEdad(), empleado.getSalario(), empleado.getDepartamento());
            } else {
                System.out.printf("%-10d %-15s %-10s %-10s %-15s%n", i +1, "N/A", "N/A", "N/A", "N/A");
            }
        }
    }

    /*
     * Filtrar empleados: Al recibir un arreglo de empleados, este método devolverá un nuevo arreglo filtrado según 
     * criterios específicos. Los filtros pueden aplicarse por nombre, edad, salario o departamento. El método recibirá 
     * la información del atributo por el cual se desea filtrar, y en caso de nombre y departamento, se proporcionará un 
     * String para el filtrado, mientras que para salario y edad se especificarán valores numéricos máximo y mínimo.
     */
    public static Empleado[] filtrarEmpleados(Empleado[] empleados, int opt, String filtroString, int min, int max) {
        ArrayList<Empleado> filtrados = new ArrayList<>();

        for(Empleado empleado:empleados) {
            if(empleado == null) continue;

            switch(opt) {
                case 1:
                    if(empleado.getNombre().equalsIgnoreCase(filtroString)) {
                        filtrados.add(empleado);
                    }
                break;
                case 2:
                    if(empleado.getEdad() >= min && empleado.getEdad() <= max) {
                        filtrados.add(empleado);
                    }
                break;
                case 3:
                    if(empleado.getSalario() >= min && empleado.getSalario() <= max) {
                        filtrados.add(empleado);
                    };
                break;
                case 4:
                    if(empleado.getDepartamento().equalsIgnoreCase(filtroString)) {
                        filtrados.add(empleado);
                    };
                break;
                default:
                System.out.println("Ingrese un criterio de filtrado valido.");
            }
        }
        //convertir a arreglo y devolver
        return filtrados.toArray(new Empleado[0]);
        
    }

     /*
     * Ordenar empleados: Este método recibirá el arreglo de empleados y el atributo por el cual se desea ordenar. 
     * Utilizará el algoritmo de ordenamiento de burbuja para realizar el ordenamiento y devolverá el arreglo de 
     * empleados ordenado según el criterio especificado.
     */
    public static void ordenarEmpleados() {
        
    }
    /*  
     * Buscar por nombre: Recibirá un arreglo de empleados y un nombre, devolviendo el primer objeto empleado que 
     * coincida con dicho nombre.
     */
    public static int buscarNombre(Empleado[] empleados, String nombre) {
        for(int i = 0; i < empleados.length; i++) {
            if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    /* 
     * Incrementar salario: Este método recibirá un objeto empleado y un porcentaje de aumento salarial. Devolverá el
     * mismo objeto con su salario incrementado según el porcentaje proporcionado.
    */
    public static void aumentarSalario() {

    }
}