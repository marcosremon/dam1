import java.io.*;
import java.nio.file.Files;
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

        File fichero = new File("./data/archivo.txt");
        comprobarSiElFicheroExiste(fichero);

        BufferedReader bufferedReader = null;
        String linea;
        int contador = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(fichero));
            while ((linea = bufferedReader.readLine()) != null) {
                contador += 1;
                System.out.println("linea " + contador + ": " + linea );
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
        File ficheroOriginal = new File("./data/archivo.txt");
        File ficheroModificado = new File("./data/archivoEnMayusculas.txt");
        comprobarSiElFicheroExiste(ficheroOriginal);
        comprobarSiElFicheroExiste(ficheroModificado);

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String linea;
        try {
            bufferedReader = new BufferedReader(new FileReader(ficheroOriginal));
            bufferedWriter = new BufferedWriter(new FileWriter(ficheroModificado));
            while ((linea = bufferedReader.readLine()) != null) {
                linea = linea.toUpperCase();
                bufferedWriter.write(linea + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
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

        File fichero = new File("./data/archivo.txt");
        comprobarSiElFicheroExiste(fichero);

        BufferedReader bufferedReader = null;
        String linea;
        int contador = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(fichero));
            while ((linea = bufferedReader.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.toLowerCase().charAt(i);
                    String letra = String.valueOf(caracter);
                    if (letra.equals("a")) {
                        contador += 1;
                    }
                }
            }
            System.out.println(contador);
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

    //Ejercicio 4:
    //Desarrolla un programa que lea un archivo de texto y muestre el número de veces
    //que aparece cada letra del abecedario (independientemente de mayúsculas y minúsculas).

    private static void ej4() {
        File fichero = new File("./data/archivo.txt");
        comprobarSiElFicheroExiste(fichero);

        BufferedReader bufferedReader = null;
        String linea;
        try {
            bufferedReader = new BufferedReader(new FileReader(fichero));
            StringBuilder textoCompleto = new StringBuilder();
            while ((linea = bufferedReader.readLine()) != null) {
                textoCompleto.append(linea.toLowerCase());
            }
            String texto = textoCompleto.toString();
            String abecedario = "abcdefghijklmnñopqrstuvwxyz";
            for (int i = 0; i < abecedario.length(); i++) {
                char letra = abecedario.charAt(i);
                int contador = contarLetra(texto, letra);
                System.out.println("La letra " + letra + " aparece " + contador + " veces");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
    private static void comprobarSiElFicheroExiste(File fichero) {
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
                System.out.println("El fichero ha sido creado");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else
            System.out.println("El fichero ya existe");
    }
}