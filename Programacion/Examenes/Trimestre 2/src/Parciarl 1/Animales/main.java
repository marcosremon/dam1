package parcial1.Animales;

public class main {
    public static void main(String[] args) {
        Gato gato1 = new Gato(true);
        Gato gato2 = new Gato(true);
        try {
            gato1.apareamiento(gato2);
        } catch (losGaysNoFollan e) {
            throw new RuntimeException(e);
        }
    }
}