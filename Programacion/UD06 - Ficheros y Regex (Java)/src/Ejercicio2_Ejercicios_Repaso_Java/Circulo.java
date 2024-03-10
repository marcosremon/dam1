package Ejercicio2_Ejercicios_Repaso_Java;

class Circulo extends Figura{
    double radio;
    double PI = Math.PI;

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return this.PI*(radio*radio);
    }
    @Override
    public double perimetro() {
        return 2*PI*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", PI=" + PI +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" el perimetro del circulo es " + this.perimetro() + " y el area es " + this.area());
    }
}
