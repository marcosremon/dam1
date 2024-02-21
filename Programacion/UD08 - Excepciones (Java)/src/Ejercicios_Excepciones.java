import java.io.*;
import java.util.*;

public class Ejercicios_Excepciones {

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

    //Ejercicio 1 Manejo de excepciones:
    //Escribe un método que divida dos números y capture cualquier
    //ArithmeticException que pueda ocurrir.

    private static void ej1() {
        int numero1 = 10;
        int numero2 = 0;

        dividir(numero1, numero2);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2 Bloque finally:
    //Escribe un método que abra un archivo, escriba en él y use un bloque finally
    //para asegurarse de que el archivo se cierre, independientemente de si ocurre una excepción.

    private static void ej2() {
        String ruta = "./data";
        File data = new File(ruta);
        File archivo = new File(ruta + "/archivo.txt");
        comprobarSiExiste(data);
        comprobarSiExiste(archivo);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo))) {
            bufferedWriter.write("haaaa\nhaaaa\nhaaaa\nhaaaa\n");
        } catch (IOException e) {
            System.out.println("no se ha podido escribir en el fichero");
            e.printStackTrace();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3 Excepciones personalizadas:
    //Define tu propia excepción verificada y no verificada. Luego,
    //escribe un método que lance tus excepciones y otro método que las maneje.

    private static void ej3() {

        try {
            lanzarExcepciones();
        } catch (MiExcepcionVerificada e) {
            System.out.println("Capturamos la excepcion verificada:");
            e.printStackTrace();
        } catch (MiExcepcionNoVerificada e) {
            System.out.println("Capturamos la excepcion no verificada:");
            e.printStackTrace();
            manejarExcepcion();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4 Buenas prácticas:
    //Revisa el código existente de ejercicios anteriores, busca ejemplos de mal
    //manejo de excepciones, como: ignorar excepciones, usar catch (Exception e), usar excepciones
    //para el control de flujo, y no cerrar recursos. Corrige el código para seguir las buenas prácticas.

    private static void ej4() {

    }

//----------------------------------------------------------------------------------------------------------------------

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
    private static void dividir(int dividendo, int divisor) {
        try {
            int resultado = dividendo/divisor;
            System.out.println("el resutado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ha habido un error");
            e.printStackTrace();
        }
    }
    private static void manejarExcepcion() {
        System.out.println("Excepción no verificada manejada.");
    }
    static class MiExcepcionVerificada extends Exception {
        public MiExcepcionVerificada(String mensaje) {
            super("Problema: " + mensaje);
        }
    }
    static class MiExcepcionNoVerificada extends RuntimeException {
        public MiExcepcionNoVerificada(String mensaje) {
            super("Problema: " + mensaje);
        }
    }
    private static void lanzarExcepciones() throws MiExcepcionVerificada, MiExcepcionNoVerificada {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número que no sea el 5 o el 6:");
        int opcion = scanner.nextInt();
        if (opcion == 5) {
            throw new MiExcepcionVerificada("Esto es una excepción verificada");
        } else if (opcion == 6) {
            throw new MiExcepcionNoVerificada("Esto es una excepción no verificada");
        }
    }
}