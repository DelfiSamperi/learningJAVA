package POOavanzado.biblioteca;

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
    private boolean prestado;

    //constructor
    public Libro(String titulo, String autor,int numPag, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.prestado = prestado;
    };

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numPag);
        System.out.println("Prestado: " + prestado);
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
