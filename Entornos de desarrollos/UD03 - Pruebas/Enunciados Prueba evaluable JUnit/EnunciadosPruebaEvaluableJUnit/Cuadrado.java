package EnunciadosPruebaEvaluableJUnit;

public class Cuadrado {

    private double base;

    public Cuadrado() {

    }

    public Cuadrado(double base2) {
        this.base = base2;

    }

    public double CalcularAreaCuadrado() {
        double resultado = (base * base);
        return resultado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}
