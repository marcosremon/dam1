import com.sun.source.tree.BreakTree;
import javax.xml.validation.SchemaFactoryConfigurationError;
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

        System.out.print("introduce el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("introduce el segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.print("introduce el tercer numero: ");
        int numero3 = scanner.nextInt();

        int mayorProvi = Math.max(numero1, numero2);
        int elMayor = Math.max(mayorProvi, numero3);

        if ((elMayor == numero1 && elMayor == numero3) || (elMayor == numero2 && elMayor == numero3) ||
                (elMayor == numero1 && elMayor == numero2)) {
            System.out.println("hay numeros mayor se repite varias veces");
        } else System.out.println("el numero mas grande " + elMayor);
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 2:
    //Crea una clase base Figura que tenga dos métodos: área y perímetro, ambos deben retornar 0
    //por defecto. Esta clase debe tener un constructor que acepte un nombre para la figura.
    //Luego, crea dos clases: Círculo y Rectángulo. Ambas deben heredar de Figura y sobrescribir los
    //métodos área y perímetro para que retornen los valores correctos para cada figura.
    //Para Círculo, el constructor debe aceptar el radio del círculo. Para Rectángulo, el constructor
    //debe aceptar la longitud y el ancho. Finalmente, crea una función imprimir_info_figura que acepte
    //una instancia de Figura, e imprima el nombre, el área y el perímetro de la figura. Esta
    //función debe ser capaz de aceptar cualquier subclase de Figura. También debes implementar el método
    //toString para todas las clases y los métodos get y set.

    private static void ej2() {
        abstract class Figura {
            protected String nombre;
            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public Figura(String nombre) {
                this.nombre = nombre;
            }
            public float area() {
                return 0;
            }
            public float perimetro() {
                return 0;
            }
        }
        class Rectangulo extends Figura {
            private float base;
            private float altura;
            public Rectangulo(String nombre, float base, float altura) {
                super(nombre);
                this.base = base;
                this.altura = altura;
            }
            public float getBase() {
                return base;
            }
            public void setBase(float base) {
                this.base = base;
            }
            public float getAltura() {
                return altura;
            }
            public void setAltura(float altura) {
                this.altura = altura;
            }
            @Override
            public float area() {
                return base*altura;
            }

            @Override
            public float perimetro() {
                return (base*2) + (altura*2);
            }
        }
        class Circulo extends Figura {
            private final static float PI = (float) Math.PI;
            private float radio;
            public Circulo(String nombre, float radio) {
                super(nombre);
                this.radio = radio;
            }
            public float getRadio() {
                return radio;
            }
            public void setRadio(float radio) {
                this.radio = radio;
            }
            @Override
            public float area() {
                return 2 * PI * radio;
            }

            @Override
            public float perimetro() {
                return PI * (radio*radio);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Escribe un programa que pida al usuario que introduzca una serie de números (puedes hacerlo
    //a través de la consola o mediante una interfaz gráfica) terminada en -1. Los números deben ser
    //almacenados en un ArrayList. El programa debe eliminar cualquier número duplicado en la
    //lista y luego imprimir la lista resultante.

    private static void ej3() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> almacenDeNumeros = new ArrayList<>();

        System.out.print("introduce un numero: ");
        while (true) {
            int numero = scanner.nextInt();
            if (numero != -1 ) {
                if (!almacenDeNumeros.contains(numero)) {
                    almacenDeNumeros.add(numero);
                    System.out.print("introduce '-1' para acabar o introduce otro numero para continuar: ");
                } else {
                    System.out.println("has introducido duplicado, no se ha añadido a la lista");
                    System.out.print("introduce '-1' para acabar o introduce otro numero para continuar: ");
                }
            } else break;
        }
        System.out.println("la lista contiene los siguientes numeros:\n" + almacenDeNumeros);
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
        ArrayList<String> almacenDePalabras = new ArrayList<>();

        System.out.print("cuantas palabras quieres escribir: ");
        int numeroDePalabras = scanner.nextInt();
        for (int i = 1; i < numeroDePalabras+1; i++) {
            System.out.print("introduce la palabra numero " + i + " ");
            String palabra = scanner.next();
            almacenDePalabras.add(palabra);
        }
        System.out.println("la lista antes de ordenarla es:\n" + almacenDePalabras);
        Collections.sort(almacenDePalabras);
        System.out.println("la lista despues de ordenarla es:\n" + almacenDePalabras);
        System.out.print("dime una palabra para buscar: ");
        String palabraBuscada = scanner.next();
        if (almacenDePalabras.contains(palabraBuscada)) {
            int posicion = almacenDePalabras.indexOf(palabraBuscada);
            System.out.println("la posicion de la palabra " + palabraBuscada + " en la lista es " + posicion);
        } else System.out.println("la palabra que introdujiste no esta en la lista de palabras");
    }
}