package abstraccionInterfaces.biblioteca;
/*
 
Crea la clase “Biblioteca” que contenga un arreglo de objetos
 “Libro” para mantener un catálogo de libros disponibles en 
 la biblioteca. La biblioteca también debe tener un método 
 para agregar libros al catálogo.

Crear una instancia de la clase Biblioteca y agregar varios 
libros al catálogo 

Implementa un menú por consola que permite al usuario agregar
libros a la biblioteca y mostrar la información de los libros
en el catálogo.
 */
public class Libro extends itemBiblioteca {
    /*
    * Agregar los atributos “titulo”, “autor” y “numeroDePaginas”
    *  a la clase “Libro”. Además, implementa un método “mostrarInformación()”
    *  que muestre la información del libro en consola. En este caso, 
    * solo hay 1  ejemplar por título, por lo que no debe existir
    *  un atributo que controle la cantidad de ejemplares. 
    */
  
    // atributos
    private String titulo;
    private String autor;
    private int numPag;

    //constructor
    public Libro(String titulo, String autor,int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    };

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numPag);
    };

    @Override
    public int prestar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prestar'");
    }

    @Override
    public int devolver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolver'");
    }

    @Override
    public double camcularMulta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'camcularMulta'");
    }
    
}
