import java.util.Random;
import java.util.Scanner;

public class Utilizacion_de_objetos_Ejercicios_1 {
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
    //Realiza un programa que pida al usuario introducir los lados de un rectángulo y calcule su área.

    private static void ej1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce la base del rectanugulo");
        int base = scanner.nextInt();
        System.out.println("introduce la altura del rectangulo");
        int altura = scanner.nextInt();

        System.out.println("el area del rectangulo es: " + base * altura);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio2:
    //Realiza un programa que pida al usuario introducir su nombre y después lo salude
    //usuario diciéndole “Hola” y su nombre.

    private static void ej2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce tu nombre");
        String nombre = scanner.next();
        System.out.println("holaaa " + nombre);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio3:
    //Realiza un programa que pida al usuario introducir un número y devuelva su raíz
    //cuadrada. Ayuda: la clase Math tiene una función (sqrt) que calcula la raíz cuadrada.

    private static void ej3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un numero para calcular su raiz cuadrada");
        Double numero = scanner.nextDouble();
        System.out.println("la raiz cuadrada de el numero " + numero + " es " + Math.sqrt(numero));
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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //a)
        System.out.println("a)");
        int numeroAleatorio1 = random.nextInt(101);
        System.out.println(numeroAleatorio1);

        //b)
        System.out.println("b) \nintroduce un numero positivo");
        int numeroPositivo = scanner.nextInt();
        if (numeroPositivo > 0 ) {
            StringBuilder stringBuilder1 = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                int numeroAleatorio3 = random.nextInt(numeroPositivo+1);
                stringBuilder1.append(numeroAleatorio3).append(" ");
            }
            System.out.println(stringBuilder1);
        } else System.out.println("el numero que introdujiste no es positivo");

        //c)
        System.out.println("c) \nintroduce el primer numero inicial");
        int numeroInicial = scanner.nextInt();
        System.out.println("introduce el numero final");
        int numeroFinal = scanner.nextInt();
        if (numeroInicial > 0 && numeroFinal > 0 && numeroInicial < numeroFinal) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                int numeroAleatorio3 = random.nextInt(numeroInicial,numeroFinal+1);
                stringBuilder2.append(numeroAleatorio3 + " ");
            }
            System.out.println(stringBuilder2);
        } else System.out.println("algun parametro introducido es erroneo");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio5:
    //¿Qué método de la clase Math utilizarías para realizar el producto de dos enteros y
    //asegurarte de que el resultado no hace overflow? Haz un programa que lo pruebe.

    private static void ej5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el numero numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("introduce el numero numero 2");
        int numero2 = scanner.nextInt();

        try {
            System.out.println("el producto entre los dos numeros es " + Math.multiplyExact(numero1, numero2));
        } catch (ArithmeticException e) {
            System.out.println("La multiplicación causó un desbordamiento.");
            System.out.println("Error: " + e.getMessage());
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio6:
    //Realiza un programa que pida al usuario introducir dos números y muestre el resultado
    //de elevar el primero al segundo.

    private static void ej6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el numero numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("introduce el numero numero 2");
        int numero2 = scanner.nextInt();

        System.out.println("el producto entre los dos numeros es " + Math.pow(numero1, numero2));
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio7:
    //Realiza un programa que genere letras mayúsculas aleatoriamente y determine si son
    //vocales o consonantes.
    private static void ej7() {
        Random random = new Random();

        char letra = (char) (random.nextInt(26) + 'A');
        if (esVocal(letra)) {
            System.out.println(letra + " es una vocal.");
        } else {
            System.out.println(letra + " es una consonante.");
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

        System.out.println("introduce el precio");
        int precio = scanner.nextInt();
        System.out.println("introduce la superficie");
        int superficie = scanner.nextInt();
        System.out.println("introduce si tiene garaje [si/no]");
        String tieneGaraje = scanner.next();
        Boolean meInteresa;
        tieneGaraje.toLowerCase();

        if (precio < 150000 && superficie > 80 && tieneGaraje.equals("si")) {
            meInteresa = true;
        } else meInteresa = false;
        System.out.println("el interes sobre la vivienda es " + meInteresa);
    }

//----------------------------------------------------------------------------------------------------------------------

    public static boolean esVocal(char c) {
        // Crear una expresión regular que coincida con las vocales en mayúsculas y minúsculas
        String regex = "[AEIOUaeiou]";
        // Verificar si el carácter coincide con la expresión regular
        return String.valueOf(c).matches(regex);
    }
}