package Ejercicio2_Ejercicios_Repaso_Java;

class Rectangulo extends Figura {
    int base;
    int altura;

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.base*this.altura;
    }
    @Override
    public double perimetro() {
        return (this.base*2)+(this.altura*2);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" el perimetro del rectangulo es " + this.perimetro() + " y el area es " + this.area());
    }
}
