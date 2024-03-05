import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> almacenDeNumeros = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            int aleatorio = random.nextInt(50);
            almacenDeNumeros.add(aleatorio);
        }

        Map<Integer, Integer> contadorDeNumeros = new HashMap<>();

        for (int j : almacenDeNumeros) {
            contadorDeNumeros.put(j, contadorDeNumeros.getOrDefault(j, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> listaDeContadores = new ArrayList<>(contadorDeNumeros.entrySet());

        Collections.sort(listaDeContadores, (a, b) -> a.getValue().compareTo(b.getValue()));

        for (Map.Entry<Integer, Integer> entry : listaDeContadores) {
            System.out.println(entry.getKey() + " aparece " + entry.getValue() + " veces");
        }
    }
}