import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        if (buscarLibroPorTitulo(libro.getTitulo()) == null){
            this.libros.add(libro);
        } else {
            libro.setCantidadDisponible(libro.getCantidadDisponible() + 1);
        }
    }

    public Libro buscarLibroPorTitulo(String titulo){
        for (Libro libro : this.libros){
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    public void buscarLibroPorAutor(String autor){
        for (Libro libro : this.libros){
            if (libro.getAutor().equals(autor)){
                System.out.println(libro.toString());
            }
        }
    }

    public void eliminarLibro(String titulo){
        for (Libro libro : libros){
            if (libro.getTitulo().equals(titulo) && libro.getCantidadDisponible() == 0){
                this.libros.remove(libro);
            }
        }
    }

    public void prestarLibro(String titulo){
        for (Libro libro : libros){
            if (libro.getTitulo().equals(titulo) && libro.getCantidadDisponible() > 0){
                libro.prestar();
                if (libro.getCantidadDisponible() == 0){
                    libro.setDisponible(false);
                }
            }
        }
    }

    public void devolverLibro(String titulo){
        for (Libro libro : libros){
            if (libro.getTitulo().equals(titulo)){
                libro.devolver();
                if (libro.getCantidadDisponible() > 0){
                    libro.setDisponible(true);
                }
            }
        }
    }

    public void mostrarLibrosDisponibles(){
        System.out.println("------LIBROS------");
        for (Libro libro : libros){
            if (libro.isDisponible()) {
                System.out.println(libro.toString());
            }
        }
        System.out.println("------FIN DE LISTADO------");
    }
}
