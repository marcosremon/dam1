import javax.xml.xpath.XPath;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        File archivo = new File("data/documentos/PRO_UD08_Ej03/programacion.txt");

        BufferedReader bufferedReader = null;
        String linea;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivo));
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Desarrolla un programa que lea un archivo de texto y guarde un nuevo
    //archivo con el mismo texto pero con todas las palabras en mayúsculas.

    private static void ej2() {
        File archivoMayus = new File("data/archivoMayus.txt");
        crearArchivo(archivoMayus);

        Path archivoOriginal = Paths.get("data/documentos/PRO_UD08_Ej03/programacion.txt");
        Path archivoCopia = Paths.get("data/archivo.txt");
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        String linea;
        try {
            Files.copy(archivoOriginal, archivoCopia, StandardCopyOption.REPLACE_EXISTING);
            bufferedReader = new BufferedReader(new FileReader("data/archivo.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter(archivoMayus));
            while ((linea = bufferedReader.readLine()) != null) {
                String lieneaMayus = linea.toUpperCase();
                bufferedWriter.write(lieneaMayus + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
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
        File archivo = new File("data/archivo.txt");

        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        int contador = 0;
        String linea;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivo));
            while ((linea = bufferedReader.readLine()) != null) {
                stringBuilder.append(linea);
            }
            String texto = stringBuilder.toString().toLowerCase();
            for (char i : texto.toCharArray()) {
                if (i == 'a') {
                    contador++;
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
        File programacion = new File("data/archivo.txt");

        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String linea;
        try {
            bufferedReader = new BufferedReader(new FileReader(programacion));
            while ((linea = bufferedReader.readLine()) != null){
                stringBuilder.append(linea);
            }
            String abecedario = "abcdefghijklmnñopqrstuvwxyz";
            for (int i = 0; i < abecedario.length(); i++) {
                char letraAbc = abecedario.charAt(i);
                int contador = 0;
                for (int j = 0; j < stringBuilder.length(); j++) {
                    char letraTxt = stringBuilder.charAt(j);
                    if (letraAbc == letraTxt) {
                        contador++;
                    }
                }
                System.out.println("la letra " + letraAbc + " aparece un total de " + contador + " veces");
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

    private static void comprobarSiExiste(File archivo) {
        if (!archivo.exists()) {
            if (archivo.isDirectory()) {
                System.out.println("el directorio " + archivo.getName() + " ha sido creado");
            } else if (archivo.isFile()) {
                System.out.println("el fichero " + archivo.getName() + " ha sido creado");
            } else System.out.println("no existe");
        }
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
            } else archivo.mkdirs();
        } else System.out.println("el archivo " + archivo.getName() + " ya existe");
    }
}