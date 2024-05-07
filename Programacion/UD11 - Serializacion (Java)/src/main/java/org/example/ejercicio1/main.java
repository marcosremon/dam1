package org.example.ejercicio1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Book libro1 = new Book("manuelPutero", "Juan", "2024");
        Book libro2 = new Book("peiroRastafari", "Borja", "2023");

        List<Book> libros = Arrays.asList(libro1, libro2);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("book.json"), libros);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
