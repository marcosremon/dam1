package org.example.ejercicio9;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.ejercicio1.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Book libro1 = new Book("juanHomo", "Redo", "1585");
        Book libro2 = new Book("theAlex", "mario", "1212");
        Publisher publisher = new Publisher("alex", "1234", Arrays.asList(libro1, libro2));

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("publisher.json"), publisher);
            JAXBContext jaxbContext = JAXBContext.newInstance(Publisher.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(publisher, new File("publisher.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
