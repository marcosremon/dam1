package EnunciadosPruebaEvaluableJUnit;

public class Triangulo {

    private double base;
    private double altura;

    public Triangulo() {

    }

    public Triangulo(double base2, double altura2) {
        this.base = base2;
        this.altura = altura2;
    }

    public double CalcularAreaTriangulo() {
        double resultado = ((base * altura) / 2);
        return resultado;
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
