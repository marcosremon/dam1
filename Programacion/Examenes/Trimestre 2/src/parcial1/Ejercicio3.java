package parcial1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        File fichero = new File("data/Languages for Data Science.txt");

        BufferedReader bufferedReader = null;
        String linea;
        int contador = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader(fichero));
            while ((linea = bufferedReader.readLine()) != null) {
                String regexFinEnS = "s\\b";
                Pattern patternFinEnS = Pattern.compile(regexFinEnS);
                Matcher matcherFinEnS = patternFinEnS.matcher(linea);
                while (matcherFinEnS.find()){
                    contador++;
                }
            }
            System.out.println(contador);
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
