package Utilizacion_de_objetos_Ejercicios_1.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generador {
    List<Character> vocales = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public void generadorLetras() {
        Random random = new Random();

        char letra = (char) (random.nextInt(26) + 'a');
        if (vocales.contains(letra)) {
            System.out.println("la letra " + letra + " una vocal");
        } else System.out.println("la letra " + letra + " es una consonante");
    }
}
