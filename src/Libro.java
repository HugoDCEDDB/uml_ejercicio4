public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    //si está disponible y lo vas a prestar, das por hecho que se lo lleva entonces lo marca como no disponible y devuelve true
    public boolean prestar() {
        if (this.disponible == true) {
            this.disponible = false;
            return true;
        } else {
            return false;
        }
    }

    // lo marca de nuevo como disponible
    public void devolver() {
        this.disponible = true;
    }

    public void mostrarFicha() {
        if (this.disponible == true) {
            System.out.println("Libro: " + titulo + " (" + autor + ") - disponible");
        } else {
            System.out.println("Libro: " + titulo + " (" + autor + ") - prestado");
        }
    }

    // devuelve el título
    public String getTitulo() {
        return this.titulo;
    }
}
