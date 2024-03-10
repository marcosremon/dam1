package EjerciciosPOO_Bloque_01.ejercicio8;

public class PlazoFijo extends Cuenta{
    String plazo;
    double interes;

    public PlazoFijo(String titular, double cantidad, String plazo, double interes) {
        super(titular, cantidad);
        this.plazo = plazo;
        this.interes = interes;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    public double interes() {
        return cantidad*interes/100;
    }

    @Override
    public String toString() {
        return "PlazoFijo: {" +
                "plazo = '" + plazo + '\'' +
                "interes = " + interes +
                "titular = '" + titular + '\'' +
                '}';
    }
}
