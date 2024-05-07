package org.example.ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ejercicio1.Book;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        File jsonFile = new File("book.json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Book[] libros = objectMapper.readValue(jsonFile, Book[].class);
            for (Book libro : libros) {
                System.out.println(libro);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
