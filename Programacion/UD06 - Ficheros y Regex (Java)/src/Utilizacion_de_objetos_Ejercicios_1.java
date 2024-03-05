import java.util.Arrays;
import java.util.List;
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

    //Ejercicio 1:
    //Realiza un programa que pida al usuario introducir los lados de un rectángulo y calcule su área.

    private static void ej1() {
        class Rectangulo {
            int base = 0;
            int altura = 0;

            public Rectangulo(int base, int altura) {
                this.base = base;
                this.altura = altura;
            }
            public int getBase() {
                return base;
            }
            public void setBase(int base) {
                this.base = base;
            }
            public int getAltura() {
                return altura;
            }
            public void setAltura(int altura) {
                this.altura = altura;
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Realiza un programa que pida al usuario introducir su nombre y después lo salude
    //usuario diciéndole “Hola” y su nombre.

    private static void ej2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce tu nombre");
        String nombre = scanner.next();
        System.out.println("holaaa " + nombre);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Realiza un programa que pida al usuario introducir un número y devuelva su raíz
    //cuadrada. Ayuda: la clase Math tiene una función (sqrt) que calcula la raíz cuadrada.

    private static void ej3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un numero para calcular su raiz cuadrada");
        Double numero = scanner.nextDouble();
        System.out.println("la raiz cuadrada de el numero " + numero + " es " + Math.sqrt(numero));
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
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
        Random random = new Random();
        //a)
        System.out.println("a)");
        int aleatorio1 = random.nextInt(101);
        System.out.println(aleatorio1);
        //b)
        System.out.println("b)");
        System.out.print("dime un numero: ");
        int numero = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            int aleatorio2 = random.nextInt(numero);
            System.out.println(aleatorio2);
        }
        //c)
        System.out.println("b)");
        System.out.print("dime el primer numero: ");
        int numero2 = scanner.nextInt();
        System.out.print("dime el segundo numero: ");
        int numero3 = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            int aleatorio3 = random.nextInt(numero2, numero3);
            System.out.println(aleatorio3);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 5:
    //¿Qué método de la clase Math utilizarías para realizar el producto de dos enteros y
    //asegurarte de que el resultado no hace overflow? Haz un programa que lo pruebe.

    private static void ej5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dime el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("dime el segundo numero: ");
        int numero2 = scanner.nextInt();

        int producto = Math.multiplyExact(numero1, numero2);
        System.out.println("el producto entre " + numero1 + " y " +  numero2 + " es: " + producto);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 6:
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

    //Ejercicio 7:
    //Realiza un programa que genere letras mayúsculas aleatoriamente y determine si son
    //vocales o consonantes.
    private static void ej7() {
        Random random = new Random();

        char letra = (char) (random.nextInt(26) + 'A');
        System.out.println(letra);
        List<Character> listaPredeterminada = Arrays.asList('A', 'E', 'I', 'O', 'U');
        if (listaPredeterminada.contains(letra)) {
            System.out.println("es vocal");
        } else System.out.println("es constante");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 8:
    //Crea un programa para procesar datos de viviendas; define las siguientes variables
    //enteras precio y superficie y la variable booleana tieneGaraje. El programa deberá
    //pedir al usuario que introduzca los valores para estas tres variables. Declara la variable
    //booleana meInteresa cuyo valor será:
    //   Verdadero. Si el precio es menor a 150.000 €, la superficie es mayor que 80m cuadrados y la
    //     vivienda tiene garaje.
    //   Falso. En caso contrario.
    //     El programa mostrará el valor de meInteresa por consola para visualizar si estamos o
    //     no interesados en la vivienda.

    private static void ej8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce el precio de la vivienda: ");
        int precio = scanner.nextInt();
        System.out.print("introduce la superficie de la casa: ");
        int superficie = scanner.nextInt();
        System.out.print("tiene garaje (true/false): ");
        boolean tieneGaraje = scanner.nextBoolean();
        boolean meInteresa;

        if (precio < 150000 && superficie > 80 && tieneGaraje) {
            meInteresa = true;
        } else meInteresa = false;
        System.out.println("el interes sobre la vivienda es: " + meInteresa);
    }
}