import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio01 {

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
                default -> System.out.println("Ejercicio no válido");
            }
            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1:
    //Crea un programa que permita introducir la ruta de un fichero y muestre:
    //    a) El directorio raíz del sistema de archivos que contiene el archivo.
    //    b) El directorio donde se encuentra el archivo.
    //    c) El nombre del archivo.
    //    d) La extensión del archivo.
    //    e) Si el fichero existe o no en el sistema de ficheros del ordenador.

    private static void ej1() {
        File archivo = new File("data/archivo.txt");

        //a)
        String rutaAbsArch = archivo.getAbsolutePath();
        String directorioRaiz = rutaAbsArch.substring(0, 1);
        System.out.println("el directorio raiz del el archivo " + archivo.getName() + " es " + directorioRaiz);

        //b)
        String localizacion = archivo.getParent();
        System.out.println("el archivo " + archivo.getName() + " se encuentra en el driectorio " + localizacion);

        //c)
        String nombreArchivo = archivo.getName();
        System.out.println("el nombre del archivo es " + nombreArchivo);

        //d)
        String extensionArchivo = nombreArchivo.split("\\.")[1];
        //String regexExtension = "\\.\\w+";
        //Pattern patternExtension = Pattern.compile(regexExtension);
        //Matcher matcherExtension = patternExtension.matcher(nombreArchivo);
        //while (matcherExtension.find()) {
        //    System.out.println(matcherExtension.group());
        //}

        //e)
        comprobarSiExiste(archivo);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Crea un programa que pida al usuario introducir una ruta del directorio de
    //archivos del ordenador. A continuación, el programa debe mostrar cuál es la
    //ruta de la carpeta que contiene el archivo o el directorio. También debe
    //mostrar si la ruta existe realmente en el ordenador y, en caso de existir, debe
    //mostrar si se trata de un fichero o un directorio. En el caso de que se trate de
    //un directorio el programa mostrará también el contenido de dicho directorio.

    private static void ej2() {
        File ruta = new File("data");
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("la ruta de " + ruta.getName() + " es " + ruta.getAbsolutePath());
        if (ruta.exists()) {
            if (ruta.isDirectory()) {
                System.out.println("es un directorio");
                File[] contenido = ruta.listFiles();
                for (File i : contenido) {
                    stringBuilder.append("    + ").append(i.getName()).append("\n");
                }
                System.out.println("el contenido del directorio es:\n" + stringBuilder);
            } else System.out.println("es un fichero");
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Crea en la carpeta Documentos de tu ordenador una subcarpeta llamada
    //PRO_UD08_Ej03. Crea manualmente un fichero de texto llamado
    //Programacion.txt con el siguiente contenido:

        //Una clase es un modelo a partir del cual se crean los objetos individuales.
        //Las tres características de un objeto son estado, comportamiento e identidad.
        //De manera general, una interfaz es un grupo de métodos relacionados que definen un
        //comportamiento y que permiten la interacción de ese comportamiento del objeto que los implementa
        //con el mundo exterior.
        //En OOP, una interfaz viene definida por un nombre y por un conjunto de métodos con el cuerpo de
        //código vacío.

    //Crea un programa que:
    //    a) Copie el archivo Programacion.txt que se encuentra en la carpeta
    //    PRO_UD08_Ej03 y lo pegue dos veces en la misma carpeta con los
    //    nombres Programacion(+1).txt y Programacion(+2).txt
    //    b) Cree dentro de la carpeta PRO_UD08_Ej03 la siguiente estructura de
    //    carpetas: /docs/samples
    //    c) Cree dentro de la carpeta PRO_UD08_Ej03 la siguiente estructura de
    //    carpetas: /docs/exercises
    //    d) Copie el archivo Programacion.txt en la carpeta
    //    /PRO_UD08_Ej03/docs/samples
    //    e) Mueva el archivo Programacion.txt de /PRO_UD08_Ej03 a la carpeta
    //    /PRO_UD08_Ej03/docs/exercises
    //    f) Renombre el fichero Programacion(+1).txt como Programacion.txt en
    //    /PRO_UD08_Ej03
    //    g) Borre el archivo Programacion(+2).txt que se encuentra en la carpeta
    //    /PRO_UD08_Ej03.

    private static void ej3() {
        String ruta = "data/documentos/PRO_UD08_Ej03";
        File rutaDirectorios = new File(ruta);
        File programaciontxt = new File(ruta + "/programacion.txt");
        File samples = new File(ruta + "/docs/samples");
        File exercises = new File(ruta + "/docs/exercises");
        crearArchivo(rutaDirectorios);
        crearArchivo(samples);
        crearArchivo(exercises);
        crearArchivo(programaciontxt);

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(programaciontxt));
            bufferedWriter.write("Una clase es un modelo a partir del cual se crean los objetos individuales.\n" +
                    "Las tres características de un objeto son estado, comportamiento e identidad.\n" +
                    "De manera general, una interfaz es un grupo de métodos relacionados que definen un\n" +
                    "comportamiento y que permiten la interacción de ese comportamiento del objeto que los implementa\n" +
                    "con el mundo exterior.\n" +
                    "En OOP, una interfaz viene definida por un nombre y por un conjunto de métodos con el cuerpo de\n" +
                    "código vacío.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Path programacionOriginal = Paths.get(ruta + "/programacion.txt");
        Path programacion1 = Paths.get(ruta + "/programacion(+1).txt");
        Path programacion2 = Paths.get(ruta + "/programacion(+2).txt");
        Path copiaProgramacion = Paths.get(ruta + "/docs/samples/programacion.txt");
        Path moverProgramacion = Paths.get(ruta + "/docs/exercises/programacion.txt");

        try {
            Files.copy(programacionOriginal, programacion1, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(programacionOriginal, programacion2, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(programacionOriginal, copiaProgramacion, StandardCopyOption.REPLACE_EXISTING);
            Files.move(programacionOriginal, moverProgramacion, StandardCopyOption.REPLACE_EXISTING);
            Files.move(programacion1, programacionOriginal, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(programacion2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


//----------------------------------------------------------------------------------------------------------------------

    private static void comprobarSiExiste(File archivo) {
        if (archivo.exists()) {
            if (archivo.isDirectory()) {
                System.out.println("el archivo " + archivo.getName() + " es un direcotrio");
            } else System.out.println("el archivo " + archivo.getName() + " es un fichero");
        } else System.out.println("el archivo " + archivo.getName() + " no existe");
    }
    private static void crearArchivo(File archivo) {
        if (!archivo.exists()) {
            String nombreArchivo = archivo.getName();
            String regexExtension = "\\.\\w+";
            Pattern patternExtension = Pattern.compile(regexExtension);
            Matcher matcherExtension = patternExtension.matcher(nombreArchivo);
            if (matcherExtension.find()) {
                try {
                    archivo.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                archivo.mkdirs();
            }
        } else System.out.println("el archivo " + archivo.getName() + " ya existe");
    }
}