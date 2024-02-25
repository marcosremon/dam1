import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        crearArchivo(movistar);
        crearArchivo(jumbo);
        crearArchivo(emirates);

        BufferedReader bufferedReader1 = null;
        BufferedReader bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        BufferedReader bufferedReader4 = null;
        BufferedReader bufferedReader5 = null;
        BufferedReader bufferedReader6 = null;
        try {
            bufferedReader1 = new BufferedReader(new FileReader(movistar));
            bufferedReader2 = new BufferedReader(new FileReader(jumbo));
            bufferedReader3 = new BufferedReader(new FileReader(emirates));
            bufferedReader4 = new BufferedReader(new FileReader(movistar));
            bufferedReader5 = new BufferedReader(new FileReader(jumbo));
            bufferedReader6 = new BufferedReader(new FileReader(emirates));

            System.out.println("---------------------------------------------------");

            int movistarCorredores = contadorDeParticipantes(bufferedReader1);
            System.out.println("Movistar tiene " + movistarCorredores + " corredores");
            int jumboCorredores = contadorDeParticipantes(bufferedReader2);
            System.out.println("JumboVisma tiene " + jumboCorredores + " corredores");
            int emiratesCorredores = contadorDeParticipantes(bufferedReader3);
            System.out.println("UAE Team Emirates tiene " + emiratesCorredores + " corredores");

            System.out.println("---------------------------------------------------");

            if (movistarCorredores > jumboCorredores && movistarCorredores > emiratesCorredores){
                System.out.println("movistar es el equipo con mas corredores: " + movistarCorredores + " corredores");
            } else if (jumboCorredores > movistarCorredores && jumboCorredores > emiratesCorredores) {
                System.out.println("JumboVisma es el equipo con mas corredores: " + jumboCorredores + " corredores");
            } else if (emiratesCorredores > jumboCorredores && emiratesCorredores > movistarCorredores) {
                System.out.println("UAE Team Emirates es el equipo con mas corredores: " + emiratesCorredores +
                        " corredores");
            }

            System.out.println("---------------------------------------------------");

            if (movistarCorredores < jumboCorredores && movistarCorredores < emiratesCorredores){
                System.out.println("movistar es el equipo con menos corredores: " + movistarCorredores + " corredores");
            } else if (jumboCorredores < movistarCorredores && jumboCorredores < emiratesCorredores) {
                System.out.println("JumboVisma es el equipo con menos corredores: " + jumboCorredores + " corredores");
            } else if (emiratesCorredores < jumboCorredores && emiratesCorredores < movistarCorredores) {
                System.out.println("UAE Team Emirates es el equipo con menos corredores: " + emiratesCorredores +
                        " corredores");
            }

            System.out.println("---------------------------------------------------");

            List<String> listaMovistarNombre = new ArrayList<>();
            List<Integer> listaMovistarEdad = new ArrayList<>();
            List<String> listaMovistarPais = new ArrayList<>();
            List<String> listaJumboNombre = new ArrayList<>();
            List<Integer> listaJumboEdad = new ArrayList<>();
            List<String> listaJumboPais = new ArrayList<>();
            List<String> listaEmiratesNombre = new ArrayList<>();
            List<Integer> listaEmiratesEdad = new ArrayList<>();
            List<String> listaEmiratesPais = new ArrayList<>();

            datosParticipante(bufferedReader4, listaMovistarNombre, listaMovistarEdad, listaMovistarPais);
            datosParticipante(bufferedReader5, listaJumboNombre, listaJumboEdad, listaJumboPais);
            datosParticipante(bufferedReader6, listaEmiratesNombre, listaEmiratesEdad, listaEmiratesPais);

            if (listaMovistarNombre.contains("Jonas Vingegaard")) {
                System.out.println("Jonas Vingegaard esta en el equipo de Movistar");
            } else if (listaJumboNombre.contains("Jonas Vingegaard")) {
                System.out.println("Jonas Vingegaard esta en el equipo de JumboVisma");
            } else if (listaEmiratesNombre.contains("Jonas Vingegaard")) {
                System.out.println("Jonas Vingegaard esta en el equipo de UAE Team Emirates");
            }

            System.out.println("---------------------------------------------------");

            double mediaEdadMovistar = mediaEdad(listaMovistarEdad);
            double mediaEdadJumbo = mediaEdad(listaJumboEdad);
            double mediaEdadEmirates = mediaEdad(listaEmiratesEdad);

            if (mediaEdadMovistar > mediaEdadJumbo && mediaEdadMovistar > mediaEdadEmirates){
                System.out.println("movistar es el equipo con la media de edad mas alta");
            } else if (mediaEdadJumbo > mediaEdadMovistar && mediaEdadJumbo > mediaEdadEmirates) {
                System.out.println("JumboVisma es el equipo con la media de edad mas alta");
            } else if (mediaEdadEmirates > mediaEdadJumbo && mediaEdadEmirates > mediaEdadMovistar) {
                System.out.println("UAE Team Emirates es el equipo con la media de edad mas alta");
            }

            System.out.println("---------------------------------------------------");

            if (mediaEdadMovistar < mediaEdadJumbo && mediaEdadMovistar < mediaEdadEmirates){
                System.out.println("movistar es el equipo con la media de edad mas baja");
            } else if (mediaEdadJumbo < mediaEdadMovistar && mediaEdadJumbo < mediaEdadEmirates) {
                System.out.println("JumboVisma es el equipo con la media de edad mas baja");
            } else if (mediaEdadEmirates < mediaEdadJumbo && mediaEdadEmirates < mediaEdadMovistar) {
                System.out.println("UAE Team Emirates es el equipo con la media de edad mas baja");
            }

            System.out.println("---------------------------------------------------");

            List<String> corredoresTotales = new ArrayList<>();
            corredoresTotales.addAll(listaMovistarPais);
            corredoresTotales.addAll(listaJumboPais);
            corredoresTotales.addAll(listaEmiratesPais);

            Set<String> corredoresTotalesSinDupes = new LinkedHashSet<>(corredoresTotales);
            String paisConMasCorredores = "";
            int contadorMaximo = 0;

            for (String pais : corredoresTotalesSinDupes) {
                int contador = 0;
                for (String j : corredoresTotales) {
                    if (j.equals(pais)) {
                        contador++;
                    }
                }
                if (contador > contadorMaximo) {
                    paisConMasCorredores = pais;
                    contadorMaximo = contador;
                }
            }
            System.out.println("el pais con mas corredores es " + paisConMasCorredores + " con un total de " +
                    contadorMaximo + " corredores");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader1.close();
                bufferedReader2.close();
                bufferedReader3.close();
                bufferedReader4.close();
                bufferedReader5.close();
                bufferedReader6.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    private static int contadorDeParticipantes(BufferedReader bufferedReader1) throws IOException {
        String linea;
        int contador = 0;
        while ((linea = bufferedReader1.readLine()) != null) {
            contador++;
            String[] partes = linea.split("\\|");
        }
        return contador;
    }
    private static void datosParticipante(BufferedReader bufferedReader, List<String> listaNombre,
                                          List<Integer> listaEdad,
                                          List<String> listaPais) throws IOException {
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            String[] partes = linea.split("\\|");
            String nombre = partes[0].trim();
            String pais = partes[1].trim();
            Integer edad = Integer.valueOf(partes[2].replace("años", "").replace(".", "").trim());
            listaNombre.add(nombre);
            listaEdad.add(edad);
            listaPais.add(pais);
        }
    }
    private static double mediaEdad(List<Integer> listaEdad) {
        int media = 0;
        for (int i : listaEdad) {
            media += i;
        }
        media = media/listaEdad.size();
        return media;
    }
    public static void crearArchivo(File archivo) {
        if (!archivo.exists()) {
            String regexPunto = "\\.\\w+";
            Pattern patternPunto = Pattern.compile(regexPunto);
            Matcher matcherPunto = patternPunto.matcher(archivo.getName());
            if (matcherPunto.find()) {
                try {
                    archivo.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else archivo.mkdirs();
        } else System.out.println("el archivo " + archivo.getName() + " ya existe");
    }
}