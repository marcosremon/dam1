package org.example.ejercicio4;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ejercicio3.Library;
import org.example.ejercicio1.Book;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        File jsonFile = new File("library.json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Library library = objectMapper.readValue(jsonFile, Library.class);
            for (Book book : library.getListaLibros()) {
                System.out.println(book);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
