package global;

import java.io.*;
import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        File archivo = new File("Metadata in DBMS.txt");
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        List<String> almacenPalabras = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                linea = linea.replace(".", "").replace(",","")
                        .replace(":", "").replace("\n", "")
                        .replace("\r", "").replace("-", "").trim().toLowerCase();
                String[] almacen = linea.split(" ");
                for (String i : almacen) {
                    almacenPalabras.add(i);
                }
            }
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Set<String> almacenSinDupes = new TreeSet<>(almacenPalabras);
        for (String i : almacenSinDupes) {
            int contador = 0;
            for (String j : almacenPalabras) {
                if (i.equals(j)) {
                    contador++;
                }
            }
            System.out.println("la palabra " + i + " aparece " + contador + " veces");
        }
    }
}
