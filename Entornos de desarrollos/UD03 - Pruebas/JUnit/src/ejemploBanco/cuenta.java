package ejemploBanco;

import java.util.PrimitiveIterator;

public class cuenta {
    private String numero;
    private float saldo;

    public cuenta(String numCta, float saldoCta) {
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

    public void mostrarCuenta(){
        System.out.println("el numero de la cuenta es: " + getNumero());
        System.out.println("el saldo de la cuenta es: " + getNumero() + "€");
    }
}