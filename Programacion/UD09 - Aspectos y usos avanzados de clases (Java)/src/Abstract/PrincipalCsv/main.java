package Abstract.PrincipalCsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        List<Diputado> listaDiputados = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("data/congreso.csv"));
            String linea = bufferedReader.readLine(); //esto se hace para ignorar la primera linea
            while ((linea = bufferedReader.readLine()) != null) {
                linea = linea.replace(";;", "; ;");
                String[] partes = linea.split(";");
                String nombre = partes[0];
                String grupo = partes[1];
                String lista = partes[2];
                String provincia = partes[3];
                String fechaAlta = partes[4];
                String fechaBaja = partes[5];
                if (fechaBaja.equals(" ")) fechaBaja = null;
                Diputado diputado = new Diputado(nombre, grupo, lista, provincia, fechaAlta, fechaBaja);
                listaDiputados.add(diputado);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //crear la interfaz
        System.out.println(listaDiputados);
    }
}