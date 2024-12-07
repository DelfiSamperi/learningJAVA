/*
 * La clase "Libro" debe tener tres atributos privados: "titulo", "autor" y "paginas".

Debes proporcionar métodos públicos para establecer y obtener el título y el autor.

Crea un método para establecer el número de páginas, teniendo en cuenta que este número surge del cálculo entre un número 
ingresado por el usuario multiplicado por 7. Ej: Si el usuario ingresa 20, la cantidad de páginas que tendrá ese libro 
es 140 (7*20).

Además, la clase debe tener un método público llamado "imprimirDetalles" que imprime por consola todos los detalles del 
libro, incluyendo el título, el autor y el número de páginas.

Almacena cada instancia creada  de Libro en un array.
Crea un método para imprimir TODOS los libros disponibles (solo su título).
 */

 public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int paginas;

    //getters & setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas * 7;
    }

    //constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void imprimirDetalles() {
        System.out.println("Detalles del libro: \n" +
        "Titulo: " + getTitulo() + "\n" +
        "Autor: " + getAutor() + "\n" +
        "Paginas: " + getPaginas());
    };
    
}