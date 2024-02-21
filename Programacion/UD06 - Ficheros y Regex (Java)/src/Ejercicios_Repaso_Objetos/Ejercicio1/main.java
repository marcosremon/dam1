package Ejercicios_Repaso_Objetos.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

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

        Libro[] ListaLibros = {libro1,libro2, libro3, libro4, libro5, libro6, libro7, libro8, libro9};
        for (Libro libro : ListaLibros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        }
    }
}
