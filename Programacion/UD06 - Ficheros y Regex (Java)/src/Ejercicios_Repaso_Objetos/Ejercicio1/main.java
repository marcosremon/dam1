package Ejercicios_Repaso_Objetos.Ejercicio1;

import java.util.*;

public class main {
    public static void main(String[] args) {
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

        //Ahora debemos de guardar los libros creados en un ArrayList, pero debes de eliminar los
        //duplicados por lo que Don quijote de Cervantes, solo debería estar en el ArrayList una vez.
        //Imprime el ArrayList para comprobar que no hay duplicados.

//--------------------------------------------------------------------------------------------------------------

        List<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("Don quijote", "Cervantes");
        Libro libro2 = new Libro("Orgullo y prejuicio", "Jane Austen");
        Libro libro3 = new Libro("Frankenstein", "Mary Shelley");
        Libro libro4 = new Libro("Don quijote", "Cervantes");
        Libro libro5 = new Libro("Don quijote", "Cervantes");
        Libro libro6 = new Libro("Don quijote", "Cervantes");
        Libro libro7 = new Libro("Los tres mosqueteros", "Alexandre Dumas");
        Libro libro8 = new Libro("Don quijote", "Cervantes");
        Libro libro9 = new Libro("Cumbres borrascosas", "Emily Brontë");
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        libros.add(libro6);
        libros.add(libro7);
        libros.add(libro8);
        libros.add(libro9);

        Set<Libro> librosSinDupes = new LinkedHashSet<>(libros);
        for (Libro i : librosSinDupes) {
            System.out.println(i.getAutor() + " " + i.getTitulo());
        }
    }
}
