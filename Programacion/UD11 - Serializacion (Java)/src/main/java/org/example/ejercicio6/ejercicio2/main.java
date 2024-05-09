package org.example.ejercicio6.ejercicio2;

import org.example.ejercicio3.Library;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class main {
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Library library = (Library) unmarshaller.unmarshal(new File("library.xml"));
            System.out.println(library);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
