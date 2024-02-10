import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Ciclismo {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> numeroCorredores = new HashMap<>();
        Map<String, String> ciclistaEquipo = new HashMap<>();
        Map<String, Integer> equipoSumaEdades = new HashMap<>();
        Map<String, Integer> paisNumero = new HashMap<>();
        String ruta = "./data";
        File[] archivos = listarDirectorios(ruta);

        //coger cada archivo y coger su contenido...
        for (File archivo : archivos) {
            //con trim quito los espacios
            String nombreEquipo = archivo.getName().replace(".txt","").trim();
            System.out.println("tratamos el archivo: " + nombreEquipo);
            numeroCorredores.put(nombreEquipo, 0);
            equipoSumaEdades.put(nombreEquipo, 0);
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
                String linea = "";
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                    int numeroDeCiclistasEnEquipo = numeroCorredores.get(nombreEquipo);
                    numeroCorredores.put(nombreEquipo, numeroDeCiclistasEnEquipo+1);
                    String[] partes = linea.split("\\|");
                    String nombre = partes[0].trim();
                    String pais = partes[1].trim();
                    int numeroDeCorredoresEnUnPais = paisNumero.getOrDefault(pais,0);
                    paisNumero.put(pais, numeroDeCorredoresEnUnPais + 1);
                    int edad = Integer.parseInt(partes[2].replace("años","").trim());
                    System.out.println(nombre + " " + pais + " " + edad);
                    ciclistaEquipo.put(nombre, nombreEquipo);
                    int sumaEdades = equipoSumaEdades.get(nombreEquipo);
                    equipoSumaEdades.put(nombreEquipo, sumaEdades + edad);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //cual es el equipo con mas corredores
        equiopoConMasCorredores(numeroCorredores);
        //cual es el equipo con meno corredores
        equiopoConMenosCorredores(numeroCorredores);
        //buso a Jonas Vingegaard
        buscarCiclista("jonas vingegaard", ciclistaEquipo);
        //equipo con menor media de edad
        equiopoConMenorMediaDeEdad(equipoSumaEdades, numeroCorredores);
        //equipo con mayor media de edad
        equiopoConMayorMediaDeEdad(equipoSumaEdades, numeroCorredores);
        //pais con mas corredores
        paisConMasCorredores(paisNumero);
        interfazBuscaCiclista(ciclistaEquipo);
    }
    private static void interfazBuscaCiclista(Map<String, String> ciclistaEquipo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un ciclista");
        String nombre = scanner.nextLine();
        if (ciclistaEquipo.containsKey(nombre)) {
            System.out.println("el ciclista " + nombre + " pertenece a: " + ciclistaEquipo.get(nombre));
        }
    }
    private static void paisConMasCorredores(Map<String, Integer> paisNumero) {
        int maximo = Collections.max(paisNumero.values());
        for (String key : paisNumero.keySet()) {
            int valor = paisNumero.get(key);
            if (maximo == valor) {
                System.out.println("el pais con mas corredores es: " + key + " y tiene " +
                        valor + " corredores");
            }
        }
    }
    private static void equiopoConMayorMediaDeEdad(Map<String, Integer> equipoSumaEdades,
                                                   Map<String, Integer> numeroCorredores) {
        int maximo = Collections.max(equipoSumaEdades.values());
        for (String key : equipoSumaEdades.keySet()) {
            int valor = equipoSumaEdades.get(key);
            if (valor == maximo) {
                System.out.println("el equipo con mayor media de edad es: " + key +
                        " y la media es:" + valor);
            }
        }
    }
    private static void equiopoConMenorMediaDeEdad(Map<String, Integer> equipoSumaEdades,
                                                   Map<String, Integer> numeroCorredores) {
        for (String key : equipoSumaEdades.keySet()) {
            System.out.println(key + " " + numeroCorredores.get(key));
            int valor = numeroCorredores.get(key);
            int valorSuma = equipoSumaEdades.get(key);
            equipoSumaEdades.put(key, valorSuma / valor);
        }
        int minimo = Collections.min(equipoSumaEdades.values());
        for (String key : equipoSumaEdades.keySet()) {
            int valor = equipoSumaEdades.get(key);
            if (valor == minimo) {
                System.out.println("el equipo con menor media de edad es: " + key +
                        " y la media es:" + valor);
            }
        }
    }
    private static void buscarCiclista(String nombre, Map<String, String> ciclistaEquipo) {
        System.out.println("El ciclista " + nombre +  " corre en el equipo " +
                ciclistaEquipo.get(nombre));
    }
    private static void equiopoConMenosCorredores(Map<String, Integer> numeroCorredores) {
        int minimo = Collections.min(numeroCorredores.values());
        for (String key : numeroCorredores.keySet()) {
            int valor = numeroCorredores.get(key);
            if (minimo == valor) {
                System.out.println("el equipo con menos corredores es: " + key +
                        " y tiene " + valor + " corredores.");
            }
        }
    }
    private static void equiopoConMasCorredores(Map<String, Integer> numeroCorredores) {
        int maximo = Collections.max(numeroCorredores.values());
        for (String key : numeroCorredores.keySet()) {
            int valor = numeroCorredores.get(key);
            if (maximo == valor) {
                System.out.println("el equipo con mas corredores es: " + key +
                        " y tiene " + valor + " corredores.");
            }
        }
    }
    private static File[] listarDirectorios(String ruta) {
        File directorio = new File(ruta);
        if (directorio.exists() && directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            return archivos;
        } else {
            System.out.println("el directorio indicado no existe");
            System.exit(1);
            return null;
        }
    }
}