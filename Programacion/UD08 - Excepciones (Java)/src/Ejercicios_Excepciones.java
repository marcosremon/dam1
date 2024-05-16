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

        try {
            int resultado = numero1/numero2;
            System.out.println("el resutado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ha habido un error");
        }
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

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(archivo));
            bufferedWriter.write("haaaa\nhaaaa\nhaaaa\nhaaaa\n");
        } catch (IOException e) {
            System.out.println("no se ha podido escribir en el fichero");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3 Excepciones personalizadas:
    //Define tu propia excepción verificada y no verificada. Luego,
    //escribe un método que lance tus excepciones y otro método que las maneje.

    private static void ej3() {
        manejarExcepciones();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4 Buenas prácticas:
    //Revisa el código existente de ejercicios anteriores, busca ejemplos de mal manejo de excepciones,
    //como: ignorar excepciones, usar catch (Exception e), usar excepciones
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
    public static void lanzarExcepciones() throws Exception {
        throw new miExcepcionVerificada("Esta es una excepción verificada personalizada.");
    }
    public static void manejarExcepciones() {
        try {
            lanzarExcepciones();
        } catch (miExcepcionVerificada e) {
            System.out.println("excepcion verificada atrapaa " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        throw new miExcepcionNoVerificada("Esta es una excepción no verificada personalizada.");
    }
}