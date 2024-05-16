package org.example.ejercicio6.ejercicio1;

import org.example.ejercicio1.Book;
import org.example.ejercicio3.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Library library = new Library();

        Book libro1 = new Book("manuelMaricon", "Juan", "1585");
        Book libro2 = new Book("anulenLaMatriculaDeSilvestre", "manuel", "2024");
        library.setListaLibros(Arrays.asList(libro1,libro2));

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(library, new File("library.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}