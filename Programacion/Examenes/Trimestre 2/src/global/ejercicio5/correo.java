package global.ejercicio5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class correo extends CorreoInvalido{
    public correo(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce una direccion de correo electronico: ");
        String email = scanner.nextLine();

        String regexEmail = "[a-zA-Z0-9,;.:_-]+@[\\w0-9,;.:_-]+\\.\\w{2,}";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);

        try {
            if (matcherEmail.find()) {
                System.out.println(matcherEmail.group());
            }else {
                lanzarExcepcion();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void lanzarExcepcion() throws Exception {
        throw new CorreoInvalido("EL CORREO INTRODUCIDO ES ERRONEO");
    }
}
