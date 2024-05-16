package org.example.ejercicio7;

import org.example.ejercicio1.Book;
import org.example.ejercicio3.Library;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Author {
    private String name;
    private String booksWritten;
    private List<Book> libros = new ArrayList<>();

    public Author(String name, String booksWritten, List<Book> libros) {
        this.name = name;
        this.booksWritten = booksWritten;
        this.libros = libros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(String booksWritten) {
        this.booksWritten = booksWritten;
    }

    public List<Book> getLibros() {
        return libros;
    }

    public void setLibros(List<Book> libros) {
        this.libros = libros;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", booksWritten='" + booksWritten + '\'' +
                ", libros=" + libros +
                '}';
    }
}
