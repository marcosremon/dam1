package ejemploBanco2;

public class cuentaMain2 {
    public static void main(String[] args) {
        cuenta2 cuenta2 = new cuenta2("ES21099865462528660871295",0);
        cuenta2.setSaldo(100);
        cuenta2.ingresarDinero(200);
        System.out.println(cuenta2.getSaldo());
        cuenta2.extraerDinero(50);
        cuenta2.mostrarcuenta2();
        cuenta2.extraerDinero(500);
        cuenta2.mostrarcuenta2();
    }
}
