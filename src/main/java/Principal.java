public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.inicializar();
    }

    public void inicializar(){
        Biblioteca biblioteca = new Biblioteca("Biblioteca");
        //Creando objetos de tipo libro
        Libro principito = new Libro("Principito","Antoine de Saint-Exupéry","Literatura infantil", "9789561236745", 12, true);
        Libro coraline = new Libro("Coraline","Neil Gaiman","Terror","9788478885794",1,true);
        Libro juegoDeTronos = new Libro("Juego de Tronos","George RR Martin", "Fantasia","9788466374934", 2,true);
        Libro choqueDeReyes = new Libro("Choque de Reyes", "George RR Martin","Fantasia","9788466374941",1,true);
        //Agregando los libros a la biblioteca
        biblioteca.agregarLibro(principito);
        biblioteca.agregarLibro(coraline);
        biblioteca.agregarLibro(choqueDeReyes);
        biblioteca.agregarLibro(juegoDeTronos);
        //Mostrando libros disponibles
        biblioteca.mostrarLibrosDisponibles();
        //Prestando un libro cambiando su disponibilidad
        biblioteca.prestarLibro("Coraline");
        biblioteca.mostrarLibrosDisponibles();
        //Devolviendo el libro
        biblioteca.devolverLibro("Coraline");
        biblioteca.mostrarLibrosDisponibles();
        //Buscando libro por título
        System.out.println("BUSCANDO POR TITULO:");
        System.out.println(biblioteca.buscarLibroPorTitulo("Principito").toString());
        //Buscando libros por autor
        System.out.println("BUSCANDO POR AUTOR:");
        biblioteca.buscarLibroPorAutor("George RR Martin");
        //Eliminando libro, primero dejando cantidad disponible igual a cero
        biblioteca.prestarLibro("Choque de Reyes");
        biblioteca.eliminarLibro("Choque de Reyes");
        biblioteca.mostrarLibrosDisponibles();

    }
}
