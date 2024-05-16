package org.example.ejercicio8;

import org.example.ejercicio1.Book;
import org.example.ejercicio7.Author;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Bookstore {
    private List<Book> libros = new ArrayList<>();
    private List<Author> autroes = new ArrayList<>();

    public Bookstore(List<Book> libros, List<Author> autroes) {
        this.libros = libros;
        this.autroes = autroes;
    }

    public Bookstore() {
    }
    @XmlElement (name = "libro")
    public List<Book> getLibros() {
        return libros;
    }

    public void setLibros(List<Book> libros) {
        this.libros = libros;
    }
    @XmlElement (name = "autor")
    public List<Author> getAutroes() {
        return autroes;
    }

    public void setAutroes(List<Author> autroes) {
        this.autroes = autroes;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "libros=" + libros +
                ", autroes=" + autroes +
                '}';
    }
}
