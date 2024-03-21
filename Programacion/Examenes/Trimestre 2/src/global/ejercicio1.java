package global;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una frase");
        String palabra1 = scanner.nextLine().toLowerCase();
        System.out.println("introduce otra frase");
        String palabra2 = scanner.nextLine().toLowerCase();
        String[] almacenPalabra1 = palabra1.split(" ");
        String[] almacenPalabra2 = palabra1.split(" ");
        for (String i : almacenPalabra1) {
            for (String j : almacenPalabra2){
                if (i.equals(j)) {
                    System.out.println(i);
                }
            }
        }
    }
}
