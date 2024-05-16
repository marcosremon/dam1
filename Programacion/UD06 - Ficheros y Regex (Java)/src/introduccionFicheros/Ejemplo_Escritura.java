package introduccionFicheros;

import java.io.*;
public class Ejemplo_Escritura {
    public static void main(String[] args) {
        File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;
        try {
            fichero = new File("data/archivo.txt");
            writer = new FileWriter(fichero);
            pw = new PrintWriter(writer);
            for (int i = 0; i < 10; i++) {
                pw.println("Linea " + i);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("error escribiendo en el ficher");
            e.printStackTrace();
        }
        borrarFichero("data/ficheroAborrar.txt");
    }
    public static void borrarFichero(String ruta) {
        File fichero = new File(ruta);
        boolean exito = fichero.delete();
        if (exito) {
            System.out.println("el fichero se borro exitosamente");
        } else System.out.println("no se borro");
    }
}