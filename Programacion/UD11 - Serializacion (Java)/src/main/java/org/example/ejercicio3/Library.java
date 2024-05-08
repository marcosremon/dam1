package org.example.ejercicio3;

import org.example.ejercicio1.Book;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Library {
    private List<Book> listaLibros = new ArrayList<>();

    public Library(List<Book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Library() {
    }
@XmlElement(name = "Libro")
    public List<Book> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Library{" +
                "listaLibros=" + listaLibros +
                '}';
    }
}
