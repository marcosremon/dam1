import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Ejercicio02 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Ejercicio: ");
            int ej = scanner.nextInt();
            scanner.nextLine();

            switch (ej) {
                case 1 -> ej1();
                case 2 -> ej2();
                case 3 -> ej3();
                case 4 -> ej4();
                default -> System.out.println("Ejercicio no válido");
            }
            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio1:
    //Desarrolla un programa que lea un archivo de texto y muestre su contenido.

    private static void ej1() {

        String rutaArchivo = "./data/archivo.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Desarrolla un programa que lea un archivo de texto y guarde un nuevo
    //archivo con el mismo texto, pero con todas las palabras en mayúsculas.

    private static void ej2() {
        String rutaArchivoOriginal = "./data/archivo.txt";
        String rutaArchivoModificado = "./data/archivoEnMayusculas.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivoOriginal));
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivoModificado));
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea.toUpperCase());
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("Archivo modificado creado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Desarrolla un programa que lea un archivo un archivo de texto y muestre
    //el número de veces que aparece la letra ‘a’.

    private static void ej3() {
        String rutaArchivo = "./data/archivo.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            int contadorA = 0;
            int caracter;
            while ((caracter = reader.read()) != -1) {
                char caracterMinuscula = Character.toLowerCase((char) caracter);
                if (caracterMinuscula == 'a') {
                    contadorA++;
                }
            }
            reader.close();

            System.out.println("El número de veces que aparece la letra 'a' es: " + contadorA);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Desarrolla un programa que lea un archivo un archivo de texto y muestre el número de veces
    //que aparece cada letra del abecedario (independientemente de mayúsculas y minúsculas).

    private static void ej4() {
        String rutaArchivo = "./data/archivo.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            int[] contadorLetras = new int[26];
            int caracter;

            while ((caracter = reader.read()) != -1) {
                char caracterMinuscula = Character.toLowerCase((char) caracter);
                if (Character.isLetter(caracterMinuscula)) {
                    int indice = caracterMinuscula - 'a';
                    contadorLetras[indice]++;
                }
            }
            reader.close();

            for (char letra = 'a'; letra <= 'z'; letra++) {
                int indice = letra - 'a';
                System.out.println("Letra " + letra + ": " + contadorLetras[indice] + " veces");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}