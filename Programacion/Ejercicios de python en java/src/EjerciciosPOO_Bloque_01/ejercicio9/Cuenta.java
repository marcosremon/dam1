package EjerciciosPOO_Bloque_01.ejercicio9;

public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta: {" +
                "titular = '" + titular + '\'' +
                "cantidad = " + cantidad +
                '}';
    }
    public double ingresarDinero(double cantidad) {
        return this.cantidad += cantidad;
    }
    public double retirarDinero(double cantidad) {
        return this.cantidad -= cantidad;
    }
}
