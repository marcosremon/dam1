import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> almacenDeNumeros = new ArrayList<>();
        List<Integer> almacenDeContadores = new ArrayList<>();

        List<Integer> orden = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            int aleatorio = random.nextInt(50);
            almacenDeNumeros.add(aleatorio);
        }

        Set<Integer> almacenDeNumerosSinDuplicados = new HashSet<>(almacenDeNumeros);
        List<Integer> almacenDeNumerosSinDuplicados2 = new ArrayList<>(almacenDeNumerosSinDuplicados);

        for (int j : almacenDeNumerosSinDuplicados) {
            int contador = 0;
            for (int k : almacenDeNumeros) {
                if (k == j) {
                    contador ++;
                }
            }
            System.out.println(j + " aparece " + contador + " veces");
        }
    }
}
