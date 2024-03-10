package introduccionFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo_Fichero {
    public static void main(String[] args) {
        File fichero = new File("data/Hola.txt");
        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(fichero);
            bufferedReader = new BufferedReader(fileReader);
            String linea = bufferedReader.readLine();
            System.out.println(linea);
        } catch (FileNotFoundException e) {
            System.out.println("el fichero no existe");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el fichero");
                }
            }
        }
    }
}