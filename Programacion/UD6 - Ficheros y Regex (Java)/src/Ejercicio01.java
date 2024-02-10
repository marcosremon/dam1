import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
        String ruta = "D:\\Users\\dam1\\Documents\\DAM1\\programacion\\tema6\\data\\txt.txt";
        File fichero = new File(ruta);

        //a)
        System.out.println("El directorio raíz es: " + fichero.toPath().getRoot());

        //b)
        System.out.println("El directorio donde se encuentra el archivo es: " + fichero.getParent());
        System.out.println(fichero);

        //c)
        String nombre = fichero.getName();
        System.out.println("El nombre del archivo es: " + nombre);

        //d)
        String name = fichero.getName();
        int indice = name.lastIndexOf('.');
        if (indice > 0) {
            String extension = name.substring(indice + 1);
            System.out.println("La extensión del archivo es: ." + extension);
        }

        //e)
        boolean existe = fichero.exists();
        System.out.println("¿El archivo existe? " + existe);
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
        String ruta = "D:\\Users\\dam1\\Documents\\DAM1\\programacion\\tema6";
        File fichero = new File(ruta);

        System.out.println("la ruta es " + fichero.getParent());
        System.out.println("existe?? " + fichero.exists());
        System.out.println("fichero?? " + fichero.isFile());
        System.out.println("directorio?? " + fichero.isDirectory());

        if (fichero.isDirectory()) {
            for (String archivo : fichero.list()) {
                System.out.println(archivo);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Crea en la carpeta Documentos de tu ordenador una subcarpeta llamada
    //PRO_UD08_Ej03. Crea manualmente un fichero de texto llamado
    //Programacion.txt con el siguiente contenido:
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
        String ruta = "./data/Documentos/PRO_UD08_Ej03/Programacion.txt";
        File archivo = new File(ruta);
        System.out.println("copiamos un fichero");
        String nombre = archivo.getName();
        //nombre sin extension
        int indice = nombre.lastIndexOf('.');
        String nombreSinExtension = nombre.substring(0, indice);
        String extension = nombre.substring(indice);
        String directorio = archivo.getParent();
        try {
            File destino = new File(directorio + "/" + nombreSinExtension + "(+1)" + extension);
            Files.copy(archivo.toPath(), destino.toPath());
            File destino2 = new File(directorio + "/" + nombreSinExtension + "(+2)" + extension);
            Files.copy(archivo.toPath(), destino2.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //b)
        File nuevasCarpeta = new File(directorio + "/docs/samples");
        nuevasCarpeta.mkdirs();

        //c)
        File nuevasCarpeta2 = new File(directorio + "/docs/exercises");
        nuevasCarpeta2.mkdirs();

        //d)
        File archivoDestino = new File(directorio + "/docs/samples/Programacion.txt");
        if (!archivoDestino.exists()) {
            try {
                Files.copy(archivo.toPath(), archivoDestino.toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //e)
        File archivodestinoe = new File("./Documentos/PRO_UD08_Ej03/docs/exercises/programacin.txt");
        if (!archivodestinoe.exists()) {
            try {
                Files.move(archivo.toPath(), archivodestinoe.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //f)
        File archivoF = new File(directorio + "/Programacion(+1).txt");
        File archivoDestinoF = new File(directorio + "/Programacion.txt");
        if (archivoF.exists()) {
            if (archivoDestinoF.exists()) {
                archivoDestinoF.delete();
            }
            boolean success = archivoF.renameTo(archivoDestinoF);
            if (!success) {
                System.out.println("No se pudo renombrar el archivo");
            }
        } else {
            System.out.println("El archivo Programacion(+1).txt no existe");
        }

        //g)
        File archivoG = new File(directorio + "/Programacion(+2).txt");
        if (archivoG.exists()) {
            boolean success = archivoG.delete();
            if (!success) {
                System.out.println("No se pudo borrar el archivo");
            }
        } else {
            System.out.println("El archivo Programacion(+2).txt no existe");
        }
    }
}