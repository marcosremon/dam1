package EnunciadosPruebaEvaluableJUnit;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {

    }

    public Rectangulo(double base2, double altura2) {
        this.base = base2;
        this.altura = altura2;
    }

    public double CalcularAreaRectangulo() {
        double resultado = (base * altura);
        return resultado;
    }

    public boolean sonLadosIguales() {
        return base == altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
