import java.util.Random;
import java.util.Scanner;

public class Utilizacion_de_objetos_Ejercicios_1 {
    public static Scanner scanner;

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
                case 5 -> ej5();
                case 6 -> ej6();
                case 7 -> ej7();
                case 8 -> ej8();
                default -> System.out.println("Ejercicio no válido");
            }

            System.out.print("\n¿Continuar? [y/n] ");
        } while(scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio1:
    //Realiza un programa que pida al usuario introducir los lados de un rectángulo y calcule
    //su área.

    private static void ej1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Introduce el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        double area = longitud * ancho;
        System.out.println("El área del rectángulo es: " + area);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio2:
    //Realiza un programa que pida al usuario introducir su nombre y después lo salude
    //usuario diciéndole “Hola” y su nombre.

    private static void ej2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Hola, " + nombreUsuario);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio3:
    //Realiza un programa que pida al usuario introducir un número y devuelva su raíz
    //cuadrada. Ayuda: la clase Math tiene una función (sqrt) que calcula la raíz cuadrada.

    private static void ej3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numeroUsuario = scanner.nextDouble();
        double raizCuadrada = Math.sqrt(numeroUsuario);
        System.out.printf("La raíz cuadrada de %.2f es %.2f\n", numeroUsuario, raizCuadrada);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio4:
    //El método ramdom de la clase Math devuelve números reales aleatorios entre 0 y 1.
    //  a. Basándote en este comportamiento crea un programa que devuelva un
    //     número entero aleatorio entero entre 0 y 100.
    //  b. Modifica el programa para pedir al usuario un número entero positivo y el
    //     programa devuelva tres números enteros aleatorios entre 0 y el número
    //     elegido por el usuario.
    //  c. Modifica el programa para pedir al usuario dos números enteros positivos y el
    //     programa devuelva tres números enteros aleatorios entre los dos números
    //     elegidos por el usuario.

    private static void ej4() {

        // a)
        double numeroaleatorioA = 0;
        while (numeroaleatorioA != 100) {
            numeroaleatorioA = (int) (Math.random() * 101);
            System.out.println(numeroaleatorioA);
        }

        // b)
        System.out.println("Introduce el primer número entero positivo:");
        int numeroM = scanner.nextInt();

        System.out.println("Introduce el segundo número entero positivo:");
        int numeroN = scanner.nextInt();

        // c)
        for (int i = 0; i < 3; i++) {
            int numeroaleatorioC = (int) (Math.random() * (numeroN - numeroM + 1) + numeroM);
            System.out.printf("El número aleatorio %d es: %dª\n", i, numeroaleatorioC);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio5:
    //¿Qué método de la clase Math utilizarías para realizar el producto de dos enteros y
    //asegurarte de que el resultado no hace overflow? Haz un programa que lo pruebe.

    private static void ej5() {
        System.out.println(Integer.MAX_VALUE);
        int numero1 = Integer.MAX_VALUE;
        int numero2 = 99;
        int resultado = Math.multiplyExact(numero1, numero2);
        System.out.println(resultado);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio6:
    //Realiza un programa que pida al usuario introducir dos números y muestre el resultado
    //de elevar el primero al segundo.

    private static void ej6() {
        int numero1 = 36;
        int numero2 = 3;
        double potencia = Math.pow(numero1, numero2);
        System.out.println(potencia);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio7:
    //Realiza un programa que genere letras mayúsculas aleatoriamente y determine si son
    //vocales o consonantes.
    private static void ej7() {
        new Random();
        int codigoascii_A = 65;
        int codigoascii_Z = 90;
        int numeroaleatorioC = (int)(Math.random() * (double)(codigoascii_Z - codigoascii_A + 1) + (double)codigoascii_A);
        System.out.println(numeroaleatorioC);
        char letra = (char)numeroaleatorioC;
        System.out.println(letra);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println(letra + " es una vocal");
        }

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio8:
    //Crea un programa para procesar datos de viviendas; define las siguientes variables
    //enteras precio y superficie y la variable booleana tieneGaraje. El programa deberá
    //pedir al usuario que introduzca los valores para estas tres variables. Declara la variable
    //booleana meInteresa cuyo valor será:
    //   Verdadero. Si el precio es menor a 150.000 €, la superficie es mayor que 80m 2 y la
    //     vivienda tiene garaje.
    //   Falso. En caso contrario.
    //     El programa mostrará el valor de meInteresa por consola para visualizar si estamos o
    //     no interesados en la vivienda.

    private static void ej8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio de la vivienda en euros: ");
        int precio = scanner.nextInt();

        System.out.print("Introduce la superficie de la vivienda en metros cuadrados: ");
        int superficie = scanner.nextInt();

        System.out.print("¿La vivienda tiene garaje? (true/false): ");
        boolean garaje = scanner.nextBoolean();

        boolean meinteresa = (precio < 150000) && (superficie > 80) && garaje;

        System.out.println("¿Me interesa la vivienda? " + meinteresa);
    }
}