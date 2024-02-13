import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.BitSet;
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
        File archivoTxt = new File("./data/archivo.txt");
        comprobarSiExiste(archivoTxt);

        BufferedReader bufferedReader = null;
        String linea;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivoTxt));
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
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

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Desarrolla un programa que lea un archivo de texto y guarde un nuevo
    //archivo con el mismo textopero con todas las palabras en mayúsculas.

    private static void ej2() {
        File archivoTxt = new File("./data/archivo.txt");
        File archivoEnMayusculas = new File("./data/archivoEnMayusculas.txt");
        comprobarSiExiste(archivoTxt);

        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivoTxt));
            bufferedWriter = new BufferedWriter(new FileWriter(archivoEnMayusculas));
            String linea;
            System.out.println("el archivo " + archivoTxt.getName() + " tiene este contenido:");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
                String lineaEnMayus = linea.toUpperCase();
                bufferedWriter.write(lineaEnMayus + "\n");
            }

            System.out.println("------------------------------------------------------------------------------------");

            bufferedWriter.flush();
            String linea2;
            bufferedReader2 = new BufferedReader(new FileReader(archivoEnMayusculas));
            System.out.println("el archivo " + archivoEnMayusculas.getName() + " tiene este contenido:");
            while ((linea2 = bufferedReader2.readLine()) != null) {
                System.out.println(linea2);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedReader2.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Desarrolla un programa que lea un archivo de texto y muestre
    //el número de veces que aparece la letra ‘a’.

    private static void ej3() {
        File archivoTxt = new File("./data/archivo.txt");
        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivoTxt));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                stringBuilder.append(linea);
            }
            int contador = 0;
            for (int i = 0; i < stringBuilder.length(); i++) {
                char builderChar = stringBuilder.charAt(i);
                String builderCharString = String.valueOf(builderChar);
                if (builderCharString.equals("a")) {
                    contador++;
                }
            }
            System.out.println("la letra a aparece un total de " + contador + " veces");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Desarrolla un programa que lea un archivo de texto y muestre el número de veces
    //que aparece cada letra del abecedario (independientemente de mayúsculas y minúsculas).

    private static void ej4() {
        File archivoTxt = new File("./data/archivo.txt");
        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivoTxt));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                stringBuilder.append(linea);
            }
            String abecedario = "abcdefghijklmnñopqrstuvwxyz";
            for (int i = 0; i < abecedario.length(); i++) {
                char letra = abecedario.charAt(i);
                int contador = 0;
                for (int j = 0; j < stringBuilder.length(); j++) {
                    char caracter = stringBuilder.charAt(j);
                    if (caracter == letra) {
                        contador++;
                    }
                }
                System.out.println("la letra " + letra + " aparece un total de " + contador + " veces");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//----------------------------------------------------------------------------------------------------------------------
    private static int contarLetra(String texto, char letra) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
    private static void comprobarSiExiste(File archivo) {
        if (archivo.isDirectory()) {
            if (!archivo.exists()) {
                archivo.mkdirs();
                System.out.println("el directorio " + archivo.getName() + " ha sido creado");
            } else System.out.println("el directorio " + archivo.getName() + " ya existe");
        } else {
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    System.out.println("el fichero " + archivo.getName() + " ha sido creado");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else System.out.println("el fichero " + archivo.getName() + " ya existe");
        }
    }
}