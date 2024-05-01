package EjerciciosPOO_Bloque_01.ejercicio9;

public class main {
    public static void main(String[] args) {
        CuentaJoven cuentaJoven = new CuentaJoven("david", 2000, 200, 19);
        System.out.println(cuentaJoven.toString());
        System.out.println(cuentaJoven.getCantidad());
        System.out.println(cuentaJoven.retirarDinero(300));
        System.out.println(cuentaJoven.cantidad);
    }
}
