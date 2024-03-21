package global;

import java.io.*;

//El propósito de la clase ejercicio2 es leer el contenido de varios archivos presentes en un directorio específico.
//Posteriormente, combina todo el contenido de estos archivos en un solo archivo llamado salidaEj2.txt y lo guarda
//en un archivo de salida designado.

public class ejercicio2 {
    public static void main(String[] args) {
        File data = new File("data");
        File ficheroGeneral = new File("data/salida_Ej2.txt");
        StringBuilder stringBuilder = new StringBuilder();
        try {
            ficheroGeneral.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File[] lista = data.listFiles();
        for (File i : lista) {
            BufferedReader bufferedReader = null;
            System.out.println(i);
            try {
                bufferedReader = new BufferedReader(new FileReader(i));
                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    stringBuilder.append(linea).append("\n");
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
        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(ficheroGeneral));
            bufferedWriter.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
