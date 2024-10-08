public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private int cantidadDisponible;
    private boolean disponible;

    public Libro (String titulo, String autor, String genero, String isbn, int cantidadDisponible, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.cantidadDisponible = cantidadDisponible;
        this.disponible = disponible;
    }

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

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar(){
        this.cantidadDisponible--;
    }

    public void devolver(){
        this.cantidadDisponible++;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + " |Autor: " + autor + " |Género: " + genero + "|ISBN: " + isbn + " |Cantidad disponible: " + cantidadDisponible + " |Disponible: " + disponible;
    }
}
