import java.util.*;

public class Ejercicios_Repaso_Java {

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
    //Escribe un programa que pida al usuario tres números y determine cuál de ellos es el mayor.
    //Si hay dos o más números que son el mayor (es decir, si hay un empate), el programa debe indicarlo.

    private static void ej1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("dime otro numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("dime otro numero: ");
        double numero3 = scanner.nextDouble();

        if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3) {
            double mayor = Math.max(numero1, numero2);
            double themayor = Math.max(mayor, numero3);
            System.out.println("el mayor de los tres es: " + themayor);
        } else System.out.println("hay empate");
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Crea una clase base Figura que tenga dos métodos: área y perímetro, ambos deben retornar 0
    //por defecto. Esta clase debe tener un constructor que acepte un nombre para la figura.
    //Luego, crea dos clases: Círculo y Rectángulo. Ambas deben heredar de Figura y sobrescribir los
    //métodos área y perímetro para que retornen los valores correctos para cada figura.
    //Para Círculo, el constructor debe aceptar el radio del círculo. Para Rectángulo, el constructor
    //debe aceptar la longitud y el ancho.
    //Finalmente, crea una función imprimir_info_figura que acepte una instancia de Figura, e
    //imprima el nombre, el área y el perímetro de la figura. Esta función debe ser capaz de aceptar
    //cualquier subclase de Figura. También debes implementar el método toString para todas las
    //clases y los métodos get y set.

    private static void ej2() {

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Escribe un programa que pida al usuario que introduzca una serie de números (puedes hacerlo
    //a través de la consola o mediante una interfaz gráfica) terminada en -1. Los números deben ser
    //almacenados en un ArrayList. El programa debe eliminar cualquier número duplicado en la
    //lista y luego imprimir la lista resultante.

    private static void ej3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("cuantos numeros quieres añadir");
        int anyadirnumeros = scanner.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < anyadirnumeros; i++) {
            System.out.println("dime un numero:");
            int numero = scanner.nextInt();
            while (true) {
                if (lista.contains(numero)) {
                    System.out.println("ese numero ya esta en la lista añada otro");
                    numero = scanner.nextInt();
                } else {
                    lista.add(numero);
                    break;
                }
            }
        }
        lista.add(-1);
        System.out.println("la lista contiene los siguientes numeros: \n" + lista);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Escribe un programa que pida al usuario que introduzca una serie de palabras (puedes hacerlo
    //a través de la consola o mediante una interfaz gráfica). Las palabras deben ser almacenadas en
    //un ArrayList. El programa debe ordenar la lista en orden alfabético y luego permitir al usuario
    //buscar palabras en la lista. Si la palabra está en la lista, el programa debe indicar en qué
    //posición se encuentra. Si no está, debe indicarlo también.

    private static void ej4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("dime cuantas palabras quieres añadir a la lista");
        int anyadirnumeros = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < anyadirnumeros; ++i) {
            System.out.println("dime una palabra");
            String palabra = scanner.nextLine();
            lista.add(palabra);
        }
        Collections.sort(lista);
        System.out.println("la lista contiene estas palabras: " + lista + " dime una palabra");
        String buscarPosicionPalabra = scanner.nextLine();

        if (lista.contains(buscarPosicionPalabra)) {
            System.out.println("la palabra " + buscarPosicionPalabra + " esta dentro de la lista");
        } else System.out.println("la palabra " + buscarPosicionPalabra + " no esta en la lista");
    }
}