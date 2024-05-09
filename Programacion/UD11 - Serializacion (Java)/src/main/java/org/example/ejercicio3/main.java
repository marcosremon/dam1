package org.example.ejercicio3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ejercicio1.Book;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Library library = new Library();
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("library.json");

        Book libro3 = new Book("La Galatea", "cervantes", "1585");
        Book libro4 = new Book("La Galatea", "cervantes", "1585");

        library.setListaLibros(Arrays.asList(libro3,libro4));
        try {
            if (!jsonFile.exists()){
                jsonFile.createNewFile();
            }
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, library);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
