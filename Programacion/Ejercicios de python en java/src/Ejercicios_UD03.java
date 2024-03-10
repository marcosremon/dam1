import java.util.*;

public class Ejercicios_UD03 {

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
                case 12 -> ej12();
                case 13 -> ej13();
                case 14 -> ej14();
                case 15 -> ej15();
                case 16 -> ej16();
                case 17 -> ej17();
                case 18 -> ej18();
                case 19 -> ej19();
                case 20 -> ej20();
                case 21 -> ej21();
                case 22 -> ej22();
                case 23 -> ej23();
                case 24 -> ej24();
                default -> System.out.println("Ejercicio no válido");
            }

            System.out.print("\n¿Continuar? [y/n] ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        scanner.close();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1:
    //Dada una cadena de texto, indique el número de vocales que tiene.
    //    Entrada: Supercalifragilisticoespialidoso
    //    Salida: 15

    private static void ej1() {
        String cadena = "Supercalifragilisticoespialidoso";
        String vocales = "aeiou";
        int contador = 0;

        for (char i : cadena.toCharArray()) {
            for (char j : vocales.toCharArray()) {
                if (i == j) {
                    contador++;
                }
            }
        }
        System.out.println("hay " + contador + " vocales");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio2:
    //Determine si un número dado es un número primo. (usando for)

    private static void ej2() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Imprima los 100 primeros números de la sucesión de Fibonacci (comienza con los números 0 y 1; a partir de estos,
    //«cada término es la suma de los dos anteriores») 0,1,1,2,3,5,8,13,21...

    private static void ej3() {
        int fibo1=1;
        int fibo2=1;

        System.out.print(fibo1 + " ");
        for(int i = 2; i <= 100 ;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Escribe un programa en Python que genere todas las tablas de multiplicar (las muestre por pantalla.)

    private static void ej4() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 5:
    //Escriba un programa que pida nombre y apellidos de una persona (usando un solo input) y
    //repita la pregunta mientras el nombre no esté en formato título
    //¿Su nombre? ana torres blanco
    //Error. Debe escribirlo correctamente
    //¿Su nombre? Ana torres blanco
    //Error. Debe escribirlo correctamente
    //¿Su nombre? Ana Torres blanco
    //Error. Debe escribirlo correctamente
    //¿Su nombre? Ana Torres Blanco

    private static void ej5() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 6:
    //Escriba un programa en Python que acepte una cadena de texto e indique si todos sus caracteres son alfabéticos.
    //Versión 1: puedes usar la función isalpha(). Versión 2: No usar la función isalpha() sino una constante
    //ALPHABET = 'abcdefghijklmnopqrstuvwxyz'
    //Entrada: hello-world Salida: Se han encontrado caracteres no alfabéticos

    private static void ej6() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 7:
    //Escriba un programa en Python que acepte dos cadenas de texto y compute el producto
    //cartesiano letra a letra entre ellas.
    //Entrada: str1=abc; str2=123
    //Salida: a1 a2 a3 b1 b2 b3 c1 c2 c3

    private static void ej7() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 8:
    //Escriba un programa que calcule el máximo común divisor entre dos números enteros. No
    //utilice ningún algoritmo existente. Hágalo probando divisores.
    //Entrada: a=12; b=44
    //Salida: 4

    private static void ej8() {
        int num1 = 12;
        int num2 = 44;
        if (num2 % num1 == 0) {
            System.out.println("el maximo comun divisor es " + num1);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 9:
    //Escriba un programa que muestre por pantalla todas las fichas del dominó. La ficha «en
    //blanco» se puede representar con un 0
    //0|0 0|1 0|2 0|3 0|4 0|5 0|6
    //1|1 1|2 1|3 1|4 1|5 1|6
    //2|2 2|3 2|4 2|5 2|6
    //3|3 3|4 3|5 3|6
    //4|4 4|5 4|6
    //5|5 5|6
    //6|6

    private static void ej9() {

        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                System.out.print(i + "|" + j + " ");
            }
            System.out.println();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 10:
    //Escriba un programa que permita al usuario adivinar un número. Indicar si el número buscado
    //es menor o mayor que el que se está preguntando y mostrar igualmente el número de intentos
    //hasta encontrar el número objetivo:
    //Introduzca número: 50
    //Mayor
    //Introduzca número: 100
    //Menor
    //Introduzca número: 90
    //Menor
    //Introduzca número: 87
    //¡Enhorabuena! Has encontrado el número en 4 intentos

    private static void ej10() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 11:
    //Crear una función llamada "signo";, que reciba un número real, y devuelva un número entero
    //con el valor: -1 si el número es negativo, 1 si es positivo o 0 si es cero.

    private static void ej11() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 12:
    //Crear una función que calcule el menor de dos números enteros que recibirá como
    //parámetros. El resultado será otro número entero.

    private static void ej12() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 13:
    //Crea una función que calcule un número elevado a otro, usando multiplicaciones sucesivas.

    private static void ej13() {
        int numero = 5;
        int multiplicador = 1;
        for (int i = 0; i < numero; i++) {
            multiplicador *= numero;
        }
        System.out.println(multiplicador);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 14:
    //Crear una función "EscribirTablaMultiplicar", que reciba como parámetro un número entero, y
    //escriba la tabla de multiplicar de ese número (por ejemplo, para el 3 deberá llegar desde
    //"3x1=3"; hasta "3x10=30";).

    private static void ej14() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 15:
    //Crear una función que reciba una letra y un número, y escriba un "triángulo" formado por esa
    //letra, que tenga como anchura inicial la que se ha indicado. Por ejemplo, si la letra es Q y la
    //anchura es 4, debería escribir
    //QQQQ
    //QQQ
    //QQ
    //Q

    private static void ej15() {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("q");
            }
            System.out.println();
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 16:
    //Crear una función que tenga como parámetros de entrada números enteros y como
    //parámetro de salida un float con la media aritmética de ambos.

    private static void ej16() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 17:
    //Crea una función que dada una nota numérica devuelva una nota de forma textual: Suspenso,
    //Aprobado, Notable y Sobresaliente.

    private static void ej17() {
        int nota = 6;
        int valor = 0;
        List<String> notas = new ArrayList<>(Arrays.asList("suspenso", "suficiente", "bien", "notable",
                "sobresaliente"));
        if (nota < 5) {
            valor = 0;
        } else if (nota >= 5 && nota < 6) {
            valor = 1;
        } else if (nota >= 6 && nota < 7) {
            valor = 2;
        } else if (nota >= 7 && nota < 9) {
            valor = 3;
        } else if (nota >= 9 && nota <= 10) {
            valor = 4;
        }
        String calificacion = notas.get(valor);
        System.out.println("la calificacion del alumno con nota de " + nota + " es: '" + calificacion + "'");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 18:
    //Crear una función que calcule el mayor de dos números enteros que recibirá como
    //parámetros. El resultado será otro número entero. Desarrolla otra implementación que reciba
    //2 números reales y devuelva un número real (double).

    private static void ej18() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 19:
    //Crea una función que realice una cuenta atrás partiendo de un número entero recibido como
    //parámetro y utilizando recursividad.

    private static void ej19() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 20:
    //Crea una función que calcule el factorial de un número de manera iterativa.
    //!n = n*(n-1)*(n-2)* … *2*1+

    private static void ej20() {
        int numero = 4;
        for (int i = numero-1; i > 1; i--) {
            numero *= i;
        }
        System.out.println(numero);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 21:
    //Crea una función que calcule el factorial de un número de manera recursiva.

    private static void ej21() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 22:
    //Crea una función que calcule el valor enésimo de la sucesión de Fibonacci utilizando
    //recursividad.
    //Sucesión de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
    //Definición recursiva: f(n) = f(n-1) + f(n-2) con f(0) = 0 y f(1) = 1.

    private static void ej22() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 23:
    //Desarrolla una función que escriba la sucesión de Fibonacci hasta número de secuencia dado.

    private static void ej23() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 24:
    //Realiza una función recursiva que dado un número entero calcule la suma de todas sus cifras.

    private static void ej24() {

    }
}