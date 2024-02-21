import Ejercicios_Repaso_Objetos.Ejercicio1.Libro;

import java.util.*;

public class Ejercicios_Repaso_Objetos {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Ejercicio: ");
            int ej = scanner.nextInt();
            scanner.nextLine();

            switch (ej) {
                case 1 -> ej1();
                case 2 -> ej2();
                default -> System.out.println("Ejercicio no válido");
            }
            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1:
    //Vamos a crear una clase Libro, que tiene los siguientes atributos, String titulo, String autor.
    //Queremos crear varios libros por ejemplo:
    //Libro libro1 = new Libro("Don quijote", "Cervantes");
    //Libro libro2 = new Libro("Orgullo y prejuicio", "Jane Austen");
    //Libro libro3 = new Libro("Frankenstein", "Mary Shelley");
    //Libro libro4 = new Libro("Don quijote", "Cervantes");
    //Libro libro5 = new Libro("Don quijote", "Cervantes");
    //Libro libro6 = new Libro("Don quijote", "Cervantes");
    //Libro libro7 = new Libro("Los tres mosqueteros", "Alexandre Dumas");
    //Libro libro8 = new Libro("Don quijote", "Cervantes");
    //Libro libro9 = new Libro("Cumbres borrascosas", "Emily Brontë");

    private static void ej1() {
        class Libro {
            private String titulo;
            private String autor;

            public Libro(String titulo, String autor) {
                this.titulo = titulo;
                this.autor = autor;
            }
            public String getTitulo() {
                return titulo;
            }
            public String getAutor() {
                return autor;
            }
        }

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Don quijote", "Cervantes"));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen"));
        libros.add(new Libro("Frankenstein", "Mary Shelley"));
        libros.add(new Libro("Don quijote", "Cervantes"));
        libros.add(new Libro("Don quijote", "Cervantes"));
        libros.add(new Libro("Don quijote", "Cervantes"));
        libros.add(new Libro("Los tres mosqueteros", "Alexandre Dumas"));
        libros.add(new Libro("Don quijote", "Cervantes"));
        libros.add(new Libro("Cumbres borrascosas", "Emily Brontë"));

        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Ahora debemos de guardar los libros creados en un ArrayList, pero debes de eliminar los
    //duplicados por lo que Don quijote de Cervantes, solo debería estar en el ArrayList una vez.
    //Imprime el ArrayList para comprobar que no hay duplicados.
    //Ejercicio 2:
    //Realiza el mismo ejercicio en Python, en lugar de un ArrayList usa una Lista.

    private static void ej2() {
        class Libro {
            String titulo;
            String autor;

            Libro(String titulo, String autor) {
                this.titulo = titulo;
                this.autor = autor;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Libro libro = (Libro) o;
                return Objects.equals(titulo, libro.titulo) &&
                        Objects.equals(autor, libro.autor);
            }

            @Override
            public int hashCode() {
                return Objects.hash(titulo, autor);
            }
        }

        Set<Libro> setLibros = new HashSet<>();

        // Añade tus libros aquí
        setLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
        setLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));

        List<Libro> listaLibros = new ArrayList<>(setLibros);

        for (Libro libro : listaLibros) {
            System.out.println(libro.titulo + ", " + libro.autor);
        }
    }
}