package org.example.ejercicio8;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ejercicio1.Book;
import org.example.ejercicio7.Author;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        ObjectMapper objectMapper = new ObjectMapper();

        Book libro1 = new Book("juanHomo", "Redo", "1585");
        Book libro2 = new Book("theAlex", "mario", "1212");
        Author author1 = new Author("pepe", "1", Arrays.asList(libro1, libro2));

        bookstore.setAutroes(Arrays.asList(author1));
        bookstore.setLibros(Arrays.asList(libro1, libro2));

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("bookstore.json"), bookstore);
            JAXBContext jaxbContext = JAXBContext.newInstance(Bookstore.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(bookstore, new File("bookstore.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
