package ejemploBanco2;

import java.util.PrimitiveIterator;

public class cuenta2 {
    private String numero;
    private float saldo;

    public cuenta2(String numCta, float saldoCta) {
        numero = numCta;
        saldo = saldoCta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numCta) {
        this.numero = numCta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(float importe) {
        saldo = saldo + importe;
    }

    public void extraerDinero(float importe) {
        saldo = saldo - importe;
    }

    public void extraerDinero2(float importe) {
        if (saldo - importe < 0) {
            throw new java.lang.ArithmeticException("saldo negativo");
        } else saldo = saldo - importe;
    }

    public void mostrarcuenta2(){
        System.out.println("el numero de la cuenta2 es: " + getNumero());
        System.out.println("el saldo de la cuenta2 es: " + getNumero() + "€");
    }
}
