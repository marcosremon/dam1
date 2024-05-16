package Abstract.Ejercicio3;

//importar diputado y senador del ejercicio 3

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        List<Legislador> listaLadrones = new ArrayList<>();
        try {
            bufferedReader = new BufferedReader(new FileReader("data/ladrones.txt"));
            String linea = "";
            while ((linea = bufferedReader.readLine()) != null) {
                if (linea.equals("Diputado:")) {
                    String nombre = bufferedReader.readLine();
                    String dni = bufferedReader.readLine();
                    String partidoPolitico = bufferedReader.readLine();
                    String provincia = bufferedReader.readLine();
                    Diputado diputado = new Diputado();
                    diputado.setNombre(nombre);
                    diputado.setDni(dni);
                    diputado.setPartidoPolitico(partidoPolitico);
                    diputado.setProvinciaQueRepresenta(provincia);
                    listaLadrones.add(diputado);
                } else if (linea.equals("Senador:")) {
                    String nombre = bufferedReader.readLine();
                    String dni = bufferedReader.readLine();
                    String partidoPolitico = bufferedReader.readLine();
                    String provincia = bufferedReader.readLine();
                    Senador senador = new Senador();
                    senador.setNombre(nombre);
                    senador.setDni(dni);
                    senador.setPartidoPolitico(partidoPolitico);
                    senador.setProvinciaQueRepresenta(provincia);
                    listaLadrones.add(senador);
                }
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
    }
}