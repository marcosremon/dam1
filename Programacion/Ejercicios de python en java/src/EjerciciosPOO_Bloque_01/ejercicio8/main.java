package EjerciciosPOO_Bloque_01.ejercicio8;

public class main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("david", 9999);
        PlazoFijo plazoFijo = new PlazoFijo("david", 5000,"5", 4000);
        PlazoAhorro plazoAhorro = new PlazoAhorro("54456478964684");
        System.out.println(plazoAhorro.toString());
        System.out.println(plazoFijo.toString());
        System.out.println(cuenta.toString());
    }
}
