import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

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
        File ruta = new File("./data/archivo.txt");
        //a)
        File rootDirectory = File.listRoots()[0];
        System.out.println("Directorio Raíz: " + rootDirectory.toString());
        //b)
        String rutaArchivo = ruta.getParent();
        System.out.println("la ruta del archivo.txt es: " + rutaArchivo);
        //c)
        String nombreArchivo = ruta.getName();
        System.out.println("el nombre del archivo es: " + nombreArchivo);
        //d)
        String extension = obtenerExtension(nombreArchivo);
        System.out.println("la extension del archivo es: " + extension);
        //e)
        if (ruta.exists()) {
            System.out.println("el archivo existe");
        } else System.out.println("el archivo no existe");
    }
    private static String obtenerExtension(String nombreArchivo) {
        int indicePunto = nombreArchivo.lastIndexOf('.');
        if (indicePunto > 0 && indicePunto < nombreArchivo.length() - 1) {
            return nombreArchivo.substring(indicePunto + 1);
        } else {
            return "No se encontró extensión";
        }
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
        File ruta = new File("./data");

        if (ruta.exists()) {
            if (ruta.isFile()) {
                System.out.println("es un fichero");
            } else if (ruta.isDirectory()) {
                System.out.println("es un directorio, la ruta es: " + ruta.getAbsolutePath());
                File[] archivos = ruta.listFiles();
                if (archivos != null) {
                   System.out.println("el contenido del directorio es:");
                   for (File archivo : archivos) {
                       System.out.println(archivo.getName());
                   }
                } else System.out.println("no se pudo acceder al contenido del directorio");
            }
        } else System.out.println("no existe la ruta introducida");
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

        File directorios = new File("./data/documentos/PRO_UD08_Ej03");
        File fichero = new File("./data/documentos/PRO_UD08_Ej03/programacion.txt");
        comprobarSiExiste(directorios, fichero);
        directorios = new File("./data/documentos/PRO_UD08_Ej03/docs/samples");
        comprobarSiExiste(directorios, fichero);
        directorios = new File("./data/documentos/PRO_UD08_Ej03/docs/exercises");
        comprobarSiExiste(directorios, fichero);

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fichero));
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

        Path rutaOrigen = Paths.get("./data/documentos/PRO_UD08_Ej03/programacion.txt");
        Path rutaDestino1 = Paths.get("./data/documentos/PRO_UD08_Ej03/programacion(+1).txt");
        Path rutaDestino2 = Paths.get("./data/documentos/PRO_UD08_Ej03/programacion(+2).txt");
        Path rutaDestino3 = Paths.get("./data/documentos/PRO_UD08_Ej03/docs/samples/programacion.txt");
        Path rutaDestino4 = Paths.get("./data/documentos/PRO_UD08_Ej03/docs/exercises/programacion.txt");

        try {
            Files.copy(rutaOrigen, rutaDestino1, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(rutaOrigen, rutaDestino2, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(rutaOrigen, rutaDestino3, StandardCopyOption.REPLACE_EXISTING);
            Files.move(rutaOrigen, rutaDestino4, StandardCopyOption.REPLACE_EXISTING);
            Files.move(rutaDestino1, rutaOrigen, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(rutaDestino2);
            System.out.println("El archivo se ha copiado exitosamente.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void comprobarSiExiste(File directorios, File fichero) {
        if (!directorios.exists()) {
            directorios.mkdirs();
            System.out.println("ruta creada");
        } else System.out.println("ya existe la ruta");
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else System.out.println("ya existe el fichero");
    }
}