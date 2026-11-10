public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("El Quijote", "Cervantes");
        Libro l2 = new Libro("Dune", "Frank Herbert");

        Socio s1 = new Socio("Marta", 101);
        Socio s2 = new Socio("Pablo", 102);

        s1.pedirLibro(l1);
        s2.pedirLibro(l1);
        s2.pedirLibro(l2);
        s2.pedirLibro(l1);
        s1.devolverLibro();
        s1.devolverLibro();

        l1.mostrarFicha();
        l2.mostrarFicha();
    }
}
