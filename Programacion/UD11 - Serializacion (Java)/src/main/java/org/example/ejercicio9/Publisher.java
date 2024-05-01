package org.example.ejercicio9;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.example.ejercicio1.Book;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Publisher {
    private String name;
    private String address;
    private List<Book> libros = new ArrayList<>();

    public Publisher(String name, String address, List<Book> libros) {
        this.name = name;
        this.address = address;
        this.libros = libros;
    }

    public Publisher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonGetter("books")
    @XmlElement(name = "libro")
    public List<String> getBookTitles() {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : libros) {
            bookTitles.add(book.getTitulo());
        }
        return bookTitles;
    }
}