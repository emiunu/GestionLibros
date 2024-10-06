# Gestión de Libros en Biblioteca

Este proyecto permite a una biblioteca gestionar sus libros. El sistema permite agregar libros, prestarlos, devolverlos, buscar libros por título o autor, eliminar libros y consultar cuáles están disponibles.

## Estructura del Proyecto

El programa se basa en dos clases principales: Libro y Biblioteca, que trabajan juntas para administrar los libros.

### Clase Libro

#### Atributos:
- **titulo** (String): El título del libro.
- **autor** (String): El nombre del autor del libro.
- **genero** (String): El género del libro.
- **ISBN** (String): El código ISBN del libro.
- **cantidadDisponible** (int): La cantidad disponible del libro.
- **disponible** (boolean): Indica si el libro está disponible o no para ser prestado.

#### Métodos:
- **Constructor**: Inicializa los atributos.
- **Getters y setters** para cada atributo.
- **prestar()**: Reduce cantidadDisponible en 1 y marca el libro como no disponible si no quedan copias.
- **devolver()**: Aumenta cantidadDisponible en 1 y marca el libro como disponible si antes no había copias.
- **mostrarInfo()**: Muestra la información completa del libro (título, autor, género, ISBN, cantidad disponible y si está disponible o no).

### Clase Biblioteca

#### Atributos:
- **nombre** (String): El nombre de la biblioteca.
- **libros** (ArrayList\<Libro\>): Lista de libros que tiene la biblioteca.

#### Métodos:
- **Constructor**: Inicializa el nombre de la biblioteca y crea una lista vacía de libros.
- **agregarLibro(Libro libro)**: Agrega un libro a la lista. Si el libro ya existe (mismo ISBN), aumenta la cantidad disponible en lugar de añadir uno nuevo.
- **mostrarLibrosDisponibles()**: Muestra solo los libros que están disponibles para ser prestados.
- **buscarLibroPorTitulo(String titulo)**: Busca un libro por su título y lo devuelve si lo encuentra.
- **buscarLibrosPorAutor(String autor)**: Busca todos los libros de un autor y los devuelve.
- **eliminarLibro(String titulo)**: Elimina un libro de la lista si el título coincide y la cantidad disponible es cero.
- **prestarLibro(String titulo)**: Busca un libro por título y lo presta si está disponible.
- **devolverLibro(String titulo)**: Busca un libro por título y lo devuelve.



**En el método main de la clase principal, se realizan las siguientes operaciones:**

1. Crear un objeto de la clase Biblioteca.
2. Crear varios objetos de la clase Libro y agregarlos a la biblioteca.
3. Mostrar la lista de libros disponibles.
4. Prestar un libro y volver a mostrar la lista de libros disponibles.
5. Devolver un libro y mostrar nuevamente la lista de libros disponibles.
6. Buscar un libro por su título.
7. Buscar libros de un autor específico.
8. Eliminar un libro de la biblioteca y mostrar la lista actualizada de libros.

