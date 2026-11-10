public class Socio {
    private String nombre;
    private int numeroSocio;
    private Libro libroActual;

    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.libroActual = null;
    }

    public void pedirLibro(Libro libro) {
        if (this.libroActual != null) {
            System.out.println(nombre + " ya tiene un libro: " + libroActual.getTitulo());
        }
        else {

            if (libro.prestar() == true) {
                this.libroActual = libro; // lo guarda en libroActual
                System.out.println(nombre + " se lleva " + libro.getTitulo());
            } else {
                System.out.println(libro.getTitulo() + " no esta disponible para " + nombre);
            }
        }
    }

    public void devolverLibro() {
        if (this.libroActual == null) {
            System.out.println(nombre + " no tiene ningun libro que devolver");
        }
        // Si lo tiene, lo devuelve y deja libroActual en null
        else {
            this.libroActual.devolver(); // le dice al libro que vuelva a estar disponible
            System.out.println(nombre + " devuelve " + libroActual.getTitulo());
            this.libroActual = null; // deja el atributo en null
        }
    }
}
