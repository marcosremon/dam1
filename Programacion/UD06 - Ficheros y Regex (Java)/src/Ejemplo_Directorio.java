import java.io.File;

public class Ejemplo_Directorio {
    public static void main(String[] args) {
        File file = new File("./data");
        if (!file.exists()) {
            System.out.println("no existe, vamos a crearlo");
            file.mkdir();
            System.out.println("creado!!");
        } else System.out.println("existe");
    }
}