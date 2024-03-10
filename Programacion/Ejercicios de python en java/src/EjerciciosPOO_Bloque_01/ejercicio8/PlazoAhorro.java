package EjerciciosPOO_Bloque_01.ejercicio8;

public class PlazoAhorro {
    String numeroDeCuenta;

    public PlazoAhorro(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    @Override
    public String toString() {
        return "PlazoAhorro: {" +
                "numeroDeCuenta = '" + numeroDeCuenta + '\'' +
                '}';
    }
}
