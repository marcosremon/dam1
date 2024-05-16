package EjerciciosPOO_Bloque_01.ejercicio2;

public class main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("jose");
        cuenta.setCantidad(125.0);
        System.out.println(cuenta.toString());
        cuenta.ingresarDinero(500.0);
        System.out.println(cuenta.toString());
        cuenta.retirarDinero(50);
        System.out.println(cuenta.toString());
    }
}
