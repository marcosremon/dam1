package org.example.ejercicio7;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ejercicio1.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Book libro1 = new Book("manuelMaricon", "Juan", "1585");
        Book libro2 = new Book("anulenLaMatriculaDeSilvestre", "manuel", "2024");
        Book libro3 = new Book("pieroRastafari", "manuel", "1999");
        Author author = new Author("manuel", "3", Arrays.asList(libro1, libro2, libro3));

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("author.json"), author);
            JAXBContext jaxbContext = JAXBContext.newInstance(Author.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(author, new File("author.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
