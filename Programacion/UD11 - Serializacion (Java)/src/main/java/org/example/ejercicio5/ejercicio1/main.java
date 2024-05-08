package org.example.ejercicio5.ejercicio1;

import org.example.ejercicio1.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class main {
    public static void main(String[] args) {
        Book book = new Book("meinkampf", "adolf", "1929");

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(book, new File("book.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
