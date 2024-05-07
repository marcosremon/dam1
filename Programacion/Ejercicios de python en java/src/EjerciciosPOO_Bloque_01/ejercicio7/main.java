package EjerciciosPOO_Bloque_01.ejercicio7;

public class main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        System.out.println(banco.buscarCliente("jose"));
        banco.depositoTotal();
        banco.operar(banco.buscarCliente("jose"));
        banco.depositoTotal();
    }
}
