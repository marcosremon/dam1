import java.util.Scanner;

public class Ejercicios_UD1_00 {

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
                case 9 -> ej9();
                case 10 -> ej10();
                case 11 -> ej11();
                default -> System.out.println("Ejercicio no válido");
            }

            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 1:
    // Realiza un programa con una variable entera “segundos” la cual contiene un tiempo en segundos queremos conocer
    // este tiempo expresado en horas, minutos y segundos.
    // Ejemplo: segundos = 9500
    // 9500 segundos son 2 horas, 38 minutos y 20 segundos.

    private static void ej1() {

        int segundos = 9500;
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundos_restantes = segundos % 60;

        System.out.println("Los " + segundos + " son: " + horas + " horas, " + minutos + " minutos, y " +
                segundos_restantes + " segundos.");

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 2:
    // Realiza un programa que muestre en pantalla, respetando los retornos de línea, el siguiente texto:
    // Me gusta la programación
    // cada día más.

    private static void ej2() {

        System.out.println("Me gusta la programación\ncada día más.");

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 3:
    // Realiza un programa que pida al usuario introducir los lados de un rectángulo y calcule su área.

    private static void ej3() {

        System.out.print("Dime el lado del cuadrado: ");
        int lado_cuadrado1 = scanner.nextInt();
        int area = lado_cuadrado1 * lado_cuadrado1;
        System.out.println("El área del cuadrado es: " + area);

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 4:
    // Realiza un programa que pida al usuario introducir su nombre y después lo salude usuario
    // diciéndole “Hola” y su nombre.

    private static void ej4() {

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next();
        System.out.println("Hola " + nombre);

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 5:
    // Realiza un programa que pida al usuario introducir dos números enteros y que muestre:
    // 1. el mayor
    // 2. el menor
    // 3. si el mayor es múltiplo del menor

    private static void ej5() {

        System.out.print("Dime el primer número entero: ");
        int primer_numero_entero = scanner.nextInt();
        System.out.print("Dime el segundo número entero: ");
        int segundo_numero_entero = scanner.nextInt();

        if (primer_numero_entero > segundo_numero_entero) {
            System.out.println("El mayor es " + primer_numero_entero + " y el menor es " + segundo_numero_entero);
            if (primer_numero_entero % segundo_numero_entero == 0) {
                System.out.println("El mayor es múltiplo del segundo");
            }
        } else if (segundo_numero_entero > primer_numero_entero) {
            System.out.println("El mayor es " + segundo_numero_entero + " y el menor es " + primer_numero_entero);
            if (segundo_numero_entero % primer_numero_entero == 0) {
                System.out.println("El mayor es múltiplo del segundo");
            }
        } else {
            System.out.println("Ambos números son iguales");
        }

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 6:
    // Realiza un programa que pida al usuario introducir dos números, calcule el cociente entre
    // ambos y muestre el resultado con una precisión de 3 decimales.

    private static void ej6() {

        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            double division = numero1 / numero2;
            System.out.printf("El resultado es: %.3f%n", division);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 7:
    // Realiza un programa que pida al usuario introducir dos números y muestre el resultado de
    // elevar el primero al segundo.

    private static void ej7() {

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println(Math.pow(numero1, numero2));

    }

//----------------------------------------------------------------------------------------------------------------------

    // Ejercicio 8:
    // Realiza un programa que:
    // 1. Pida por teclado la arista de un cubo.
    // 2. Calcule el volumen del cubo.
    // 3. Muestre por pantalla el resultado.

    private static void ej8() {

        System.out.print("Introduce la arista de un cubo: ");
        int arista = scanner.nextInt();
        int volumen = (int) Math.pow(arista, 3);

        System.out.println("El volumen del cubo con arista " + arista + " es " + volumen);

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 9:
    //Realiza un programa que:
    //1. Pida por teclado la nota de tres exámenes.
    //2. Calcule la nota media de los tres exámenes.
    //3. Muestre por pantalla el resultado.

    private static void ej9() {

        System.out.print("Dime la nota del primer examen: ");
        int nota_examen1 = scanner.nextInt();
        System.out.print("Dime la nota del segundo examen: ");
        int nota_examen2 = scanner.nextInt();
        System.out.print("Dime la nota del tercer examen: ");
        int nota_examen3 = scanner.nextInt();

        int media = (nota_examen1 + nota_examen2 + nota_examen3) / 3;

        System.out.println(media + " es la media de los 3 exámenes");

    }


//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 10:
    //Realiza un programa en Java que dada dos variables v1 y v2, intercambie los valores de v1 y v2.

    private static void ej10() {

        int v1 = 5;
        int v2 = 10;

        int temp = v1;
        v1 = v2;
        v2 = temp;

        System.out.println("Después del intercv1mv2io:");
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 11:
    //Realiza un programa en Java que dada dos variables a y b, intercambie los valores de a y b
    //sin utilizar una variable adicional para facilitar el intercambio.

    private static void ej11() {

        int v1 = 5;
        int v2 = 7;

        System.out.println("originalmente v1 era: " + v1 + " y v2 era: " + v2);

        v1 += v2;
        v2 = v1 - v2;
        v1 -= v2;

        System.out.println("ahora v1 es: " + v1 + " y v2 es: " + v2);

    }

}