package Abstract.Ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) throws IOException {
        List<Legislador> listaDeLadrones = new ArrayList<>();
        File ruta = new File("data");
        File fichero = new File("data/ladronesEjercicio2.txt");
        crearArchivo(ruta);
        crearArchivo(fichero);

        Diputado diputado = new Diputado();
        Diputado diputado2 = new Diputado();
        Diputado diputado3 = new Diputado();
        Senador senador = new Senador();

        senador.setNombre("pedro manuel rollan ojeda");
        senador.setDni("87654321B");
        senador.setPartidoPolitico("pp");
        senador.setProvinciaQueRepresenta("madrid");

        diputado.setNombre("abalos");
        diputado.setDni("12345678A");
        diputado.setPartidoPolitico("psoe");
        diputado.setProvinciaQueRepresenta("valencia");

        diputado2.setNombre("tania sanchez");
        diputado2.setDni("65432178C");
        diputado2.setPartidoPolitico("potemos");
        diputado2.setProvinciaQueRepresenta("madrid");

        diputado3.setNombre("herminio sanchez");
        diputado3.setDni("18444555H");
        diputado3.setPartidoPolitico("psoe");
        diputado3.setProvinciaQueRepresenta("teruel");

        listaDeLadrones.add(diputado);
        listaDeLadrones.add(diputado2);
        listaDeLadrones.add(diputado3);
        listaDeLadrones.add(senador);

        BufferedWriter bufferedWriter = null;
        for (Legislador i : listaDeLadrones) {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(fichero, true));
                bufferedWriter.write(i.toString());
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                bufferedWriter.close();
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    private static void crearArchivo(File archivo) {
        if (!archivo.exists()) {
            String nombreArchivo = archivo.getName();
            String regexExtension = "\\.\\w+";
            Pattern patternExtension = Pattern.compile(regexExtension);
            Matcher matcherExtension = patternExtension.matcher(nombreArchivo);
            if (matcherExtension.find()) {
                try {
                    archivo.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else archivo.mkdirs();
        } else System.out.println("el archivo " + archivo.getName() + " ya existe");
    }
}