package org.example.ejercicio1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    private String titulo;
    private String autor;
    private String anyoPublicacion;

    public Book(String titulo, String autor, String anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
    }

    public Book() {
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

    public String getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(String anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }


}
