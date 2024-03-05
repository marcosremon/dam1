import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ejercicios_recursividad {

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
                default -> System.out.println("Ejercicio no válido");
            }

            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1:
    //Suma de Números: Escribe una función recursiva que sume todos los números enteros
    //positivos desde 1 hasta un número N dado.

    private static void ej1() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio2:
    //Potencia de un Número: Implementa una función recursiva que calcule la potencia de un
    //número base elevado a una potencia exponente.

    private static void ej2() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Conteo de Dígitos: Crea una función que cuente cuántos dígitos tiene un número entero dado.

    private static void ej3() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Factorial con un giro: En lugar de calcular el factorial directamente, intenta escribir una
    //función que calcule la suma de los factoriales de los números enteros desde 1 hasta N.

    private static void ej4() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 5:
    //Números Primos: Desarrolla una función que determine si un número dado es primo o no utilizando recursión.

    private static void ej5() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 6:
    //Fibonacci Alternativo: En lugar de calcular la secuencia de Fibonacci, intenta escribir una
    //función que calcule la suma de los primeros N términos de la secuencia de Fibonacci.

    private static void ej6() {

    }
}