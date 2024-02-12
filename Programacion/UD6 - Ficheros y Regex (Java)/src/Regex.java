import java.io.*;
import java.time.LocalDate;
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
        String ruta = "data/archivo.txt";
        BufferedReader bufferedReader = null;
        int contadorPalabras = 0;

        try {
            bufferedReader = new BufferedReader(new FileReader(ruta));
            String linea = bufferedReader.readLine();

            while (linea != null) {
                String[] palabras = Pattern.compile("\\s+").split(linea);
                contadorPalabras += palabras.length;
                linea = bufferedReader.readLine();
            }

            System.out.println("El archivo contiene " + contadorPalabras + " palabras.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

        String regexemail = "[A-Za-z0-9._%+-]+@[A-Za-z.]+\\.[A-Za-z]{2,}\\b";
        String regexcodigopostal = "\\d{5}";
        String regextelefono = "\\d{3} \\d{2} \\d{2} \\d{2}";
        String regexweb = "www\\.\\w+\\.[a-zA-Z]{2,}";

        Pattern patteremail = Pattern.compile(regexemail);
        Matcher matcheremail = patteremail.matcher(texto);
        while (matcheremail.find()) {
            System.out.println("el correo electronico encontrado es: " + matcheremail.group());
        }

        Pattern pattercodigopostal = Pattern.compile(regexcodigopostal);
        Matcher matchercodigopostal = pattercodigopostal.matcher(texto);
        while (matchercodigopostal.find()) {
            System.out.println("el codigo postal encontrado es: " + matchercodigopostal.group());
        }

        Pattern pattertelefono = Pattern.compile(regextelefono);
        Matcher matchertelefono = pattertelefono.matcher(texto);
        while (matchertelefono.find()) {
            System.out.println("el telefono encontrado es: " + matchertelefono.group());
        }

        Pattern patterweb = Pattern.compile(regexweb);
        Matcher matcherweb = patterweb.matcher(texto);
        while (matcherweb.find()) {
            System.out.println("la web encontrada es: " + matcherweb.group());
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    // Utiliza como fuente de datos el fichero DATA.csv disponible en classroom para
    //llevar a cabo este ejercicio. Deberás desarrollar un programa que lea el
    //fichero y muestre:
    //a) Los registros con país España o Portugal
    //b) Los registros con email de dominios .edu
    //c) Los registros con email de yahoo
    //d) Los registros con el último login entre mayo de 2015 y febrero de 2017

    private static void ej3() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Crea un método estático llamado CleanSpaces que reciba una cadena y
    //devuelva la cadena una vez eliminados los espacios sobrantes; todos los
    //espacios hasta el primer carácter, todos los espacios hasta el último carácter,
    //si entre palabras hay más de un espacio seguido sólo deberá quedar uno.
    //“ Hola mundo ”  “Hola mundo”.

    private static void ej4() {
        String ruta = "data/DATA.csv";
        BufferedReader reader = null;

        String regexEspanyaPortugal = ".*,(ES|PT),.*";
        String regexEmailEdu = ".*,\\w+@\\w+\\.edu,";
        String regexEmailYahoo = "\\w+@\\w+\\.\\w+";
        String regexLogin = ".*\\?2023-01-01.*";
        Pattern patternEspanyaPortugal = Pattern.compile(regexEspanyaPortugal);
        Pattern patternEmailEdu = Pattern.compile(regexEmailEdu);
        Pattern patternEmailYahoo = Pattern.compile(regexEmailYahoo);
        Pattern patternLogin = Pattern.compile(regexLogin);

        LocalDate fechaInicio = LocalDate.of(2023, 1, 1);
        LocalDate fechaFin = LocalDate.of(2023, 12, 31);

        String linea;

        try {
            reader = new BufferedReader(new FileReader(ruta));
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                if (patternEspanyaPortugal.matcher(linea).matches()) {
                    System.out.println("ES | PT: " + linea);
                }
                if (patternEmailEdu.matcher(linea).matches()) {
                    System.out.println("Email edu: " + linea);
                }
                if (patternEmailYahoo.matcher(linea).matches()) {
                    System.out.println("Email Yahoo: " + linea);
                }
                String[] fila = linea.split(",");
                LocalDate fechaLogin = LocalDate.parse(fila[9].split(" ")[0]);
                if (fechaLogin.isAfter(fechaInicio) && fechaLogin.isBefore(fechaFin)) {
                    System.out.println("Fecha de login: " + linea);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}