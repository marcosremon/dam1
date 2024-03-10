package introduccionFicheros;

import java.io.File;

public class Ejemplo_Directorio {
    public static void main(String[] args) {
        File direcorio = new File("./data");
        if (!direcorio.exists()) {
            System.out.println("el directorio " + direcorio + " no existe vamos a crearlo");
            direcorio.mkdir();
            System.out.println("creado!!");
        } else System.out.println("el directorio " + direcorio + " ya existe");
    }
}