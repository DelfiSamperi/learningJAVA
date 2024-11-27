package sistemaGestion.modelos;
//Dentro de la carpeta “modelos” crea la clase “Empleado” con los
//atributos nombre, edad, salario y departamento. Todos sus atributos
//deben ser declarados como privados y deben contar con sus métodos
//getter y setter. 

public class Empleado {
    private String nombre;
    private Integer edad;
    private Integer salario;
    private String departamento;

    //Constructores
    public Empleado (String nombre, Integer edad, Integer salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Getters & Setters
    

}

/*
 * package POO_Intro.sistema_de_gestion.modelos;

import java.util.List;

//Getters y Setters
public String getNombre() {
return nombre;
}


public void setNombre(String nombre) {
this.nombre = nombre;
}


public Integer getEdad() {
return edad;
}


public void setEdad(Integer edad) {
this.edad = edad;
}


public Integer getSalario() {
return salario;
}


public void setSalario(Integer salario) {
this.salario = salario;
}


public String getDepartamento() {
return departamento;
}


public void setDepartamento(String departamento) {
this.departamento = departamento;
}

public void mostrarTodosEmpleados(List empleados){
int contador=1;
System.out.println("Numero Nombre Edad Salario Departamento");
for (Empleado e : empleados) {
System.out.println(contador+" "+e.nombre+" "+e.edad+" "+e.salario+" "+e.departamento);
contador++;
}

}

public


}

Reddmar
a

Everyone

20:05 hs
https://stackoverflow.com/questions/24112715/java-8-filter-array-using-lambda

Santino Roman Bertola Mercol
a

Everyone

20:13 hs
empleado -> empleado.getEdad() >= minValor && empleado.getEdad() <= maxValor;
 
___________

public static void mostrarTodosEmpleados(Empleado[] empleados){
System.out.println("Numero Nombre Edad Salario Departamento");
for (Empleado e : empleados) {
System.out.println(e.id+" "+e.nombre+" "+e.edad+" "+e.salario+" "+e.departamento);
}
}

public static Empleado[] filtrarEmpleado(Empleado[] empleados, String criterio, String elemento) {
return Arrays.stream(empleados).filter(e -> {
switch(criterio.toLowerCase()){
case "nombre" -> e.getNombre().equalsIgnoreCase(elemento);
case "departamento" -> e.getDepartamento().equalsIgnoreCase(elemento);
}
}).toArray(Empleado[]::new);
}

public static Empleado[] filtrarEmpleado(Empleado[] empleados, String criterio, int min, int max) {
return Arrays.stream(empleados).filter(e -> {
switch(criterio.toLowerCase()){
case "edad" -> e.getEdad() >= min && e.getEdad() <= max;
case "salario" -> e.getSalario() >= min && e.getSalario() <= max;
}
}).toArray(Empleado[]::new);
}

Reddmar
a

Everyone

20:34 hs
package modelos;

import java.util.Arrays;

public class Empleados {
private static int id = 0;
private String nombre;
private int edad;
private int salario; // Puede ser Float o Double
private String departamento;


public Empleados() {
}

public Empleados(int id, String nombre, int edad, int salario, String departamento) {
Empleados.id = id++;
this.nombre = nombre;
this.edad = edad;
this.salario = salario;
this.departamento = departamento;
}

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

public int getSalario() {
return salario;
}

public void setSalario(int salario) {
this.salario = salario;
}

public String getDepartamento() {
return departamento;
}

public void setDepartamento(String departamento) {
this.departamento = departamento;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public static void mostrarTodosEmpleados(Empleado[] empleados){
System.out.println("Numero Nombre Edad Salario Departamento");
for (Empleado e : empleados) {
System.out.println(e.id+" "+e.nombre+" "+e.edad+" "+e.salario+" "+e.departamento);
}
}

public static Empleado[] filtrarEmpleado(Empleado[] empleados, String criterio, String elemento) {
return Arrays.stream(empleados).filter(e -> {
switch(criterio.toLowerCase()){
case "nombre" -> e.getNombre().equalsIgnoreCase(elemento);
case "departamento" -> e.getDepartamento().equalsIgnoreCase(elemento);
}
}).toArray(Empleado[]::new);
}

public static Empleado[] filtrarEmpleado(Empleado[] empleados, String criterio, int min, int max) {
return Arrays.stream(empleados).filter(e -> {
switch(criterio.toLowerCase()){
case "edad" -> e.getEdad() >= min && e.getEdad() <= max;
case "salario" -> e.getSalario() >= min && e.getSalario() <= max;
}
}).toArray(Empleado[]::new);
}


}
*/
