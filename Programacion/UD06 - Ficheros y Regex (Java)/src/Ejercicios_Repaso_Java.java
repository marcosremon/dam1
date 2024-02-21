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

        System.out.println("dime el numero numero 1:");
        int numero1 = scanner.nextInt();
        System.out.println("dime el numero numero 2:");
        int numero2 = scanner.nextInt();
        System.out.println("dime el numero numero 3:");
        int numero3 = scanner.nextInt();

        int elMayorDeLosTres = Math.max(Math.max(numero1, numero2), numero3);

        if (elMayorDeLosTres == numero1 && elMayorDeLosTres == numero2 && elMayorDeLosTres == numero3) {
            System.out.println("Los tres números son iguales y son el mayor: " + elMayorDeLosTres);
        } else if (elMayorDeLosTres == numero1 && elMayorDeLosTres == numero2) {
            System.out.println("El primer y segundo número son iguales y son el mayor: " + elMayorDeLosTres);
        } else if (elMayorDeLosTres == numero1 && elMayorDeLosTres == numero3) {
            System.out.println("El primer y tercer número son iguales y son el mayor: " + elMayorDeLosTres);
        } else if (elMayorDeLosTres == numero2 && elMayorDeLosTres == numero3) {
            System.out.println("El segundo y tercer número son iguales y son el mayor: " + elMayorDeLosTres);
        } else {
            System.out.println("El número mayor es: " + elMayorDeLosTres);
        }
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

        List<Integer> listaConDuplicados = new ArrayList<>();
        List<Integer> listaSinDuplicados = new ArrayList<>();
        int contador = 1;

        while (true) {
            System.out.println("dime el numero numero: " + contador);
            int numero = scanner.nextInt();
            if (numero != -1) {
                listaConDuplicados.add(numero);
                contador += 1;
            } else break;
        }
        for (int i : listaConDuplicados) {
            if (!listaSinDuplicados.contains(i)) {
                listaSinDuplicados.add(i);
            }
        }
        System.out.println("la lista original con duplicados es:");
        System.out.println(listaConDuplicados);
        System.out.println("la lista sin duplicados es:");
        System.out.println(listaSinDuplicados);
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
        ArrayList<String> listaDePalaras = new ArrayList<>();

        System.out.println("cuantas palabra quieres poner?");
        int numeroDePalabras = scanner.nextInt();

        for (int i = 1; i < numeroDePalabras + 1; i++) {
            System.out.println("Dime la palabra número " + i + ":");
            String palabra = scanner.next();
            listaDePalaras.add(palabra);
        }
        Collections.sort(listaDePalaras);
        System.out.println("dime una palabra de la lista");
        String buscarPalabra = scanner.next();
        System.out.println("la lista queda asi tras ordenarla: " + listaDePalaras);
        if (listaDePalaras.contains(buscarPalabra)) {
            int posicion = listaDePalaras.indexOf(buscarPalabra);
            System.out.println("la posicion de la palabra: " + buscarPalabra + " la cual has seleccionado tu es " +
                    "la posicion numero: " + posicion);
        } else System.out.println("la palabra que indicaste no esta introducida en la lista");
    }
}