package Ejercicios_Repaso_Objetos.Ejercicio1;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(getTitulo(), libro.getTitulo()) && Objects.equals(getAutor(), libro.getAutor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getAutor());
    }
}
