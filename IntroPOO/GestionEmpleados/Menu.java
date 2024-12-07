package IntroPOO.GestionEmpleados;
import java.util.Scanner;
/*
 * Mostrar todos los empleados
 * Crear empleado: esta opción debe validar que no exista otro empleado con el mismo nombre. 
 * En caso de que el usuario ingrese un empleado existente debe aparecer un mensaje de error y volver al menú principal.
 * Filtrar empleados: el usuario puede seleccionar el atributo a filtrar y el valor del filtro.
 * Ordenar empleados: el usuario puede seleccionar el atributo por el cual ordenar.
 * Incrementar salario: el usuario debe ingresar el nombre y el porcentaje de aumento.
 * Limpiar filtros: esto devuelve el arreglo de empleados que se muestra a su versión original.
 * Salir del programa.
*/
public class Menu {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int option;
        Empleado[] empleados = new Empleado[0];

        do {
            System.out.println("\nMenu");
            System.out.println("1. Crear empleado.");
            System.out.println("2. Filtrar empleados.");
            System.out.println("3. Ordenar empleados.");
            System.out.println("4. Incrementar salario.");
            System.out.println("5. Limpiar filtros.");
            System.out.println("6. Mostrar empleados.");
            System.out.println("7. Salir.");
            option = prompt.nextInt();

            switch (option) {
                case 1: //crear empleado
                
                    System.out.println("Ingrese datos del empleado: ");
                    prompt.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = prompt.nextLine();
                    //prompt.nextLine();
                    System.out.println("Edad: ");
                    int edad = prompt.nextInt();
                    prompt.nextLine();
                    System.out.println("Salario: ");
                    double salario = prompt.nextDouble();
                    prompt.nextLine();
                    System.out.println("Departamento: ");
                    String departamento = prompt.nextLine();
                    //se crea el nuevo objeto empleado
                    Empleado newEmpleado = new Empleado(nombre, edad, salario, departamento);

                    //empleados[Empleado.getCantEmpleados() - 1] = newEmpleado;
                
                  // hardcodeo para pruebas
                  /*
                  Empleado[] empleados = {
                    new Empleado("Elsa Quito", 34, 850.60, "Administracion"),
                    new Empleado("Juan Perez", 58, 800.40, "Logistica"),
                    new Empleado("Esteban Quito", 42, 950.60, "Logistica"),
                    new Empleado("Otro Juan", 27, 790.60, "Logistica"),
                    new Empleado("Susana Oria", 48, 940.30, "Administracion"),
                    new Empleado("Roberto Carlos", 25, 830.60, "Mantenimiento"),
                    new Empleado("Elena Nito", 37, 890.60, "Mantenimiento"),
                  };
                */
                  //verificar que no se almacene dos veces el mismo empleado pero funciona mal
                  
                    for( int i = 0; i < empleados.length; i++) {
                        if(empleados[i].getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("El empleado ya existe");
                        } else {
                            empleados[Empleado.getCantEmpleados() - 1] = newEmpleado;             
                        }
                    }
                               
                break;
                case 2: //filtrar empleados
                    System.out.println("\nIngrese criterio de filtrado: ");
                    System.out.println("1. Nombre");
                    System.out.println("2. Edad");
                    System.out.println("3. Salario");
                    System.out.println("4. Departamento");
                    int opt = prompt.nextInt();
                    int min = 0;
                    int max = 0;
                    String filtroString = "";
                    switch (opt) {
                        case 1:
                        case 4:
                            System.out.println("Ingrese valor de filtrado: ");
                            filtroString = prompt.nextLine();
                            break;
                        case 2:
                        case 3:
                            System.out.println("Ingrese valor minimo y maximo a filtrar: ");
                            min = prompt.nextInt();
                            max = prompt.nextInt();
                            break;
                        default:
                            System.out.println("Ingrese una opcion válida");
                        break;
                    }
                    //aplicar el filtro
                    Empleado[] filtrados = Empleado.filtrarEmpleados(empleados, opt, filtroString, min, max);
                    
                    //Muestro los resultados:
                    System.out.println("Empleados filtrados: ");
                    for(Empleado emp:filtrados) {
                        System.out.println(emp.getNombre() + " - " + emp.getEdad() + " - " + emp.getSalario() + " - " + emp.getDepartamento());
                    }
                    prompt.close();
                break;
                case 3: //ordeno los empleados
                    System.out.println("3. Ordenar empleados.");
                
                break;
                case 4:
                    System.out.println("4. Incrementar salario.");
                    
                break;
                case 5:
                    System.out.println("5. Limpiar filtros.");
                    break;
                case 6:
                    System.out.println("Lista de empleados: \n");
                    Empleado.mostrarEmpleados(empleados);
                    break;
                case 7:
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (option != 7);
        prompt.close();
    }
}