package org.example.ejercicio5.ejercicio2;

import org.example.ejercicio1.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class main {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Book libro = (Book) unmarshaller.unmarshal(new File("book.xml"));
            System.out.printf(String.valueOf(libro));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
