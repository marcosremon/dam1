package Ejercicios_Repaso_Objetos.Ejercicio3;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Ejercicio 3:
        //Crea un fichero de texto llamado “índices.txt” con el siguiente contenido:
        //1
        //2
        //3
        //5
        //69
        //36
        //8
        //36
        //Realiza un programa en Java que pregunte al usuario el nombre de la tabla, y que lea el
        //fichero, y acabe creando otro fichero llamado “sentenciasSQL.sql” con el contenido:
        //delete from nombreDeLaTablaQueIntrodujoElUsuario where id = 1;
        //delete from nombreDeLaTablaQueIntrodujoElUsuario where id = 2;
        //delete from nombreDeLaTablaQueIntrodujoElUsuario where id = 3;
        //…
        //delete from nombreDeLaTablaQueIntrodujoElUsuario where id = 36;

//--------------------------------------------------------------------------------------------------------------

        String rutaIndices = "." + File.separator + "indices.txt";
        String rutaSalida = "." + File.separator + "sentenciasSQL.sql";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de la tabla:");
        String tabla = scanner.nextLine();

        // Validación para el nombre de la tabla vacío
        if (tabla.trim().isEmpty()) {
            System.err.println("El nombre de la tabla no puede estar vacío.");
            return;
        }

        File indicesFile = new File(rutaIndices);

        // Verificar si existe indices.txt
        if (!indicesFile.exists()) {
            System.err.println("Error: Archivo 'indices.txt' no encontrado.");
            return;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(indicesFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaSalida))) {

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                int idDeLinea;

                try {
                    idDeLinea = Integer.parseInt(linea);
                } catch (NumberFormatException e) {
                    System.err.println("Error: Contenido inválido en 'indices.txt'.");
                    return;
                }

                bufferedWriter.write("delete from " + tabla + " where id = " + idDeLinea + ";\n");
            }

            System.out.println("Archivo 'sentenciasSQL.sql' creado exitosamente.");

        } catch (IOException e) {
            System.err.println("Error: Excepción de E/S - " + e.getMessage());
        }
    }
}