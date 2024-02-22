package EnunciadosPruebaEvaluableJUnit;

public class Circulo {

    private double radio;

    public Circulo() {

    }

    public Circulo(double r) {
        this.radio = r;

    }

    public double CalcularAreaCirculo() {
        double resultado = Math.PI * (Math.pow(radio, 2));
        return resultado;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
