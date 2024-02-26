import java.io.*;
import java.util.*;

//Lo primero que debes hacer es recorrer todos los archivos del directorio e ir tratando cada
//fichero que te encuentras. Una vez hecho esto debes, realizar un programa que nos diga:
// ¿Cuál es el equipo que más corredores tiene?
// ¿Cuál es el equipo que menos corredores tiene?
// Busca e indica en qué equipo se encuentra “Jonas Vingegaard”
// Indica cual el equipo con menor media de edad entre sus corredores.
// Indica cual es el equipo con mayor media de edad entre sus corredores.
// Cuál es el país que más corredores tiene e indica el número de corredores.

public class Ciclismo {
    public static void main(String[] args) {
        File movistar = new File("data/Movistar.txt");
        File jumbo = new File("data/JumboVisma.txt");
        File emirates = new File("data/UAE Team Emirates.txt");

        BufferedReader bufferedReaderMovistar = null;
        BufferedReader bufferedReaderJumbo = null;
        BufferedReader bufferedReaderEmirates = null;
        BufferedReader bufferedReaderMovistarDatosParticipantes = null;
        BufferedReader bufferedReaderJumboDatosParticipantes = null;
        BufferedReader bufferedReaderEmiratesDatosParticipantes = null;
        try {
            bufferedReaderMovistar = new BufferedReader(new FileReader(movistar));
            bufferedReaderJumbo = new BufferedReader(new FileReader(jumbo));
            bufferedReaderEmirates = new BufferedReader(new FileReader(emirates));
            bufferedReaderMovistarDatosParticipantes = new BufferedReader(new FileReader(movistar));
            bufferedReaderJumboDatosParticipantes = new BufferedReader(new FileReader(jumbo));
            bufferedReaderEmiratesDatosParticipantes = new BufferedReader(new FileReader(emirates));

            System.out.println("-------------------------------------------------------------------------------------");

            int corredoresMovistar = contadorDeCorredores(bufferedReaderMovistar);
            int corredoresJumbo = contadorDeCorredores(bufferedReaderJumbo);
            int corredoresEmirates = contadorDeCorredores(bufferedReaderEmirates);
            System.out.println("El equipo de Movistar tiene " + corredoresMovistar + " corredores");
            System.out.println("El equipo de Jumbo tiene " + corredoresJumbo + " corredores");
            System.out.println("El equipo de Emirates tiene " + corredoresEmirates + " corredores");

            System.out.println("-------------------------------------------------------------------------------------");

            if (corredoresMovistar > corredoresJumbo && corredoresMovistar > corredoresEmirates) {
                System.out.println("movistar es el equipo con mas corrredores con un total de " + corredoresMovistar);
            } else if (corredoresJumbo > corredoresMovistar && corredoresJumbo > corredoresEmirates) {
                System.out.println("Jumbo es el equipo con mas corrredores con un total de " + corredoresJumbo);
            } else if (corredoresEmirates > corredoresMovistar && corredoresEmirates > corredoresJumbo) {
                System.out.println("Emirates es el equipo con mas corrredores con un total de " + corredoresEmirates);
            }

            if (corredoresMovistar < corredoresJumbo && corredoresMovistar < corredoresEmirates) {
                System.out.println("movistar es el equipo con menos corrredores con un total de " + corredoresMovistar);
            } else if (corredoresJumbo < corredoresMovistar && corredoresJumbo < corredoresEmirates) {
                System.out.println("Jumbo es el equipo con menos corrredores con un total de " + corredoresJumbo);
            } else if (corredoresEmirates < corredoresMovistar && corredoresEmirates < corredoresJumbo) {
                System.out.println("Emirates es el equipo con menos corrredores con un total de " + corredoresEmirates);
            }

            System.out.println("------------------------------------------------------------------------------------");

            List<String> movistarNombre = new ArrayList<>();
            List<Integer> movistarEdad = new ArrayList<>();
            List<String> movistarPais = new ArrayList<>();
            List<String> jumboNombre = new ArrayList<>();
            List<Integer> jumboEdad = new ArrayList<>();
            List<String> jumboPais = new ArrayList<>();
            List<String> emiratesNombre = new ArrayList<>();
            List<Integer> emiratesEdad = new ArrayList<>();
            List<String> emiratesPais = new ArrayList<>();

            datosParticipantes(bufferedReaderMovistarDatosParticipantes, movistarNombre, movistarEdad, movistarPais);
            datosParticipantes(bufferedReaderJumboDatosParticipantes, jumboNombre, jumboEdad, jumboPais);
            datosParticipantes(bufferedReaderEmiratesDatosParticipantes, emiratesNombre, emiratesEdad, emiratesPais);
            if (movistarNombre.contains("Jonas Vingegaard")) {
                System.out.println("Jonas Vingegaard pertenece a el equipo de Movistar");
            } else if (jumboNombre.contains("Jonas Vingegaard")) {
                System.out.println("Jonas Vingegaard pertenece a el equipo de Jumbo");
            } else if (emiratesNombre.contains("Jonas Vingegaard")) {
                System.out.println("Jonas Vingegaard pertenece a el equipo de Emirates");
            }

            System.out.println("------------------------------------------------------------------------------------");

            int movistarMediaEdad = mediaDeEdad(movistarEdad);
            int jumboMediaEdad = mediaDeEdad(jumboEdad);
            int emiratesMediaEdad = mediaDeEdad(emiratesEdad);
            System.out.println("la media de edad de el equipo Movistar es " + movistarMediaEdad);
            System.out.println("la media de edad de el equipo Jumbo es " + jumboMediaEdad);
            System.out.println("la media de edad de el equipo Emirates es " + emiratesMediaEdad);

            System.out.println("------------------------------------------------------------------------------------");

            if (movistarMediaEdad > jumboMediaEdad && movistarMediaEdad > emiratesMediaEdad) {
                System.out.println("movistar es el equipo la media de edad mas alta " + movistarMediaEdad);
            } else if (jumboMediaEdad > movistarMediaEdad && jumboMediaEdad > emiratesMediaEdad) {
                System.out.println("Jumbo es el equipo la media de edad mas alta " + jumboMediaEdad);
            } else if (emiratesMediaEdad > movistarMediaEdad && emiratesMediaEdad > jumboMediaEdad) {
                System.out.println("Emirates es el equipo la media de edad mas alta " + emiratesMediaEdad);
            }

            if (movistarMediaEdad < jumboMediaEdad && movistarMediaEdad < emiratesMediaEdad) {
                System.out.println("movistar es el equipo la media de edad mas baja " + movistarMediaEdad);
            } else if (jumboMediaEdad < movistarMediaEdad && jumboMediaEdad < emiratesMediaEdad) {
                System.out.println("Jumbo es el equipo la media de edad mas baja " + jumboMediaEdad);
            } else if (emiratesMediaEdad < movistarMediaEdad && emiratesMediaEdad < jumboMediaEdad) {
                System.out.println("Emirates es el equipo la media de edad mas baja " + emiratesMediaEdad);
            }

            List<String> corredoresTotales = new ArrayList<>();
            corredoresTotales.addAll(movistarPais);
            corredoresTotales.addAll(jumboPais);
            corredoresTotales.addAll(emiratesPais);
            Set<String> paisesSinDuplicados = new LinkedHashSet<>(corredoresTotales);

            int corredoresMax = 0;
            String paisConMasCorredores = "";
            for (String i : paisesSinDuplicados) {
                int contador = 0;
                for (String j : corredoresTotales) {
                    if (j.equals(i)) {
                        contador++;
                    }
                }
                if (contador > corredoresMax) {
                    corredoresMax = contador;
                    paisConMasCorredores = i;
                }
            }

            System.out.println("------------------------------------------------------------------------------------");

            System.out.println("el pais con mas corredores es " + paisConMasCorredores + " con " + corredoresMax +
                    " corredores");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReaderMovistar.close();
                bufferedReaderJumbo.close();
                bufferedReaderEmirates.close();
                bufferedReaderMovistarDatosParticipantes.close();
                bufferedReaderJumboDatosParticipantes.close();
                bufferedReaderEmiratesDatosParticipantes.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    private static int contadorDeCorredores(BufferedReader bufferedReader) {
        int contador = 0;
        String linea;
        while (true) {
            try {
                while (((linea = bufferedReader.readLine()) != null)) {
                    contador++;
                }
                return contador;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static void datosParticipantes(BufferedReader bufferedReader,
                                           List<String> listaNombre,
                                           List<Integer> listaEdad,
                                           List<String> listaPais) {
        String linea;
        try {
            while (((linea = bufferedReader.readLine()) != null)) {
                String[] separacionesDelTexto = linea.split("\\|");
                String nombre = separacionesDelTexto[0].trim();
                String pais = separacionesDelTexto[1].trim();
                Integer edad = Integer.valueOf(separacionesDelTexto[2].
                        replace("años", "").replace(".", "").trim());
                listaNombre.add(nombre);
                listaEdad.add(edad);
                listaPais.add(pais);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static int mediaDeEdad(List<Integer> listaEdad) {
        int suma = 0;
        for (int i : listaEdad) {
            suma += i;
        }
        return suma/listaEdad.size();
    }
}