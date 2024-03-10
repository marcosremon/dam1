package EjerciciosPOO_Bloque_01.ejercicio1;

public class main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("manuel");
        persona.setEdad(17);
        persona.setDni("12345678A");
        System.out.println(persona.toString());
        persona.mayorEdad();
    }
}
