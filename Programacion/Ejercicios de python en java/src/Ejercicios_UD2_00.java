import java.util.Random;
import java.util.Scanner;

public class Ejercicios_UD2_00 {

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
    //Escriba un programa en Java que acepte 3 números y calcule el mínimo. Usa condicionales.
    //Entrada: 7, 4, 9
    //Salida: 4

    private static void ej1() {

        int numero1 = 2;
        int numero2 = 4;
        int numero3 = 9;
        int menor = 0;

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        } else menor = numero3;

        System.out.println(menor + " es el numero mas pequeño de los 3");

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio2:
    //Escriba un programa en Java que acepte un país (como «string») y muestre por pantalla su
    //bandera (como «emoji»). Puedes restringirlo a un conjunto limitado de países.
    //Entrada: Italia
    //Salida: emoji de la bandera de italia

    private static void ej2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("dime un del g7:");
        String pais = scanner.nextLine();
        pais = pais.toLowerCase();

        if (pais.equals("estados unidos") || pais.equals("eeuu")) {
            System.out.println("este pais es eeuu");
        } else if (pais.equals("alemania")) {
            System.out.println("este pais es alemania");
        } else if (pais.equals("japon")) {
            System.out.println("este pais es japon");
        } else if (pais.equals("reino unido") || pais.equals("uk")) {
            System.out.println("este pais es reino unido");
        } else if (pais.equals("francia")) {
            System.out.println("este pais es francia");
        } else if (pais.equals("canada")) {
            System.out.println("este pais es canada");
        } else if (pais.equals("italia")) {
            System.out.println("este pais es italia");
        }

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 3:
    //Escriba un programa en Java que acepte edad, peso, pulso y plaquetas, y determine si una
    //persona cumple con estos requisitos para donar sangre. (disponibles en la siguiente hoja)
    //Entrada: edad=34; peso=81; pulso=70; plaquetas=150000
    //Salida: Apto para donar sangre

    private static void ej3() {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("dime tu edad: ");
        int edad = scanner.nextInt();
        System.out.printf("dime tu peso: ");
        int peso = scanner.nextInt();
        System.out.printf("dime tu pulso: ");
        int pulso = scanner.nextInt();
        System.out.printf("dime tus plaquetas: ");
        int plaquetas = scanner.nextInt();

        if (edad >= 18 && edad < 65) {
            System.out.printf("tus plaquetas estan en orden");
        } else System.out.printf("tu edad no es sana para este acto") ;

        if (peso > 55) {
            System.out.printf("tu peso es sano");
        } else System.out.printf("tu peso no es apto para donar sangre");

        if (pulso > 50 && pulso < 110) {
            System.out.printf("tus pulsaciones estan en orden");
        } else System.out.println("tus pulsaciones no son buenas para donar sangre");

        if (plaquetas > 150000) {
            System.out.printf("tus plaqutas estan en orden");
        } else System.out.printf("tus plaqutas no son aptas para donar sangre");

        if (edad >= 18 && edad < 65 && peso > 55 && pulso > 50 && pulso < 110 && plaquetas > 150000) {
            System.out.printf("todos tus parametros estan en orden para donar sangre");
        } else System.out.printf("no puedes donar ya que algun parametro no es apto");

    }

//----------------------------------------------------------------------------------------------------------------------

    //Ejercicio 4:
    //Escriba un programa en Java que acepte la opción de dos jugadoras en Piedra-Papel-Tijera y 
    //decida el resultado. 
    //Entrada: person1=piedra; person2=papel 
    //Salida: Gana persona2: El papel envuelve a la piedra

    private static void ej4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("elije piedra, papel o tijera: ");
        String eleccionplayer = scanner.nextLine().toLowerCase();

        String[] palabras = {"piedra", "papel", "tijera"};
        Random aleatorio = new Random();
        String eleccionmaquina = palabras[aleatorio.nextInt(palabras.length)];

        System.out.println("elegiste: " + eleccionplayer);
        System.out.println("---------------------------");
        System.out.println("la maquina eligio:");
        System.out.println(eleccionmaquina);
        System.out.println();

        if ((eleccionplayer.equals("piedra") && eleccionmaquina.equals("piedra")) ||
                (eleccionplayer.equals("papel") && eleccionmaquina.equals("papel")) ||
                (eleccionplayer.equals("tijera") && eleccionmaquina.equals("tijera"))) {
            System.out.println("¡Hubo Empate!");
        } else if ((eleccionplayer.equals("piedra") && eleccionmaquina.equals("tijera")) ||
                (eleccionplayer.equals("papel") && eleccionmaquina.equals("piedra")) ||
                (eleccionplayer.equals("tijera") && eleccionmaquina.equals("papel"))) {
            System.out.println("¡Gana el jugador!");
        } else System.out.println("¡Gana la máquina!");
    }
}