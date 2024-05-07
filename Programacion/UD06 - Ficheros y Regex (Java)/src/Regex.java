import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

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

    //Ejercicio 1:
    //Desarrolla un programa que lea un archivo de texto y muestre el número
    //palabras que contiene.

    private static void ej1() {
        File archivo = new File("data/archivo.txt");
        comporbarSiExiste(archivo);

        BufferedReader bufferedReader = null;
        int contador = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] corte = linea.split("\\s+");
                contador += corte.length;
            } System.out.println("en el fichero " + archivo.getName() + " hay " + contador + " palabras");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Desarrolla un programa que busque en el texto de abajo con información del instituto:
    //a) Correo electrónico
    //b) Código postal
    //c) Teléfonos
    //d) Dirección web

    //el texto:
    //IES SEGUNDO DE CHOMÓN
    //C/ Pablo Monguió, 48
    //44002 Teruel
    //Teléfono: 978 60 13 21
    //Fax: 978 60 00 80
    //Email: iesschteruel@educa.aragon.es
    //Web: www.iesch.org

    private static void ej2() {
        String texto = "IES SEGUNDO DE CHOMÓN\n" +
                "C/ Pablo Monguió, 48\n" +
                "44002 Teruel\n" +
                "Teléfono: 978 60 13 21\n" +
                "Fax: 978 60 00 80\n" +
                "Email: iesschteruel@educa.aragon.es\n" +
                "Web: www.iesch.org";

        String regexEmail = "[\\w,;.:_0-9-]+@[\\w,;.:_0-9-]+\\.\\w{2,}";
        String regexCP = "[0-9]{5}";
        String regexTelefono = "[0-9]{3}[ ]?[0-9]{2}[ ]?[0-9]{2}[ ]?[0-9]{2}";
        String regexWeb = "www+\\.[\\w,;.:_0-9-]+\\.\\w{2,}";


        Pattern patternEmail = Pattern.compile(regexEmail);
        Pattern patternCP = Pattern.compile(regexCP);
        Pattern patternTelefono = Pattern.compile(regexTelefono);
        Pattern patternWeb = Pattern.compile(regexWeb);

        Matcher matcherEmail = patternEmail.matcher(texto);
        while (matcherEmail.find()) {
            System.out.println("el correo electronico encontrado es: " + matcherEmail.group());
        }
        Matcher matcherCP = patternCP.matcher(texto);
        while (matcherCP.find()) {
            System.out.println("el codigo postal es: " + matcherCP.group());
        }
        Matcher matchernTelefono = patternTelefono.matcher(texto);
        while (matchernTelefono.find()) {
            System.out.println("el telefono es: " + matchernTelefono.group());
        }
        Matcher matchernWeb = patternWeb.matcher(texto);
        while (matchernWeb.find()) {
            System.out.println("la web es: " + matchernWeb.group());
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Utiliza como fuente de datos el fichero DATA.csv disponible en classroom para
    //llevar a cabo este ejercicio. Deberás desarrollar un programa que lea el
    //fichero y muestre:
    //a) Los registros con país España o Portugal
    //b) Los registros con email de dominios .edu
    //c) Los registros con email de yahoo
    //d) Los registros con el último login entre mayo de 2015 y febrero de 2017

    private static void ej3() {
        File archivo = new File("data/DATA.csv");
        Scanner scanner = new Scanner(System.in);

        String regexEsp_port = "ES|PT";
        String regexEdu = "@[\\w0-9,;.:_-]+\\.edu";
        String regexYahoo = "yahoo+\\.\\w{2,}";
        String regexLogin = "(2015-(0[5-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[0-1]))|(2016|2017)-(0[1-2]-(0[1-9]|1[0-9]|2[0-9]|3[0-1]))";

        Pattern patternEsp_port = Pattern.compile(regexEsp_port);
        Pattern patternEdu = Pattern.compile(regexEdu);
        Pattern patternYahoo = Pattern.compile(regexYahoo);
        Pattern patternLogin = Pattern.compile(regexLogin);

        BufferedReader bufferedReader = null;
        System.out.print("elige un ejercicio para realizar:\n" +
                "    + Los registros con país España o Portugal --> 'a'\n" +
                "    + Los registros con email de dominios .edu --> 'b'\n" +
                "    + Los registros con email de yahoo --> 'c'\n" +
                "    + Los registros con el último login entre mayo de 2015 y febrero de 2017 --> 'd': ");
        String eleccion = scanner.next().toLowerCase();
        try {
            bufferedReader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                Matcher matcherEsp_port = patternEsp_port.matcher(linea);
                Matcher matcherEdu = patternEdu.matcher(linea);
                Matcher matcherYahoo = patternYahoo.matcher(linea);
                Matcher matcherLogin = patternLogin.matcher(linea);

                if (eleccion.equals("a")) {
                    while (matcherEsp_port.find()) {
                        System.out.println(linea);
                    }
                } else if (eleccion.equals("b")) {
                    while (matcherEdu.find()) {
                        System.out.println(linea);
                    }
                } else if (eleccion.equals("c")) {
                    while (matcherYahoo.find()) {
                        System.out.println(linea);
                    }
                } else if (eleccion.equals("d")) {
                    while (matcherLogin.find()) {
                        System.out.println(linea);
                    }
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
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Crea un método estático llamado CleanSpaces que reciba una cadena y
    //devuelva la cadena una vez eliminados los espacios sobrantes; todos los
    //espacios hasta el primer carácter, todos los espacios hasta el último carácter,
    //si entre palabras hay más de un espacio seguido sólo deberá quedar uno.
    //“ Hola mundo ”  “Hola mundo”.

    private static void ej4() {
        String frase = "         hola mundo ";
        System.out.println(frase);
        cleanSpaces(frase);
    }

//----------------------------------------------------------------------------------------------------------------------

    private static void cleanSpaces(String frase) {
        System.out.println(frase.trim());
    }
    private static void comporbarSiExiste(File archivo) {
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
    private static void escribirEnElFichero(File archivo) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(archivo));
            bufferedWriter.write("ahahhahahahhah\n" +
                    "ahahhahahahhah\n" +
                    "ahahhahahahhah\n" +
                    "ahahhahahahhah\n");
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